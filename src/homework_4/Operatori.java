package homework_4;

public class Operatori {

    public static void main(String[] args) {

        /**Arithmetic Operators
         * 1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում հետևյալը․
         */
        int a = 6;
        int b = 8;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        /**
         * 2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել console -ում հետևյալը.
         */

        double c = 6.4;
        double d = 0.03;

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

        /**
         * 3․ Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
         */

        int x = 2*((5+3)*4-8);
        int y = 2*5+3*4-8;
        System.out.println(x);
        System.out.println(y);

        /**Unary Operators
         *4․ Ստեղծել 2 փոփոխական(int e = 10, int f = -88, boolean n1 = true), տպել console -ում հետևյալը․
         * 1)-e
         * 2)-f
         * 3)+e
         * 4)-e +92
         * 5)!n1
         * 6)!(!n1)
         * 7)e++
         * 8)--f
         * 9) int x1 = 3;
         * int y1 = ++x1 * 5 / x1-- + --x1;
         * System.out.println("x1 is"  + x1);
         * System.out.println("y1 is " + y1);
         */

        int e = 10;
        int f = -88;
        boolean  n1 = true;
        //4.1
        System.out.println(-e);
        //4.2
        System.out.println(-f);
        //4.3
        System.out.println(+e);
        //4.4
        System.out.println(-e +92);
        //4.5
        System.out.println(!n1);
        //4.6
        System.out.println(!(!n1));
        //4.7
        System.out.println(e++);
        //4.8
        System.out.println(--f);
        //4.9
        int x1 = 3;
        int y1 = ++x1*5 / x1-- + --x1;
        System.out.println("x1 is" + x1);
        System.out.println("y1 is" + y1);

        /**Assignment Operator
         * 5․ Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
         *
         * 1) int x = (int)1.0;
         * 2) short y = (short)1921222;
         * 3) System.out.print(2147483647+1);
         * 4) long y = (x=3);
         * 5) boolean y = false;
         * boolean x = (y = true);
         * System.out.println(x);
         */

        int x2 = (int)1.0;
        short y2 = (short)1921222;
        Long y3 = Long.valueOf((x2=3));
        boolean y4 = false;
        boolean x3 = (y4 = true);

        //5.1
        System.out.println(x2);
        //5.2
        System.out.println(y2);
        //5.3
        System.out.println(2147483647+1);
        //5.4
        System.out.println(y3);
        //5.5
        System.out.println(x3);

        /**Relational Operators
         *6․ Ստեղծել 2 փոփոխական(int aa = 10, int bb = 20), տպել console -ում հետևյալը․
         * 1) System.out.println(x < y);
         * 2) System.out.println(x >= y);
         * 3) System.out.println(x <= y);
         * 4) System.out.println(x > y);
         */

        int aa = 10;
        int bb = 20;

        //6.1
        System.out.println(aa < bb);
        //6.2
        System.out.println(aa <= bb);
        //6.3
        System.out.println(aa >= bb);
        //6.4
        System.out.println(aa > bb);


        /**Additional tasks
         * 7. Գտնե և ուղղելլ սխալը․
         * 1) float y = 2.1;
         *
         * 1 -  float y = 2.1f
         *
         * 2) byte x = 5;
         * byte y = 10;
         * byte z = x + y;
         *
         * 2- byte z = (byte) x + y;
         *
         * 3) short x = 10;
         * short y = 3;
         * short z = x * y;
         *
         * 3- short z = (short) x + y
         *
         * 4) long x = 10;
         * int y = 5;
         * y = y * x;
         *
         * 4- long x = 10l;
         * int y = 5;
         * y = (int) y * x;
         *
         * 8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով
         * փոխել։
         * 8- int a = 10;
         * int s = 5;
         * a=s;
         * s=a;
         *
         * 9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
         * 8-um arden tenc grelem;
         *
         * 10․ Գրել ծրագիր, որը հաշվում է 1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         * public static void main(String[] args) {
         * System.out.println(sun (100));
         * }
         *  public static int sun(int n){
         *         if(n == 1)
         *             return 1;
         *         return n + sun(n - 1);
         *
         *    }
         */



        /**Bitwise &amp; Logical Operators
         * 7. Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում հետևյալը․
         * 1) a & b
         * 2) a ^ b
         * 3) a | b
         * 4) ~a
         * 5) true || (a < 4)
         * 6) (b >= 6) || (++a <= 7);
         * 7) (a < b)?a:b
         * 8) b^b
         */

        int a1 = 8;
        int b1 = 3;

        //7.1
        System.out.println(a1&b1);

        //7.2
        System.out.println(a1^b1);

        //7.3
        System.out.println(a1 | b1);

        //7.4
        System.out.println(~a1);

        //7.5
        System.out.println(true || (a1 < 4));

        //7.6
        System.out.println((b1>=6) || (++a1 <= 7));

        //7.7
        System.out.println((a1<b1)?a1:b1);

        //7.8
        System.out.println(a1^b1);

        /**8.Shift Operator
         * 1․ Տպել console -ում հետևյալը․
         * 1) 10 << 2
         * 2) -10 << 3
         * 3) 20 >> 2
         * 4) 15 >> 3
         * 2․ Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
         */

        //1.2
        System.out.println(10 << 2);

        //1.2
        System.out.println(-10 << 3);

        //1.3
        System.out.println(20>>2);

        //1.4
        System.out.println(15>>3);

        //2
        int o =7;
        o*=16;
        o*=8;










    }

}

