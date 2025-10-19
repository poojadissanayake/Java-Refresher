import java.util.Scanner;

public class CountTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                count ++;
            }
        }

        System.out.println("Count: " + count);
    }
}
