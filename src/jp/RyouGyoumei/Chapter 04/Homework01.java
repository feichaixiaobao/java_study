public class Homework01 {
    public static void main(String[] args) {
        B01 b01 = new B01();
        double[] arr = {1.0,4.7,3.2,8.9};
        Double res = b01.max(arr);
        if (res != null) {
            System.out.println("arr的最大值=" + res);
            
        } else {
            System.out.println("arr的输入有误");
        }
    }
}

class B01 {
    /**
     * 计算一个double类型数组的最大值
     * @param arr double类型数组
     * @return 数组的最大值
     */
    public Double max(double[] arr){
        if(arr != null && arr.length > 0){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    } else {
        return null;
    }
    }
}