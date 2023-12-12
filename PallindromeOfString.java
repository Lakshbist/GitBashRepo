import java.util.*;

public class PallindromeOfString {
    public static void main(String args[]) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);

        }

        if (str.equals(str1)) {
            System.out.println("Two strings are pallindrome");
        }

        else {
            System.out.println("Strings are not in pallindrome");
        }
        sc.close();
        System.out.println("The length of str is " + " " + str.length());
    }

}
