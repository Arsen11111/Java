package homework_9;

import java.util.Scanner;

public class StringStringBuilder {
    /**
     * Write method String concatenation with given parameter:
     *
     * @return
     */
    static String StringConcatenation() {

        String hellon = "Hello ";
        String word = "Word";
        int one = 1;
        System.out.println(hellon + word);
        System.out.println(1 + 2 + hellon);
        System.out.println(one + 2 + hellon);
        System.out.println(hellon + 1 + 2 + word);


        return hellon + word + one;
    }

    /**
     * Write method Stringbuilder concatenation with given parameter:
     *
     * @return
     */
    static boolean concatenation() {
        Scanner sc = new Scanner(System.in);
        StringBuilder hellon = new StringBuilder();
        StringBuilder word = new StringBuilder();

        System.out.println("Hellon" + "Word");
        System.out.println(1 + 2 + "Hellon");
        System.out.println("1" + 2 + "Hellon");
        System.out.println("Hello" + 1 + 2 + "Word");


        return true;
    }


    static String StringLiteral(String literal) {


        return literal;

    }

    /**
     * revers
     *
     * @return
     */
    static String revers(String str) {

        char ch[] = str.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }
        return rev.toString();
    }

    static int countSubString(String line, String token) {


        return line.split(token,-1).length -1;
    }

    /**
     * String capital letter
     *
     * @return capital
     */
    static String capitalLetter() {
        Scanner sc = new Scanner(System.in);

        String capital = sc.nextLine();

        return capital.toUpperCase();

    }

    /**
     * StringBuilder capital letter
     *
     * @return letter
     */
    static StringBuilder capitalLetterWithStringBuilder() {
        Scanner sc = new Scanner(System.in);
        StringBuilder lettrer = new StringBuilder(sc.nextLine().toUpperCase());


        return lettrer;
    }

    /**
     * silence the line by writing the symbol "*" instead of less symbols;
     * @return
     */
    static StringBuilder ifStringLengthLessThan20AppendSymbol() {
        Scanner sc = new Scanner(System.in);
        StringBuilder k = new StringBuilder(20);
        k.append(sc.nextLine());
        for (int i = 0; i < k.length(); i++) {
            if (k.length() < 20) {
                k.append("*");
            }


        }

        return k;
    }

    /**
     * remove all "a" characters
     * @return
     */
    static String deleteSymbolFromString() {
        Scanner sc = new Scanner(System.in);
        String del = "We are living in an yellow submarine. We does not have anything";
        char[] bb = del.toCharArray();
        StringBuilder a = new StringBuilder();
        int count = 0;
        for (int i = 0; i < bb.length; i++) {
            if (bb[i] == 'a') {
                continue;
            }
            a.append(bb[i]);
        }


        return a.toString();
    }


    /**
     * replaces all "a" characters with "*" using String.
     *
     * @return
     */
    static String replaceCharToSymbolInString(){

        Scanner sc = new Scanner(System.in);
        String del = "We are living in an yellow submarine. We does not have anything";
        char[] bb = del.toCharArray();
        StringBuilder a = new StringBuilder();
        int count = 0;
        for (int i = 0; i < bb.length; i++) {
            if (bb[i] == 'a') {
                a.append("*");
                continue;
            }
            a.append(bb[i]);
        }


        return a.toString();

    }

    /**
     * find the longest word in the text
     * @return
     */
    static String returnLongestWordFromString() {
        String s = "We are living in an yellow submarine. We does not have anything";
        String[] v = s.split(" ");
        int max = v[0].length();
        String l = v[0];
        for (int i = 1; i < v.length - 1; i++) {

            if (v[i].length() > max) {
                max = v[i].length();
                l = v[i];

            }

        }

        return l;
    }

    /**
     * find at which index the character String c was first encountered;
     * @return
     */

    static int findFirstIndexOfSymbolInString() {
        String line = "We are living in an yellow submarine. We don&#39;t have anything";
        String c = "a";

        return line.indexOf(c, 0);

    }

    /**
     * find and print the substring containing the nth index from the beginning of the given string
     *
     * @param n
     * @return
     */
    static String printLineTillN(int n) {
        String a = "We are living in an yellow submarine";

        return a.substring(0, n + 1);


    }

    /**
     * find and print the substring containing the nth index from the beginning of the given string,
     * With StringBuilder.
     *
     * @param n
     * @return
     */
    static String printLineTillNWithStringBuilder(int n) {
        StringBuilder a = new StringBuilder("We are living in an yellow submarine");

        return a.substring(0, n + 1);
    }

    /**
     * check if the given String parameter is empty and not null;
     * @param line
     * @return
     */

    static boolean stringIsNotEmptyOrNull(String line) {
        return line != null && !line.equals("");

    }

    /**
     *split the sentence according to ',' and finds the longest word.
     * @return
     */
    static String returnLongestWordFromStringBySplitingViaSymbol() {
        String s = "We are, living in, an yellow, submarine. We does not, have anything";
        String[] v = s.split(",");
        int max = v[0].length();
        String l = v[0];
        for (int i = 1; i < v.length - 1; i++) {

            if (v[i].length() > max) {
                max = v[i].length();
                l = v[i];

            }

        }

        return l;
    }











    public static void main(String[] args) {
//        System.out.println(StringConcatenation());
//        System.out.println(concatenation());
//        System.out.println(StringLiteral("We \nare \nliving \nin"));
//        System.out.println(revers("car"));
        System.out.println(countSubString("We are living in an yellow submarine. We does not have anything", "in"));
//        System.out.println(capitalLetter());
//        System.out.println(capitalLetterWithStringBuilder());
//        System.out.println(ifStringLengthLessThan20AppendSymbol());
//        System.out.println(deleteSymbolFromString());
//        System.out.println(replaceCharToSymbolInString());
//        System.out.println(returnLongestWordFromString());
//        System.out.println(findFirstIndexOfSymbolInString());
//        System.out.println(printLineTillN(7));
//        System.out.println(printLineTillNWithStringBuilder(8));
//        System.out.println(stringIsNotEmptyOrNull(""));
//        System.out.println(returnLongestWordFromStringBySplitingViaSymbol());





    }
}