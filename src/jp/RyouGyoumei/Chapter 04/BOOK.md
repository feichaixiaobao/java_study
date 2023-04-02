```mermaid
graph LR
A[Book] -->|has title:String| B(title)
A[Book] -->|has author:String| C(author)
A[Book] -->|has price:double| D(price)
A -->|can update price| E(updatePrice)
A -->|can get title| F(getTitle)
A -->|can get author| G(getAuthor)
A -->|can get price| H(getPrice)
I[System] -->|output| E
I -->|output| H
B -->|Java Programming| J(book1)
C -->|John Smith| K(book1)
D -->|180| L(book1)
B -->|Data Structures| M(book2)
C -->|Jane Doe| N(book2)
D -->|90| O(book2)
J -->|update price| E
M -->|update price| E
E -->|price > 150| P(150)
E -->|price > 100| Q(100)
P -->|change price to 150| D
Q -->|change price to 100| D
J -->|get title| F
J -->|get author| G
J -->|get price| H
M -->|get title| F
M -->|get author| G
M -->|get price| H
