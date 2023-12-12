import java.util.*;

public class ControlStatements {

    public static void main(String args[]) {
        // Conditional statements - These are the statements which are used to control
        // the flow of execution
        // based on certain conditions.
        // Also called control statements.
        // Java supports various types of these statements below are some of them -

        // 1. if statement
        /*
         * 1.syntax -
         * if(condition) {
         * set of statements that should be executed once the given condition is
         * satisfied.
         * }
         * 
         * here if the condition is satisfied them the statements inside the block will
         * be executed
         * if the condition is not satisfies then the control will move out of the flow
         * and continue
         * with further execustion
         */
        // illustration of if statement
        /*
         * int a = 10;
         * int b = 20;
         * if (a < b) {
         * int result = a + b;
         * System.out.println("The total value of a and b is  " + " " + result);
         * }
         * if (a > b) { //In this case the statements inside the block will not be
         * executed since the condition is not satisfied
         * System.out.println("the statements will not be executed");
         * }
         */

        /*
         * 2. if else statement
         * Syntax - if(condition) {
         * set of statements to be execusted if the condition is true
         * }
         * else {
         * set of statements to be execusted if the above if part condition is not
         * satisfied /
         * the statements in case if the condition is not true.
         * }
         * 
         * In this case if the given condition is not satisfied in the if part the
         * control will execute
         * the statements which are there in the else part unlike moving out of flow .
         */
        // Below is the programming illustration of if else -

        /*
         * int a = 10;
         * int b = 5;
         * if (a > b) {
         * System.out.println("a is greater");
         * }
         * else {
         * System.out.println("b is greater");
         * 
         * }
         */

        /*
         * 3. if else ladder - in this case along with if and else statement , any
         * number of
         * if else statements can be used like a ladder
         * 
         * Syntax - if (condition) {
         * body
         * }
         * else if(condition) {
         * body
         * }
         * else if (condition) {
         * body
         * }
         * .
         * .
         * .
         * else {
         * body
         * }
         * 
         */

        /*
         * int num1 = 10;
         * int num2 = 20;
         * int num3 = 40;
         * if (num1 > num2 && num1 > num3) {
         * System.out.println("num1 is greater");
         * } else if (num2 > num1 && num2 > num3) {
         * System.out.println("num2 is greater");
         * } else if (num3 > num1 && num3 > num1) {
         * System.out.println("num3 is greater");
         * } else {
         * System.out.println("all the numbers are equal");
         * }
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n / 2 == 0 || n > 20) {
            if (n >= 2 || n <= 5)
                System.out.println("Not weird");

        }

        else {
            System.out.println("Weird");
        }
        sc.close();

    }

}
