```mermaid
graph TD;
    A[开始] --> B[创建数组 arr: 1, 2, 3, 4, 5];
    B --> C[调用 copyArr 方法并传入 arr];
    C --> D(copyArr);
    D --> E[创建 newArr 数组大小与 arr 相同];
    E --> F[遍历 arr 的元素并复制到 newArr];
    F --> G[返回 newArr];
    G --> H[打印 newArr 数组];
    H --> I[结束];