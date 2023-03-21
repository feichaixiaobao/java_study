/*
 * 这是一个汉诺塔问题的 Java 程序，使用递归的方式解决。
在主函数中创建了一个 Tower 对象，调用其中的 move 方法开始解决问题。
move 方法接收四个参数，分别表示盘子的数量 num，以及三个柱子 a、b、c。
当盘子数量为1时，直接将 a 柱子上的盘子移动到 c 柱子上。
否则，先将 num-1 个盘子从 a 柱移到 b 柱（利用 c 柱作为辅助），
再将剩余的一个盘子从 a 柱移到 c 柱，最后将 b 柱上的 num-1 个盘子移到 c 柱上（利用 a 柱作为辅助）。
递归结束条件即为 num = 1。
程序中使用 System.out.println 输出每一步移动的过程。
 */

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(3, 'a', 'b', 'c');
    }
}

class Tower {
    public void move(int num , char a, char b, char c) {
        if (num == 1) { // 只有一个盘子时，直接将其从 A 移到 C
            System.out.println(a + "->" + c);
        } else {
            move(num - 1, a, c, b); // 将 A 上的 num-1 个盘子经由 C 移到 B
            System.out.println(a + "->" + c); // 将 A 上的最后一个盘子移动到 C
            move(num -1, b, a, c); // 将 B 上的 num-1 个盘子经由 A 移到 C
        } 
    }
}