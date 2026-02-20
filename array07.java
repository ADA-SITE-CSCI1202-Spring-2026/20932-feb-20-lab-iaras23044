import java.util.Scanner;

public class StringReverse {

    // Method that takes a String and returns its reverse
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed: " + reversed);

        sc.close();
    }
}  