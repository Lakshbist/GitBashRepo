// How to Print a simple array
/**
 * class ArraysConcept {
 * public static void main(String args[]) {
 * int array1[] = {10 , 20 , 40};
 * System.out.println(array1[0]);
 * }
 * }
 */

// How Print a 1-D Array By taking Inputs
/**
 * import java.util.*;
 * class OneDarrayInput {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Size of the array");
 * int size = sc.nextInt();
 * String array[] = new String[size];
 * System.out.println("Enter the elements of the array");
 * for(int i=0 ; i<size ; i++) {
 * array[i] = sc.next();
 * }
 * System.out.println("The elements of the array are");
 * for(int i=0 ; i<size ; i++) {
 * System.out.println(array[i]);
 * 
 * }
 * sc.close();
 * }
 * 
 * }
 */

// Demonstration of 2D array when the values are already known
/**
 * class TwoDarray {
 * public static void main(String args[]) {
 * int nums[][] = new int[3][3];
 * nums[0][0] = 5;
 * nums[0][1] = 3;
 * nums[0][2] = 4;
 * nums[1][0] = 6;
 * nums[1][1] = 3;
 * nums[1][2] = 7;
 * nums[2][0] = 9;
 * nums[2][1] = 4;
 * nums[2][2] = 2;
 * for(int i=0 ; i<3 ; i++) {
 * for(int j=0 ; j<3 ; j++) {
 * System.out.print(nums[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Demonstration of 2-D Array by taking the inputs
/**
 * import java.util.*;
 * class TwoDarrayInput {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of the 2-D Array");
 * int rows = sc.nextInt();
 * int columns = sc.nextInt();
 * int elements[][] = new int[rows][columns];
 * System.out.println("Enter the elements of the array");
 * for(int i=0 ; i<rows ; i++) {
 * for(int j=0 ; j<columns ; j++) {
 * elements[i][j] = sc.nextInt();
 * }
 * }
 * System.out.println("The elements of the array are");
 * for(int i=0 ; i<rows ; i++) {
 * for(int j=0 ; j<columns ; j++) {
 * System.out.print(elements[i][j]);
 * }
 * System.out.println();
 * }
 * sc.close();
 * }
 * }
 */

// Other methods to store the elements in 2 D array
/**
 * class OtherMethodsForTwoDarray {
 * public static void main(String args[]) {
 * String arr[][] = {{"Lakshmi" , "Sumathi" , "Manoj"} ,
 * {"Sapna" , "Pavithra" , "Santoshi"}
 * };
 * for(int i=0 ; i<=1 ; i++) {
 * for(int j=0 ; j<=2 ; j++) {
 * System.out.print(arr[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Jagged array implementation
/**
 * class Jarray {
 * public static void main(String args[]) {
 * int arr[][] = {{2,3,4,5} ,
 * {4,3,7,2,8},
 * {9,6,1,5,6,2,4},
 * {0,2,5}
 * };
 * for(int i=0 ; i<4 ; i++) {
 * for(int j=0 ; j<arr[i].length ; j++) {
 * System.out.print(arr[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// One More Way to represent jagged array

/**
 * class OneMoreWayToRepJarray {
 * public static void main(String args[]) {
 * int arr[][] = new int[4][];
 * //This below are number of columns as per the mentioned size above
 * arr[0] = new int[5];
 * arr[1] = new int[4];
 * arr[2] = new int[3];
 * arr[3] = new int[2];
 * //Here we have to create one more array to store the elements
 * 
 * int arr1[][] = {{1,2,3,4,5},
 * {6,7,8,9} ,
 * {4,5,8} ,
 * {9,7}
 * 
 * };
 * 
 * for(int i=0;i<4 ; i++) {
 * //Here the entire length of i is taken since the number of
 * //colums are not equal or fixed but the number of rows are fixed.
 * for(int j=0 ; j<arr1[i].length ; j++) {
 * System.out.print(arr1[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Enhanced for loops for one - D array
/**
 * class EnhancedForLoops {
 * public static void main(String args[]) {
 * int arr[] = {2 , 3 , 4 , 5 , 6};
 * for(int nums : arr) {
 * System.out.print(nums + " ");
 * }
 * }
 * 
 * }
 */

// Program to represent the enhanced with string type of data
/*
 * class EnhancedStringdata {
 * public static void main(String args[]) {
 * String names[] = {"Lakshmi" , "Nagarekha" , "Nalina" , "Devika"};
 * for(String name : names) {
 * System.out.println(name + "  ");
 * }
 * }
 * }
 */

// Program to print the elements of the

// Enhanced for loops for 2 D array
/**
 * class EnhancedForLoops {
 * public static void main(String args[]) {
 * int arr[][] = {{1,2,3,4} , {3,4,5,6} , {7,8,9,5}};
 * for(int n[] : arr) {
 * for(int m : n) {
 * System.out.println(m);
 * }
 * }
 * }
 * }
 */

// One More way to print the elements of two dimensional array

/**
 * class TwoDarray {
 * public static void main(String[] args) {
 * String array[][] = { {"Lakshmi" , "Bist"} , {"Sumathi" , "Bist"} ,
 * {"Manoj","Bist"}};
 * 
 * System.out.println(array[0][0]);
 * System.out.println(array[0][1]);
 * }
 * }
 */
