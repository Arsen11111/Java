//package homework_6;
//
//public class Stataments {
//    public static void main(String[] args) {
//       Stataments a = new Stataments();
//       a.exe1(22);
//       Stataments b = new Stataments();
//       b.exe2(145);
//       Stataments c = new Stataments();
//       c.exe3(18);
//       Stataments d = new Stataments();
//       d.exe4(6);
//       Stataments e = new Stataments();
//       e.exe5(48);
//
//
//
////        exe2();
////        exe3();
////        exe4();
////        exe5();
////        exe6();
////        exe7();
////        exe8();
//    }
//
//    /**
//     * check whether the integer x is even or odd.
//     * @param x
//     */
//
//    public void exe1(int x) {
//
//        if (x % 2 == 0) {
//            System.out.println("x = couple");
//
//        } else {
//            System.out.println("x = odd ");
//        }
//    }
//
//    public void exe2(int y) {
//        /**
//         * check whether an integer is positive or negative.
//         * @param y
//         */
//
//
//        if (y >= 0) {
//            System.out.println("p-@ a positive number");
//        } else {
//            System.out.println("p-@ a negative number");
//        }
//    }
//
//    public  void exe3 (int e){
//        /**
//         * check the given integer, either less than 8 and greater than 5
//         * Or smaller than 20 and larger than 15.
//         * @param e
//         */
//
//
//        if ((e < 8 && e > 5)||(e < 20 && e > 15)) {
//            System.out.println("e-@ is less than 8 and greater than 5");
//        } else {
//            System.out.println("e-@ is less than 20 and greater than 15.");
//        }
//    }
//
//    public void exe4 (int u) {
//        /**
//         * verify that an integer is divisible by 5 and 7
//         * without balance.
//         * @param u
//         */
//
//        if ((u % 5 == 0) && (u % 7 == 0)) {
//            System.out.println("u-@ is divisible by 5 and 7 without a remainder");
//        } else {
//            System.out.println("u-@ is not divisible by 5 and 7 without a remainder");
//        }
//    }
//
//    public  void exe5 (int o) {
//        /**
//         * check whether the second digit of a three-digit number is 7 or not.
//         */
//
//        if (o / 10 % 10 == 7) {
//            System.out.println("the second number of the three-digit number is 7");
//        } else {
//            System.out.println("The second number of the three-digit number is not 7");
//        }
//    }
//    public  void exe6 (int z,int t) {
//        /**check (x,y) coordinates is K(0,5)
//         *in the district or not?
//         * @param z
//         * @param t
//         */
//
//        boolean z3 = x7 >= -5 && x7 <= 5;
//        boolean z4 = y7 >= -5 && y7 <= 5;
//        if (z>= -5 && z <= 5 ) {
//            System.out.println("The given coordinates are in the region 0, 5");
//        } else {
//            System.out.println("The given coordinates are not in the range 0, 5");
//        }
//    }
//
//    public static void exe7 () {
//        int q1 = 12;
//        int q2 = 45;
//        int q3 = 5;
//        if (q1 > q2 && q1 > q3) {
//            System.out.println("mec tivy q1");
//        } else if (q2 > q3) {
//            System.out.println("mec tivy q2-na");
//        } else {
//            System.out.println("mec tivy q3-na");
//        }
//
//    }
//    public static void exe8 ()  {
//        int d1 = 2020;
//        if (d1 % 4 == 0 && d1 % 100 != 0 || d1 % 400 == 0) {
//            System.out.println("tvial tarin hamarvume nahanj");
//        } else {
//            System.out.println("hakarak bolor depqerum nahanj chi");
//
//        }
//    }
//
//}
