
import Parapunq.Universities;

public class Homework_3 {

    /**Class &amp; Object
     * @autor Arsen Abrahamyan
     */

    public static void main(String[] args) {
        //2
        Book b = new Book();
        Author a  = new Author();

        //3
        Student aa = new Student();
        Universities as = new Universities();


        //4
        City q1 = new City();
        q1.name = "Yrevan";
        q1.population = 10000000;

        City q2 = new City();
        q2.name = "Moscov";
        q2.population = 100000000;

        City q3 = new City();
        q3.name = "New York";
        q3.population = 800000000;

        City q4 = new City();
        q4.name = "Paris";
        q4.population = 730000000;

        //6
        Bank a1 = new Bank();
        a1.address = "Baxramyan erku";
        System.out.println(a1.address);

        //7
        Employe.printEmploye();


    }
}

/**
 * 1. Սահմանել երեք class(Dog, Cat , Horse), որոնք գտնվում են նույն ․java ֆայլում:
 */
class Dog {

}

class Cat {

}

class Horse {

}

/**
 *2. Սահմանել երկու class(Book, Author), որոնք գտնվում են տարբեր .java ֆայլերում և նույն package
 * ում:
 */
class Author{



}


/**
 * 3. Սահմանել երկու class(Student, Universities), որոնք գտնվում են տարբեր .java ֆայլերում և տարբեր
 * package ներում:
 */

class Student{

}


/**
 * 4. Սահմանել City class : fields (name, population ) .
 * Ստեղծել Yerevan, Moscow, New York , Paris քաղաքները համապատասխան
 * մարդաքանակով ։
 */

class City {
    public String name;
    public int population;
}


/**
 * 5. Սահմանել Rectangle class : fields (length, width ) , methods ( calculateArea() ) .
 * Ստեղծել ուղղանկյուն (բարձրություն 5, լայքն 14) և հաշվել ուղղանկյան
 * մակերեսը ։
 */

class Rectangle{
    public int lenght;
    public int width;

    public static void calculateArea (){
        int lenght = 5;
        int width = 14;
        int rectangle = lenght * width;
    }

}


/**
 * 6. Սահմանել Address class : fields (country , region, city , street, house ) .
 * Սահմանել Bank class : fields (bankName, address (type Address))
 */

class Assress{
    public String country;
    public String region;
    public String city;
    public String street;
    public int house;

}

class Bank{
    public String bankName;
    public String address;
}


/**
 * 7. Սահմանել Employe class-ը, որը ունի
 * ● fields (id, name, department, age , gender)
 *
 * ● methods printEmploye() որը տպում է Employe մասին ամբողջական
 * ինֆորմացիա։
 * Ստեղծել 3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են
 * նույն դեպարտամենտում և ունեն նույն տարիքը։
 */
 class Employe{
     public int id;
     public String name;
     public String department;
     public int age;
     public String gender;

     public static void printEmploye(){
         Employe employe1 = new Employe();
         employe1.gender = "Man  ";
         employe1.name = "Garik  ";
         employe1.age = 25;
         employe1.department = "   Hashvapahutyun  ";
         employe1.id = 1254867;

         Employe employe2 = new Employe();
         employe2.gender = "Man ";
         employe2.name = "Suren  ";
         employe2.age = 35;
         employe2.department = "  Dizayner  ";
         employe2.id = 4578965;

         Employe employe3 = new Employe();
         employe3.gender = "Women  ";
         employe3.name = "Mari  ";
         employe3.age = 25;
         employe3.department = "   Hashvapahutyun   ";
         employe3.id = 14578955;

         System.out.print(employe1.gender);
         System.out.print(  employe1.name);
         System.out.print(  employe1.age);
         System.out.print(  employe1.department);
         System.out.println(  employe1.id);

         System.out.print(employe2.gender);
         System.out.print(employe2.name);
         System.out.print(employe2.age);
         System.out.print(employe2.department);
         System.out.println(employe2.id);

         System.out.print(employe3.gender);
         System.out.print(employe3.name);
         System.out.print(employe3.age);
         System.out.print(employe3.department);
         System.out.println(employe3.id);





     }

}
/**
 * 8. Սահմանել Car class-ը, որը ունի
 * ● fields (model, color, currentSpeed (default արժեքը 0), isEngineStart (true or
 * false))
 * ● methods (stopEngine() անջատում է մատոռը , startEngine() միացնում է մատոռը)
 * Ստեղծել Mercedes C203 սև և S505 սպիտակ մակնիշի մեքենաներ․
 */

class Car{
    public String model;
    public String color;
    public int curretSpeed;
    public boolean isEngineStart;

    public static void stopEngine(){
    Car z1 = new Car();
    z1.model = "Mersedes C203";
    z1.color = "Blac";
    z1.isEngineStart = false;

    }
    public static void startEngine (){
        Car z2 = new Car();
        z2.model = "Mersedes S505";
        z2.color = "Whiat";
        z2.isEngineStart = true;
    }

}



//Assessment Test

/* patasxan F;
*1. What is the result of the following class? (Choose all that apply)
*1: public class _C {
*2: private static int $;
*3: public static void main(String[] main) {
*4: String a_b;
*5: System.out.print($);
*6: System.out.print(a_b);
*7: } }
*A. Compiler error on line 1.
*B. Compiler error on line 2.
*C. Compiler error on line 4.
*D. Compiler error on line 5.
*E. Compiler error on line 6.
*F. 0null
*G. nullnull
 */

/*Patasxan E
*2. What is the result of the following code?
*
*
*String s1 = "Java";
*String s2 = "Java";
*StringBuilder sb1 = new StringBuilder();
*sb1.append("Ja").append("va");
*System.out.println(s1 == s2);
*System.out.println(s1.equals(s2));
*System.out.println(sb1.toString() == s1);
*System.out.println(sb1.toString().equals(s1));
*A. true is printed out exactly once.
*B. true is printed out exactly twice.
*C. true is printed out exactly three times.
*D. true is printed out exactly four times.
*E. The code does not compile.
 */

/*Patasxan G
*3. What is the output of the following code? (Choose all that apply)
*
*
*1: interface HasTail { int getTailLength(); }
*2: abstract class Puma implements HasTail {
*3: protected int getTailLength() {return 4;}
*4: }
*5: public class Cougar extends Puma {fl ast.indd 11⁄2 4/2014 Page xxxii
*6: public static void main(String[] args) {
*7: Puma puma = new Puma();
*8: System.out.println(puma.getTailLength());
*9: }
*10:
*11: public int getTailLength(int length) {return 2;}
*12: }
*A. 2
*B. 4
*C. The code will not compile because of line 3.
*D. The code will not compile because of line 5.
*E. The code will not compile because of line 7.
*F. The code will not compile because of line 11.
*G. The output cannot be determined from the code provided.
 */

/*im imanalov F(gorcoxutyuner ka vor der chenk ance)
*4. What is the output of the following program?
*
*
*1: public class FeedingSchedule {
*2: public static void main(String[] args) {
*3: boolean keepGoing = true;
*4: int count = 0;
*5: int x = 3;
*6: while(count++ < 3) {
*7: int y = (1 + 2 * count) % 3;
*8: switch(y) {
*9: default:
*10: case 0: x -= 1; break;
*11: case 1: x += 5;
*12: }
*13: }
*14: System.out.println(x);
*15: } }
*A. 4
*B. 5
*C. 6
*D. 7
*E. 13
*F. The code will not compile because of line 7.
 */


/*Patasxan E F
*5. What is the output of the following code snippet?
*
*
*13: System.out.print("a");
*14: try {
*15: System.out.print("b");
*16: throw new IllegalArgumentException();
*17: } catch (RuntimeException e) {
*18: System.out.print("c");
*19: } finally {
*20: System.out.print("d");
*21: }
*22: System.out.print("e");
*A. abe
*B. abce
*C. abde
*D. abcde
*E. The code does not compile.
*F. An uncaught exception is thrown.
 */

/*Patasxan C
*6. What is the result of the following program?
*
*
*1: public class MathFunctions {
*2: public static void addToInt(int x, int amountToAdd) {
*3: x = x + amountToAdd;
*4: }
*5: public static void main(String[] args) {
*6: int a = 15;
*7: int b = 10;
*8: MathFunctions.addToInt(a, b);
*9: System.out.println(a); } }
*A. 10
*B. 15
*C. 25
*D. Compiler error on line 3.
*E. Compiler error on line 8.
*F. None of the above.
 */

/*im imanalov E (es gorcoxutyunery der chenk ance)
*7. What is the result of the following code?
*
*
*int[] array = {6,9,8};
*List<Integer> list = new ArrayList<>();
*fl ast.indd 11⁄2 4/2014 Page
*list.add(array[0]);
*list.add(array[2]);
*list.set(1, array[1]);
*list.remove(0);
*System.out.println(list);
*A. [8]
*B. [9]
*C. Something like [Ljava.lang.String;@160bc7c0
*D. An exception is thrown.
*E. The code does not compile.
 */

/*
*Tigran jan testeri kesy der chenk ance
 */















