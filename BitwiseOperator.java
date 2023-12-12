public class BitwiseOperator {
    public static void main(String args[]) {
        // The bitwise operators are used to perform operations in bit level
        // They are usually used in manupulation of bits.
        // They are also used when performing update and query operations in binary
        // indexed trees
        // Below are the types of bitwise operators

        /*
         * 1. Bitwise And - Denoted by &
         * It returns the bit by bit values of And input
         * The result will be 1 if both the bits are 1 else it will be 0
         */

        // Illustration of the Bitwise & operator

        /*
         * int a = 10; //Binary value of 10 = 1010
         * int b = 10; //Binary value of 10 = 1010
         * int c = a & b; // The result in binary will be 1010
         * System.out.println(c); // hence the output will be 10 only.
         */
        // It will return the output in decimal format

        /*
         * 2. Bitwise OR operator = denoted by |
         * This operator will return the bit by bit values of OR input
         * The result will be 1 if either or both of the values are 1 and 0 if both are
         * 0's
         */

        // Below is the illustration

        /*
         * int a = 10; //Binary value of 10 = 1010
         * int b = 5; // Binary value of 5 = 0101
         * int c = a | b; The result in binary will be 1111
         * System.out.println(c); // and the output will be 15
         */

        /*
         * 3.Bitwise not operator - denoted by ~ (tilde) symbol
         * This operator acts like an inverter , it will convert all the 0's into 1's
         * and vice versa
         * and returns the 1's compliment representation but the complier will return
         * 2's compliment.
         */

        // Below is the illustration
        /*
         * int a = 5; // Binary value of 5 will be 0101
         * int b = ~a; // The 2's compliment of 5 is -6
         * System.out.println(b); // Hence the output will be -6
         * 
         */

        /*
         * 4. XOR operator - Denoted by ^
         * This operator will return 1 if either of the value is 1/0 and will
         * return 0 if both the values are identical
         */
        // Below is the demonstration of XOR operator

        int a = 10; // The binary value is 1010
        int b = 7; // The binary value is 0111
        int c = a ^ b; // The result in binary form is 1101
        System.out.println(c); // Hence the result will be 13

    }

}
