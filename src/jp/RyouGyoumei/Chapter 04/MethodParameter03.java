public class MethodParameter03 {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4},{0,1}};
        myTools01 A01 = new myTools01();
        A01.arr(arr);
    }
}

class myTools01{
    public void arr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}