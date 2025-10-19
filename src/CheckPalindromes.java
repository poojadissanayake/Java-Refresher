import java.util.Scanner;

public class CheckPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

//        convert to lowercase for comparison
        text = text.toLowerCase();
        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a Palindrome!");
        }

    }
}
