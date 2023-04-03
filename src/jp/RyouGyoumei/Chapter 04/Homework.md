```mermaid
graph TD;
A[Test] --> B(TestInstance1Count);
B --> C[Initialize to 10];
C --> D["Print 'TestInstance1Count = 10'"];
A --> E(Main);
E --> F[Create Test instance 1];
F --> G(TestInstance1Count);
G --> H[Initialize to 10];
H --> I["Print 'TestInstance1Count = 10'"];
E --> J[Create Test instance 2];
J --> K(TestInstance2Count);
K --> L[Initialize to 9];
L --> M["Print 'TestInstance2Count = 9'"];
K --> N[Increase to 10];
N --> O["Print 'TestInstance2Count = 10'"];
N --> P[Increase to 11];
