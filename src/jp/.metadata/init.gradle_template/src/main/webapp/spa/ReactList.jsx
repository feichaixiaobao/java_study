/* React 一覧コンポーネント */
const ReactList = () => {
   
	const savedForm = window._ReactSearchForm ??= {name:'', releaseDate:''}; // 一覧戻り時表示用の条件保存 (null 合体代入)
	const [itemList, setItemList] = useState([]); // ステートフックで jsx で使用する値を定義 (set は setter を使う)
	useEffect(() => {handleInit()}, []); // レンダー後の処理 (第2引数は検知対象で空配列の場合はこのコンポーネント本体のみ)

	// 初期表示 → 検索 API 呼び出し   
	const handleInit = async() => {
		document.title = 'React の場合 (一覧コンポーネント)';
		id_head_link_jsp.href = '../item/list';
		id_head_link_react.href = '../spa/react.html';
		id_head_link_vue.href   = '../spa/vue.html';
		handleSearch();
  	};

	// 検索 API 呼び出し   
	const handleSearch = async() => {
		const { data } = await axios.get('search?' + params(id_form));
		typeof data === 'string' ? id_message.textContent = data : setItemList(data);
  	};
  	
  	// 検索ボタンクリック、フォーム Enter → 検索 API 呼び出し
	const handleSubmit = async(e) => {
		e.preventDefault(); // デフォルトサブミット抑止
		id_message.textContent = null;
		handleSearch();
  	};

	// 検索条件変更イベント → 件数取得 API 呼び出し   
	const handleChange = async( {target} ) => {
		id_message.textContent = (await axios.get('count?' + params(id_form))).data;
		savedForm[target.name] = target.value;
  	};
	
	// 削除ボタンクリック → 削除 API 呼び出し (削除は状態変更操作のため post、axios により CSRF ヘッダ自動追加)
	const handleDelete = async(id) => {
		id_message.textContent = (await axios.post('delete', 'id=' + id)).data || 'ℹ️ 削除しました。';
		handleSearch();
  	};
  	
	return (
<HashRouter>
	<form onSubmit={handleSubmit} id="id_form" method="get" className="d-sm-flex flex-wrap align-items-end">
		<label className="form-label me-sm-3">製品名</label>
		<div className="me-sm-4">
			<input className="form-control" type="search" name="name" autoFocus 
				onInput={handleChange} defaultValue={savedForm.name}/>
		</div>
		<label className="form-label me-sm-3">発売日</label>
		<div className="me-sm-4">
			<input className="form-control w-auto mb-3 mb-sm-0" type="date" name="releaseDate" 
				onInput={handleChange} defaultValue={savedForm.releaseDate}/>
		</div>
		<button type="submit" className="btn btn-secondary px-5">検索</button>
		<Link to="/edit/0" className="btn btn-secondary px-5 ms-auto">新規登録</Link>
	</form>
	<p className="text-end mt-4 me-1 mb-2">検索結果 {itemList.length} 件</p>
	<table className="table table-striped table-dark">
		<thead>
			<tr className={itemList.length == 0 ? 'd-none' : ''}>
				<th>製品名</th>
				<th>発売日</th>
				<th className="text-center">顔認証</th>
				<th>メーカー</th>
				<th className="text-center">操作</th>
			</tr>
		</thead>
		<tbody>
	{itemList.map(item => (
			<tr key={item.id}>
				<td>{item.name}</td>
				<td>{item.releaseDate}</td>
				<td className="text-center">{item.faceAuth ? '○' : ''}</td>
				<td>{item.companyName}</td>
				<td className="text-center">
					<Link to={'/edit/' + item.id} className="btn btn-secondary me-1">変更</Link>
					<button type="button" onClick={() => handleDelete(item.id)} className="btn btn-warning">削除</button>
				</td>
			</tr>
	))}
		</tbody>
	</table>
</HashRouter>
	);
}
