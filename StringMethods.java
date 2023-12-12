// public class StringMethods {

// public static void main(String args[]) {
// String str = "My name is Lakshmi bist";
// tring str1 = "LAKSHMI";
// 1.To upper case method - converts a string to upper case

// String str1 = str.toUpperCase();
// System.out.println(str1);

// 2. toLowerCase method - used to convert a string to lower case.
// System.out.println(str.toLowerCase());

// 3. equals() method - it is used in the comparision of two strings , it will
// compare the values of
// two strings irrespective of their location.
// System.out.println(str.equals(str1));

// 4. equalsIgnoreCase() - it is used in the comparision of two strings , it
// will compare the values of
// two strings irrespective of their location and case.
// System.out.println(str.equalsIgnoreCase(str1));

// 5.substring(starting index value , ending index value) - This method is used
// to find the
// substring of a given string.whether the first parameter is the starting index
// and second parameter
// is the ending index number.
// System.out.println(str.substring(11, 18));

// 6. length() - This method is used to find the length of a given string , it
// will return the integer value.
// System.out.println(str.length());

// 7. concat() = This method will be combine two strings
// System.out.println(str.concat(str1));

// 8. contains() = This method will check whether a particular part of 
//the given string is present in the main string or nor
// System.out.println(str.contains("shmi"));

// 9. charAt(index number) - this method will check which character is
// present in the particular index given
// System.out.println(str1.charAt(5));

// 10.hashcode() -
// System.out.println(str.hashCode());

// 11. indexOf("any one character of string") - this method will return the
// index of any one of the given character
// System.out.println(str1.indexOf("H"));

// 12. split(regex , delimiter) - This method will split a string based on the
// values and return
// the character array
// The white space is the default delimiter in java , apart from this any
// character can be delimiter in java.
// class SplitMethod {
/**
 * public static void main(String args[]) {
 * String str = "Hello , My name is@ Lakshmi.Bist";
 * String str1[] = str.split("[, @ .]");
 * for (int i = 0; i <= str1.length; i++) {
 * System.out.print(str1);
 * }
 * }
 * }
 */

// trim() method in java - this method in java trims the white spaces in between the double quote .
//If there is any white space in between the two words of a string then that will not be trimmed.

/**
 * class TrimMethod {
 * public static void main(String args[]) {
 * String str = " Lakshmi Bist is learning coding ";
 * String str1 = str.trim();
 * System.out.println(str);
 * System.out.println(str1);
 * }
 * }
 */

// replaceAll() method in string - This method will remove all
// the white spaces in a string including the spaces that are present
// between the words of a single string

/**
 * class ReplaceAll {
 * public static void main(String args[]) {
 * String str = " I'm Lakshmi Bist and i'm learning coding ";
 * String str2 = str.replaceAll(" ", "");
 * System.out.println(str);
 * System.out.println(str2);
 * }
 * }
 */

// isEmpty() - This method in string checks whether a string is empty or not ,
// based

class IsEmpty {
    public static void main(String args[]) {
        String str = " Lakshmi";
        String str2 = str.trim();
        System.out.println(str2.isEmpty());

        System.out.println("Git practice");

    }
}
