public class Migong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        // 初始化地图，map[i][j] = 1 表示墙，map[i][j] = 0 表示路
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 设置障碍物
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("\n=====当前地图的情况如下=====");
        // 打印出当前地图的情况
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        Out out01 = new Out();
        // 从起点 (1,1) 开始找路
        out01.findWay(map, 1, 1);

        System.out.println("\n=====找路的情况如下=====");
        // 打印出找路后地图的情况
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Out {
    // 返回值为 boolean 类型，表示是否能找到出口
    public boolean findWay(int[][] map , int i, int j){
        if (map[6][5] == 2) { // 如果当前点是终点，则返回 true，表示已经找到了出口
            return true;
        } else {
            if (map[i][j] == 0) { // 如果当前点没有走过
                map[i][j] = 2; // 标记当前点为已走过
                if (findWay(map, i + 1, j)) { // 向下走
                    return true;
                } else if (findWay(map, i, j + 1)){ // 向右走
                    return true;
                } else if (findWay(map, i - 1, j)){ // 向上走
                    return true;
                } else if (findWay(map, i, j - 1)){ // 向左走
                    return true;
                } else {
                    map[i][j] = 3; // 如果当前点无法通行，则标记为已走过但不能通行
                    return false;
                }
            } else {
                return false; // 如果当前点已经走过或是墙，则返回 false，表示不能再走这个点
            }
        }
    }
}

/*
 * 该程序的编译思路如下：
·定义Migong类和Out类。
·在main方法中创建一个8行7列的二维数组map,作为地图。并初始化地图，将地图的边界设
为墙，内部留空。
·设置障碍物，将(3,1)和(3,2)这两个点标记为墙。
·打印出当前地图的情况。
·创建一个0ut对象0ut01。
调用findWay方法，从起点(1,1)开始找路。
·打印出找路后地图的情况。
·findWay方法返回值为boolean类型，表示是否能找到出口。如果能找到，
则返回true;否则返回false.
·在findWay方法中，首先判断当前点是否为终点，如果是，则返回true,表示已经找到了出
口；否则，如果当前点没有走过，则标记当前点为已走过（值为2），然后依次尝试向下、向
右、向上、向左走一步，如果某个方向能够走通（即递归调用findWay方法返回true),则表
示已经找到了出口，直接返回tue;如果所有方向都不能走通，则标记当前点为已走过但不能通
行（值为3)，然后返回false,表示无法找到出口。
·如果当前点已经走过或是墙（值为1或2），则返回flse,表示不能再走这个点。
·找路结束后，打印出找路后地图的情况。
 * 
 */