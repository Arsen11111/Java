package homework_8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {

    /**
     * print positive elements of int[] n array:
     */
    static int[] positiveElements() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0)
                System.out.println(arr[j]);
        }

        return arr;
    }

    /**
     * print array elements in reverse order
     *
     * @param
     */
    static short[] inReverseOrder() {

        short[] x = {1, 25, 10, 185, 198};
        for (int i = x.length - 1; i >= 0; i--) {
            short u = x[i];
            System.out.println(u);

        }

        return x;
    }

    /**
     * print the largest element of long[] l array:
     *
     * @return
     */
    static Long[] theLargestElement() {
        Scanner sc = new Scanner(System.in);

        Long[] max = {Long.valueOf(11), Long.valueOf(30), Long.valueOf(-10), Long.valueOf(89), Long.valueOf(125)};
        Long u = max[0];
        for (int i = 1; i < max.length; i++) {
            if (max[i] > u) {
                u = max[i];
            }
        }
        System.out.println(u);


        return new Long[]{u};

    }

    /**
     * print the smallest element of float[] f array:
     *
     * @return
     */
    static float theSmallestElement() {
        Scanner sc = new Scanner(System.in);
        float[] min = {12, 1, 25, 125, 47};
        float k = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i] < k) {
                k = min[i];
            }
        }
        System.out.println(k);
        return k;
    }


    /**
     * Write a method that moves the array elements into another array.
     *
     * @return
     */
    static int[] movingFromArrayToArray() {
        Scanner ok = new Scanner(System.in);

        int[] array1 = {14, 25, 8, 9};

        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];


        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
        return array2;
    }

    /**
     * Write two arrays of the same size, write the sum in another array.
     *
     * @return
     */
    static int[] arraysAmount() {
        Scanner ok = new Scanner(System.in);
        int[] arr1 = {1, 5, 7};
        int[] arr2 = {2, 5, 9};
        int[] arr3 = new int[3];
        for (int i = 0; i < arr1.length; i++) {

            arr3[i] = arr1[i] + arr2[i];

        }

        return arr3;
    }

    /**
     * counts how many times the number k is found in the elements of the array.
     *
     * @return
     */
    static int[] findTheSameSlementsOfAnArray() {
        Scanner ok = new Scanner(System.in);
        int y = 0;
        int[] s = {12, 14, 57, 59, 53, 19, 5, 5, 456, 5};
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 5) {
                y++;

            }

        }

        System.out.println(y);

        return new int[0];
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(positiveElements()));
        System.out.println(Arrays.toString(inReverseOrder()));
        System.out.println(Arrays.toString(theLargestElement()));
        System.out.println(Arrays.toString(new float[]{theSmallestElement()}));
        System.out.println(Arrays.toString(movingFromArrayToArray()));
        System.out.println(Arrays.toString(arraysAmount()));
        System.out.println(Arrays.toString(findTheSameSlementsOfAnArray()));


        }
    }




