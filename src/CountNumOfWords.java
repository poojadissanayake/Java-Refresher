import java.util.Scanner;

public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();

        String[] words = sentence.split(" ");
        int count = words.length;

        System.out.println("Number of words: " + count);
    }
}
