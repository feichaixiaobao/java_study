
package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;

public class sample3_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("好きな鮨（すし）を選択,1：まぐろ　2：えび　3：こはだ");
        int sushinumber = scan.nextInt();
        switch(sushinumber){
            case 1 :
            System.out.print("まぐろ");
            break;
            case 2 :
            System.out.print("えび");
            break;
            case 3 :
            System.out.print("こはだ");
            break;
        }
    }
}
