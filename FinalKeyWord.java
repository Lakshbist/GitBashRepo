// FINAL KEYWORD

// Final Keyword - This will make any class , methods and variables constants
// that means
// once the value is assigned it cannot be reassigned.
// It basically denotes constants that when applied the value cannot be changed.

/**
 * important points about final key word
 * the value of the final variable cannot be changed
 * A final method cannot be overridden
 * A final class cannot be inherited
 */

/**
 * Some terms related to final key word
 * blank final variable - if a variable is declared final and not assigned any
 * value then it is called blank final variable.
 * 
 * 
 * However it must be initilized inside a constructor otherwise we will get a CT
 * error , once after it is initilized inside a construtor it's value cannot be
 * modified
 */
// Example for blank final variable
/**
 * class BlankFinalVar {
 * final int a; // Final instance variable declared blank
 * 
 * BlankFinalVar() { // Creating a constructor
 * a = 10; // Initializing the final variable inside a constructor
 * }
 * 
 * void display() { //creating a method
 * 
 * System.out.println("Inside the method");
 * System.out.println(a);
 * }
 * 
 * public static void main(String args[]) {
 * 
 * BlankFinalVar obj = new BlankFinalVar();
 * obj.display(); // calling the method
 * }
 * }
 */

// Uninitialized static blank final variable
// Here if a variable is declared both static and final and not initialized it
// then it is called USBFV

// Example to illustrate the Uninitilized Static final blank variable

/**
 * class StaticBlankFinalVar {
 * // creat a blank final var
 * final int a;
 * 
 * // initialize it will constructor
 * 
 * StaticBlankFinalVar() {
 * a = 20; //A final blank instance uninitialized variable must be initilized
 * only inside a constructor.
 * }
 * 
 * // Create a blank static final var
 * 
 * static final int b;
 * 
 * // initilize it with static block
 * 
 * static {
 * b = 40; //A static final blank uninitilized variable must be initilized only
 * inside a static block
 * }
 * // Create method for printing values stored in a and b
 * void display() {
 * System.out.println(a);
 * System.out.println(b);
 * }
 * 
 * public static void main(String args[])
 * 
 * {
 * StaticBlankFinalVar obj = new StaticBlankFinalVar();
 * obj.display();
 * 
 * }
 * }
 */

// A final keyword can be used with instance variables , static variables and
// local variables.

// The local variable must be marked as final before java 8 , if accessed inside
// a anonymous class or local inner class but after java V8 it is not necessary

// Final keyword in case of StringBuffer
/*
 * class FinalKeyword {
 * public static void main(String args[]) {
 * // final StringBuffer string = new StringBuffer("Lakshmi");
 * // System.out.println(string);
 * // string.append("Bist");
 * // System.out.println(string);
 * 
 * // string = new StringBuffer("Sumathi"); // the final variable cannot be
 * // referred to a new variable
 * 
 * 
 * // System.out.println(string);
 * 
 * // above you can notice that on the usuage of final keyword the behaviour of
 * // StringBuffer has not changed , it is still a mutable string
 * // But what has changed is that the string variable which is final cannot
 * // refer to any other variable once it is made final
 * //The changes are reflected in the memory level.
 * 
 * 
 * // StringBuffer str = new StringBuffer("Sumathi");
 * //str.append("Bist");
 * //System.out.println(str);
 * //str = new StringBuffer("Lakshmi"); //Here the same variable str can be used
 * // as new reference for another value
 * 
 * // System.out.println(str);
 * 
 * //So a final keyword in case of StringBuffer the variable cannot be used once
 * again to refer to a new value.
 * }
 * }
 */

/*
 * ///Final keyword in case of immutable String Class ////
 * 
 * /*
 * class FinalWithStrings {
 * public static void main(String args[]) {
 * String str = "Lakshmi";
 * str = str.concat("Bist");
 * System.out.println(str);
 * final String str1 = "Sumathi";
 * 
 * //str1 = str1.concat("Bist");
 * 
 * 
 * // in case of String class once the variable is decalred final then the
 * 
 * // value of the variable cannot be changed because of the nature of
 * immutability.
 * // Since in case of immutable strings if the value is mutated then the
 * reference
 * // will point to another object that is created in heap so the once the
 * variable is
 * // declared final and assigned some value then that value cannot be changed.
 * //System.out.println(str1);
 * }
 * }
 */

// FINAL KEYWORD IN CASE OF ARRAYS//
