<!-- Vue 編集コンポーネント -->
<script setup>

	const router = useRouter(); // Vue Router
	const id = useRoute().params.id;
	const isInsert = id == 0;
	const item = ref({});
	const companySelect = ref([]);
	onMounted(() => {handleInit()});

	// 初期表示 → 取得 API 呼び出し   
	const handleInit = async() => {
		document.title = 'Vue の場合 (編集コンポーネント)';
		id_head_link_jsp.href = '../item/update?id=' + id;
		id_head_link_react.href = '../spa/react.html#/edit/' + id;
		id_head_link_vue.href   = '../spa/vue.html#/edit/' + id;
		id_message.textContent = null;
		if (!isInsert) {
			const { data } = await axios.get('select?id=' + id);
			if (typeof data === 'string') {
				id_message.textContent = data; // エラーメッセージ String
				router.push('/');
				return;
			} else {
				item.value = data; // ItemForm json
			}
		}
		companySelect.value = (await axios.get('select-company')).data;
		id_name.focus(); // テンプレートでの autofocus だと初期値セットで onfocus が動作しないため
  	};
  	
  	// フォーム Enter → 登録・更新 API 呼び出し
	const handleSubmit = async(e) => {
		// @submit.prevent しているため e.preventDefault() 不要
		id_submit_button.disabled = true;
		const res = await axios.post(isInsert ? 'insert' : 'update', params(id_form)); // axios が CSRF ヘッダ自動追加
		const errorMessage = res.data;
		if (errorMessage) {
			if (res.status == 200) {
				id_message.textContent = errorMessage; // 入力エラーなどのアプリエラー
				id_submit_button.disabled = false;
			} else {
				id_message.textContent = errorMessage; // 削除済みなどの 2xx システムエラー (2xx 以外は axios interceptors)
				router.push('/');
			}
		} else {
			id_message.textContent = `ℹ️ ${isInsert ? '登録' : '更新'}しました。`;
			router.push('/');
		}
  	};

	// 変更イベント → 入力チェック API 呼び出し   
	const handleChange = async() => {
		id_message.textContent = (await axios.post('validate', params(id_form))).data; // エラーが無い場合は空
  	};

</script>
<template>
	<form @submit.prevent="handleSubmit" id="id_form" method="post">
		<input type="hidden" name="id" :value="item.id"/>
		<div class="mb-3">
			<label class="form-label">製品名</label> <span class="badge bg-danger">必須</span>
			<input class="form-control" type="text" name="name" required id="id_name" :value="item.name"
				onfocus="this.setSelectionRange(99,99)"
				@input="handleChange">
		</div>
		<div class="mb-3">
			<label class="form-label">発売日</label> <span class="badge bg-danger">必須</span>
			<input class="form-control w-auto" type="date" name="releaseDate" :value="item.releaseDate"
				@input="handleChange" required>
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" name="faceAuth" id="faceAuth" class="form-check-input"
				@input="handleChange" :checked="item.faceAuth">
			<label class="form-check-label" for="faceAuth">顔認証</label>
		</div>
		<div class="mb-5">
			<label class="form-label">メーカー</label>
			
			<select name="companyId" class="form-select w-auto">
			
			
				<option v-for="com in companySelect" :value="com.id" :selected="item.companyId == com.id"
					>{{com.companyName}}</option>
			</select>
		</div>
		<router-link to="/" class="btn btn-secondary px-5 me-1">戻る</router-link>
		<input id="id_submit_button" type="submit" class="btn btn-warning px-5" :value="isInsert ? '登録' : '更新'"/>
	</form>
</template>


