import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int input = sc.nextInt();
        double expected = (double) input * (input+1)/2;
        double actual = 0;

        for (int i = 0; i < input - 1; i++) {
            actual += sc.nextInt();
        }
        sc.close();
        System.out.println(expected - actual);
    }
}
