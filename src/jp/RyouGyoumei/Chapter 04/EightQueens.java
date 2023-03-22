public class EightQueens {
    private static final int BOARD_SIZE = 8;
    private int[] queens; // 存储每一行皇后所在的列
    private int solutionCount; // 存储解的数量

    public EightQueens() {
        queens = new int[BOARD_SIZE];
        solutionCount = 0;
    }

    public void placeQueens() { // 尝试在每一行放置皇后
        placeQueens(0); // 从第0行开始放置
        System.out.println("There are " + solutionCount + " solutions.");
    }

    private void placeQueens(int row) { // 在当前行放置皇后
        if (row == BOARD_SIZE) { // 所有皇后都已经放置好了，则打印当前解并返回
            printBoard();
            solutionCount++;
            return;
        }
        for (int column = 0; column < BOARD_SIZE; column++) { // 尝试在当前行中的所有列放置皇后
            queens[row] = column; // 放置皇后
            if (isValid(row, column)) { // 如果当前位置合法，则递归到下一行
                placeQueens(row + 1);
            }
        }
    }

    private boolean isValid(int row, int column) { // 判断当前位置是否有效
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[i] - column); // 计算两个皇后在同一列或者同一对角线上的距离
            if (diff == 0 || diff == row - i) { // 如果距离为0（同一列）或者等于行号之差（同一对角线），则说明当前位置无效
                return false;
            }
        }
        return true; // 当前位置有效
    }

    public void printBoard() { // 打印棋盘
        System.out.println("Solution " + (solutionCount+1));
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (queens[i] == j) { // 在皇后所在的位置打印Q
                    System.out.print("Q ");
                } else { // 在空白位置打印.
                    System.out.print(". ");
                }
            }
            System.out.println(); // 换行
        }
    }

    public static void main(String[] args) {
        EightQueens eq = new EightQueens();
        eq.placeQueens(); // 解决问题
    }
}