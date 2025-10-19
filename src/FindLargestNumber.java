import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        System.out.println("How many numbers do you need?: ");
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        int[] numbers = new int[inputs];

        System.out.println("List the numbers: ");

        for (int i = 0; i < inputs; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

//        assume first number is the largest at the beginning
        int largest = numbers[0];
        for (int i = 1; i < inputs ; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest: " + largest);
    }
}
