package homework_6;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        if (false){
            System.out.println("Arsen");
        }
        Loops n = new Loops();
        n.exe1();
        System.out.println("Hello Word");
        n.exe1();
    }
    public  void exe1() {
        int x = 0;
        while (x++ < 10) {
            if (x == 8) {
                break;
            }
        }

        System.out.println(x);

    }

    public static void exe2() {
        /**
         * Gtnel sxaly ev uxel
         */

        //2.1
        int x = 2;
        int y = 5;
        while (x < 10) {
            y++;
            x++;
        }
        System.out.println(x);
        System.out.println(y);


        //2.2
        int x1 = 15;
        while (x1 > 10) {
            x1--;
        }
        System.out.println(x1);

    }
    public static void exe3() {
        //3
        int x = 1;
        while (x <= 200) {

            System.out.println(x++);
        }
    }
    public static void exe4() {
        //4?
        int y = 123;

        if (y / 100 == 1) {

            System.out.println(y / 100);
        }
    }
    public static void exe5() {
        //5
        int x5 = 1;
        int y1 = 0;
        while (x5 < 5 && y1 < 10) {
            x5++;
            y1++;
        }

        System.out.println(x5 + y1);

    }
    public static void exe6() {

        //6?

        int g = 7;
        int gQarakusi = g * g;

        System.out.println(gQarakusi);

    }
    public  void exe7() {

        //7
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);
        int o = 0;
        for (int u = 1; u <= n; u++) {
            if (u%5==0){
                o = o + u;
            }
        }
        System.out.println(o);
    }
    public  void exe8() {

        //8

        int q1 = 30;
        long q2 = 1;
        for(int q3 =10;q3<=q1;q3++){
            if(q3%2==0){
                q2 = q2*q3;
            }
        }
        System.out.println(q2);
    }
    public static void exe9() {

        //9
        int i = 2;
        int i1 = 10;
        System.out.println(i+i1/2);


    }
    public static void exe10 (int number) {
        //10
        int sum = 0;
        while (sum > 0) {
            sum +=number%10;
            number /= 10;
        }
        
    }
}
