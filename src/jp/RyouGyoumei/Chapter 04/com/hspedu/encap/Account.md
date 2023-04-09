```mermaid
graph LR
A[Account] -- 私有属性 --> B[name, balance, password]
A -- 公共方法 --> C[setName, setBalance, setPassword, getName, getBalance, getPassword]
C -- 调用 --> B
C -- 调用 --> D[输出属性值]
D -- 输出 --> E[控制台]

F[AccountTest] -- 创建对象 --> A
F -- 调用方法 --> C
C -- 调用 --> B
C -- 调用 --> D
D -- 输出 --> E
