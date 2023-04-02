import java.util.Scanner;

public class Find {
    public static int find(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符串数组（以空格分隔）：");
        String[] arr = scanner.nextLine().split("\\s+");

        System.out.print("请输入要查找的字符串：");
        String target = scanner.nextLine();

        int index = find(arr, target);
        if (index != -1) {
            System.out.println("目标字符串 " + target + " 的索引为：" + index);
        } else {
            System.out.println("未找到目标字符串 " + target);
        }

        scanner.close();
    }
}
