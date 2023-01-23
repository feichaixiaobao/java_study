package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;

public class sample3_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("中間試験点数を入力:");
        int midtermexam = scan.nextInt();
        System.out.println("期末試験点数を入力:");
        int finalmexam = scan.nextInt();
        if(midtermexam >= 60 && finalmexam >= 60){
            System.out.println("合格");
        }else if((midtermexam + finalmexam) >= 130){
            System.out.println("合格");
        }else if((midtermexam + finalmexam) >= 100 && (midtermexam >= 90 || finalmexam >= 90)){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
