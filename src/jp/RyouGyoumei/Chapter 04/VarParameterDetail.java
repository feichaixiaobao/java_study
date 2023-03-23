import java.util.Arrays;

public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Test test01 = new Test();
        test01.f1(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Test {
    public void f1 (int...nums){

    }
}