//import java.util.*;

//public class Loops {
//public static void main(String args[]) {
// For loops
/*
 * Basically loops is a case where a same activity is repeated again and again
 * based on certain conditions the activity will be repeated
 * 
 * There are three types of loops in java
 * 
 * 1. for loop
 * 2. while loop
 * 3. do while loop
 */
/*
 * For loop -
 * 
 * 1. Syntax - for(initilization ; condition ; updation) {
 * body of the loop
 * }
 * 
 * for is the keyword
 * body of the loop is the place where the statements will be executed once the
 * conditions
 * are satisfied.
 */

// Below is a programming example to illustrate the usuage of loops

// Program to print @ as per the predefined times
/*
 * int a = 10;
 * for (int i = 0; i <= a; i++) {
 * System.out.println("@" + " ");
 * }
 * //System.out.println();
 */

// Printing the * as per the number of times the user chooses to repeat it.

/*
 * Scanner sc = new Scanner(System.in);
 * System.out.
 * println("Enter the number of times the operations is to be repeated");
 * int a = sc.nextInt();
 * for (int i = 0; i < a; i++) {
 * System.out.println("*");
 * }
 * sc.close();
 */

// Program to print tables of any random number as given by user

/*
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the number whose tables you need");
 * int table_num = sc.nextInt();
 * for (int a = 0; a <= 20; a++) {
 * // System.out.println("The tables of " + " " + table_num + " " + " is" : );
 * System.out.println(table_num + " " + "X" + " " + a + " " + " = " + " " +
 * table_num * a);
 * }
 * sc.close();
 */

// Nested for loop
/*
 * in these types of for loops one for loop is enclosed within another for loop
 * the outside for loop will be called outer for loop and the inside one will be
 * called inner for loop
 * 
 * Syntax -
 * 
 * for(initialization ; condition ; updation) //outer loop{
 * for(initialization ; condition ; updation) //inner loop {
 * body of the loop
 * }
 * }
 */

// Program for the illustration of nested for loops

/*
 * int a = 6;
 * int b = 7;
 * for (int i = 0; i <= a; i++) {
 * for (int j = 0; j <= b; j++) {
 * System.out.print("Lakshmi" + " ");
 * }
 * System.out.println();
 * }
 */

// Program to illustrate the usuage of nested for loops by taking inputs from
// user

/*System.out.println("Enter the number of rows");
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
System.out.println("Enter number of columns");
int columns = sc.nextInt();
System.out.println("Your pattern is ");
System.out.println();
for (int i = 0; i <= rows; i++) {
    for (int j = 0; j <= columns; j++) {
        System.out.print("*" + " ");
    }
    System.out.println();
}
sc.close();

}

} */

//*********************************************************************************** */

/*while loop - This is another type of while loop in java 
 *  while loop in java is also used for repeating same  tasks as per the given conditions .
 * in while loops the condition will be checked first and then the statements are executed.
 * 
 * Syntax = while(condition) 
 *    {
 *     
 *        Body of the loop or the statements which are to be executed when the condition 
 *        is satisfied.
 *    }
 */

//Program to illustrate the usuage of while loop
/**class WhileLoop {
    public static void main(String args[]) {

        int a = 15;
        while (a <= 20) {
            System.out.println("Lakshmi");
            a = a + 1;

        }

    }
} */

//Another program to illustrate the usuage of while loop by taking input from user
//Program to print tables of any random numbers by using while loop
/**
 * import java.util.*;
 * 
 * class WhileLoopBytakingInputs {
 * public static void main(String args[]) {
 * 
 * System.out.println("Enter a number whose table you need to be printed");
 * Scanner sc = new Scanner(System.in);
 * int num = sc.nextInt();
 * int a = 1;
 * while (a <= 10) {
 * System.out.println(num + "X" + a + "=" + num * a);
 * a = a + 1;
 * }
 * sc.close();
 * 
 * }
 * }
 */

// *****************************************************************************************
// */

/*
 * dowhile loop - in this type of loop the statements inside the body of the
 * loop will be executed
 * at least once even though the condition is not satisfied , that means first
 * the body of the loop
 * will be executed then the conditions will be checked
 * 
 * syntax - do {
 * body of the loop
 * }
 * while(condition);
 */

// Program to illustrate the usuage of do while loop

/*class DoWhileLoop {
    public static void main(String args[]) {
        int a = 10;
        do {
            System.out.println("Lakshmi");
            a = a - 1;

        } 
        while (a >= 1);
    }
} */

//Program to print the tables of any random number using do while loop
/**import java.util.Scanner;

class DoWhileLoop {
    public static void main(String args[]) {
        System.out.println("Enter a number for which the tables have to be printed");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int iterating_num = 1;
        do {

            System.out.println(number + "X" + iterating_num + "=" + iterating_num * number);
            iterating_num++;
        } while (iterating_num <= 10);
        sc.close();

    }

}*/

//***************************************************************************************8 */
//Program to find the factorial of a number using for loop and by taking input from user
/**import java.util.*;

class FactorialOfNumber {
    public static void main(String args[]) {
        System.out.println("Enter the number whose factorial must be printed");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of" + " " + num + " " + "is" + " " + fact);
        sc.close();
    }
} */

//Program to find the factorial of a number using while loop by taking user input
/**
 * import java.util.*;
 * 
 * class FactorialUsingWhile {
 * public static void main(String args[]) {
 * System.out.println("Enter the number whose factorial ust be printed");
 * Scanner sc = new Scanner(System.in);
 * int num = sc.nextInt();
 * int fact = 1;
 * int a = 1;
 * while (a <= num) {
 * fact = fact * a;
 * a++;
 * }
 * System.out.println("The factorial of " + " " + num + " " + "Is" + " " +
 * fact);
 * sc.close();
 * }
 * }
 */

// Program to find the factorial of a number using dowhile loop

/**
 * class FactorialUsingDoWhile {
 * public static void main(String args[]) {
 * int num = 4;
 * int fact = 1;
 * int iterating_num = 1;
 * do {
 * fact = fact * iterating_num;
 * 
 * iterating_num++;
 * 
 * } while (iterating_num <= num);
 * 
 * System.out.println(fact);
 * }
 * }
 */

// Program to print the sum of first 'n' natural numbers using while loop

/*class SumOfnNaturalNumberUsingWhile {
    public static void main(String args[]) {
        int sum = 0;
        int iterationvar = 0;
        while (iterationvar <= 10) {
            sum = sum + iterationvar;
            iterationvar++;
        }
        System.out.println(sum);
    }

}*/

//Program to find the fibonacci series of given number using loops
/**import java.util.*;

class FiboUsingForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int no_of_terms = sc.nextInt();
        System.out.println("Enter the first number and second numbers");
        int firstnum = sc.nextInt();
        int secondnum = sc.nextInt();
        int thirdterm = 0;

        for (int i = 0; i <= no_of_terms; i++) {
            thirdterm = firstnum + secondnum;
            System.out.println(thirdterm + " ");
            firstnum = secondnum;
            secondnum = thirdterm;
        }

        sc.close();
    }
} */

//

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
        console.close();

        int num = 12345;
        System.out.println(num % 10);
    }

}