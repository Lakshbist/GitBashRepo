public class Assignmentoperator {
    public static void main(String args[]) {
        // '=' symbol is known as assignment operator in java.
        // This operator is mainly used assign the values to a variables
        // The operator workes from right to left , based on the type of data the value
        // will be assigned
        // from right to left.

        // Below is the illustration of the assignment operator

        /**
         * int a = 10; // here the value 10 is been assigned to the variable a of the
         * type integer
         * System.out.println(a);
         */

        // Compound assignment operators
        // In this type of operator along with the = sign the other operators like
        // +,-,*,/ are used.
        // for example += , -= , *= , /=
        // However a+=10 means a=a+10 so both are similar

        // Below is th illustration

        int a = 10;
        int b = a += 10;
        int c = a *= 10;
        int d = a /= 10;
        int e = a -= 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // At each point the value of a will be changed and stored seperately.
        // So the value of a will be keep changing
    }
}
