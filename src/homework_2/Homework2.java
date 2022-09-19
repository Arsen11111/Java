package homework_2;

public class Homework2 {
    public static void main(String[] args) {
        //Java Type Casting

        /*
         *14. Ստեղծել int aa = 7 և long bb փոփոխականներ,
         *կատարել Cast գործողություն aa ->bb; bb և տպել console -ում․
         */
        int aa = 7;
        long bb = (long) aa;
        System.out.println(bb);

        /*
         *15. Ստեղծել int myInt = 7 և double myDouble փոփոխականներ,
         *կատարել Cast գործողություն myInt -> myDouble; myDouble և տպել console -ում․
         */

        int myInt = 7;
        double myDouble = (double) myInt;
        System.out.println(myDouble);

        /*
         *16. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
         *կատարել Cast գործողություն dd -> ii; ii և տպել console -ում․
         */

        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(ii);

        /*
         *17. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
         *կատարել Cast գործողություն ff ->gg; gg և տպել console -ում․
         */

        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);

        /*
         *18․ Գտնել սխալը և ուղղել․
         *long max = 3123456789;(long max = 9223772036854775807)
         *double d = 1000_.00; sxaly _ nshan a
         *char i =’i’; char j=’j’; char ij = i +j; char ij = i + j sa sxale
         *int 7a = 8; sxaly 7-na
         *long h = h + 8; long h = (h + sa sxale) 8
         *int n, m = 11; m = n; m-y nshvac chi inch tipa
         */

        method1(12,15);
        method2();
        method3();
        method4((char) 1);
        method5(1,2);
        methodBody();
    }

        // Java Methods


    /**
     *1. Write a method which .has two input parameters type int and return 0.
     * @return
     */
    public static int method1 (int a ,int s) {


            return 0;
        }


        /**
         *
        *2. Write a method which has not input parameters and returns nothing.
         *
         */
        public static void method2 (){

        }

        /**
        *3. Write a method which .has a boolean input parameters and print “Hello World”.
         */
         public static boolean method3(){

             System.out.println("Hello World");
             return true;
         }

        /**
        *4. Write a method which .has a char input parameter and return this input parameter.
         * @param k
         */
         public static char method4 (char k){
             return k;
         }

        /**
        *5. Write a method which .has two float input parameters and return one of them.
         * @param a
         * @param b
         */
         public static float method5 (float a, float b){
             return  a;
         }


        /**
        *6. Write a method which .has call itself inside body(recursion).
         *
         */
        public static void methodBody (){
            System.out.println("Anun Azganun Hayranun");
//            methodBody();
        }



    }

