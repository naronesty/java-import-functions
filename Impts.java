/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Impts.java
 *  Execution:    java Impts
 *
 *  A class containing some universally useful functions
 *  Functions:
 *  Impts.printArray(array) // Prints an array
 *  Impts.randInt(int0, int1) // Returns a random integer >= int0 and < int1
 *  Impts.isNumber(string) // Returns true if a string is a number, false otherwise
 *  Impts.createIntegerArray(int0 ... int) // Returns an int[] from a list of int arguments
 *  Impts.reverseArray(array) // Returns an array that is the parameter reversed
 *  Impts.sumArray(array) // Returns the sum of all elements in an array
 *  Impts.pyDivide(int0, int1) // Returns the result of python-style int -> double division of two ints
 *  Impts.getCommon (array0, array1) // Returns an array of the common elements in two arrays
 *  Impts.max(array) // Returns the max value in an array
 *  Impts.min(array) // Returns the min value in an array
 *  Impts.divisors(int) // Returns an array of factors of a number
 *  Impts.append(array, object) // Returns the array with the object appended: object can be another array
 *  Impts.countFreq(object, array) // Returns the frequency of an object in an array: object CANNOT be another array
 *  Impts.titleCase(string) // Returns the string converted to title notation
 *  Impts.removeChars(string0, string1) // Returns a copy of string0 with the chars in string1 removed
 *  Impts.remDupe(list) // Returns a copy of the parameter list with no duplicates
 *  Impts.delDupe(list) // Deletes duplicates in a list
 *  Impts.reverseList(list) // Reverses a list
 *  Impts.indexOfAll(list0, list1) // Returns a list of the start indexes of where list1 appears in list0
 ******************************************************************************/

import java.util.*;
import java.lang.*;

public class Impts {

    public static void printArray(int[] arry) { // Prints an integer array
        for (int j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arry) { // Prints a string array
        for (String j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arry) { // Prints a double array
        for (double j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arry) { // Prints a two dimensional integer array
        for (int[] ints : arry) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(String[][] arry) { // Prints a two dimensional string array
        for (String[] ints : arry) {
            for (String aString : ints) {
                System.out.print(aString + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int randInt(int lower, int upper)  { // Returns a random integer >= int0 and < int1
        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static boolean isNumber(String s) { // Returns true if a string is a number, false otherwise
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }

    public static int[] createIntegerArray (int ... args){ // Returns an int[] from a list of int arguments
        int count = args.length;
        int[] arr = new int[count];
        count = 0;
        for (int n : args){
            arr[count] = n;
            count ++;
        }
        return arr;
    }

    public static String[] reverseArray(String[] a) { // Returns an array that is the parameter reversed
        String[] ret = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static int[] reverseArray(int[] a) { // Returns an array that is the parameter reversed
        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static double[] reverseArray(double[] a) { // Returns an array that is the parameter reversed
        double[] ret = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static int sumArray(int[] a) { // Returns the sum of all elements in an array
        int ret = 0;
        for (int i = 0; i < a.length; i ++) {
            ret += a[i];
        }
        return ret;
    }

    public static double sumArray(double[] a) { // Returns the sum of all elements in an array
        double ret = 0;
        for (int i = 0; i < a.length; i ++) {
            ret += a[i];
        }
        return ret;
    }

    public static double pyDivide(int dividend, int divisor) { // Returns the result of python-style int -> double division of two ints
        double x = (double) dividend;
        double y = (double) divisor;
        return x / y;
    }

    public static int[] getCommon(int[] a, int[] b) { // Returns the common items in two int arrays
        ArrayList<Integer> commons = new ArrayList<Integer>();
        for (int i: a) {
            for (int j: b) {
                if (i == j) {
                    commons.add(i);
                }
            }
        }
        int [] common = new int[commons.size()];
        for (int i = 0; i < commons.size(); i++)
            common[i] = commons.get(i);
        return common;
    }

    public static String[] getCommon(String[] a, String[] b) { // Returns the common items in two String arrays
        ArrayList<String> commons = new ArrayList<String>();
        for (String i: a) {
            for (String j: b) {
                if (i == j) {
                    commons.add(i);
                }
            }
        }
        String[] common = new String[commons.size()];
        for (int i = 0; i < commons.size(); i++)
            common[i] = commons.get(i);
        return common;
    }

    public static int max(int[] n) { // Returns the max in an int array
        int maxim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] > n[i - 1]) maxim = n[i];
        }
        return maxim;
    }

    public static double max(double[] n) { // Returns the max in a double array
        double maxim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] > n[i - 1]) maxim = n[i];
        }
        return maxim;
    }

    public static int min(int[] n) {
        int minim = n[0];
        for (int i = 1; i < n.length; i++) { // Returns the min in an int array
            if(n[i] < n[i - 1]) minim = n[i];
        }
        return minim;
    }

    public static double min(double[] n) { // Returns the min in a double array
        double minim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] < n[i - 1]) minim = n[i];
        }
        return minim;
    }

    public static int[] divisors(int n) { // Returns an array of an int's factors
        int[] x = {0};
        if (n == 0) return x;

        int count = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] nFactors = new int[count + 1];
        count = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                nFactors[count] = i;
                count++;
            }
        }
        nFactors[nFactors.length - 1] = n;
        return nFactors;
    }

    public static int[] append(int[] array, int n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static double[] append(double[] array, double n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static String[] append(String[] array, String n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static boolean[] append(boolean[] array, boolean n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static String[] append(String[] array1, String[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static int[] append(int[] array1, int[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static double[] append(double[] array1, double[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static boolean[] append(boolean[] array1, boolean[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static int countFreq(int num, int[] array) { // Returns the frequency of a number in an int[]
        int ret = 0;
        for (int i: array) {
            if (num == i) ret++;
        }
        return ret;
    }

    public static int countFreq(String str, String[] array) { // Returns the frequency of a string in a String[]
        int ret = 0;
        for (String i: array) {
            if (str == i) ret++;
        }
        return ret;
    }

    public static int countFreq(double number, double[] array) { // Returns the frequency of a double in an double[]
        int ret = 0;
        for (double i: array) {
            if (number == i) ret++;
        }
        return ret;
    }

    public static String titleCase(String str) { // Returns a String in title notation
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String removeChars(String str, String remove) { // Returns a copy of string0 with the chars in string1 removed
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            if (!remove.toLowerCase().contains(str.substring(i, i + 1).toLowerCase())) ret += str.substring(i, i+1);
        }
        return ret;
    }

    public static ArrayList<String> remDupe(ArrayList<String> list) { // Returns a copy of the parameter list with no duplicates
        Collections.sort(list);
        ArrayList<String> listo = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (!listo.contains(list.get(i))) {
                listo.add(list.get(i));
            }
        }
        return listo;
    }

    public static void delDupe (ArrayList<String> list) { // Deletes duplicates in a list
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            String last = list.get(i);
            if (last.equals(list.get(i + 1))) {
                list.remove(i + 1);
                i--;
            }
        }
    }

    public static ArrayList<Integer> indexOfAll(ArrayList<Integer> list, ArrayList<Integer> sublist) { // Returns a list of the start indexes of where list1 appears in list0
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < list.size() - sublist.size() + 1; i++) {
            if (list.subList(i, i + sublist.size()).equals(sublist)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void reverseList(ArrayList<String> list) { // Reverses a list
        for (int i = 0; i < list.size() / 2; i++) {
            Collections.swap(list, i, list.size() - (i + 1));
        }
    }

    public static void main(String[] args) {

//        int[][] c = {{1, 2, 3}, {4, 5, 6}, {1, 3, 5}};
//        printArray(c);
//
//        String[] x = new String[]{"a", "b", "c"};
//        printArray(reverseArray(x));
//
//        int[] y = new int[]{1, 2, 3, 3, 3};
//        int[] z = new int[]{4, 5, 6};
//
//        printArray(reverseArray(y));
//
//        printArray(createIntegerArray(1, 2, 3, 4));
//        String[] a = {"a", "e", "i"};
//        String[] b = {"i", "o", "u"};
//        printArray(getCommon(a, b));
//
//        printArray(append(z, y));
//        System.out.println(countFreq(3, y));
//
//        System.out.println(titleNotation("HoLa"));
//        System.out.println(removeChars("Hello good sir", "hr")); // "Hello good sir" with an english accent
          List<String> list0 = Arrays.asList("The", "Fox", "Had", "Had", "The", "Bad", "bad", "Bad", "Bad");
          ArrayList<String> listo = new ArrayList<String>(list0);
//          System.out.println(remDupes(listo));
        reverseList(listo);
        System.out.println(listo);
    }
}