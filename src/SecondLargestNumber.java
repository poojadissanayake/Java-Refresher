import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {

        System.out.println("How many numbers: ");

        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        int[] numbers = new int[inputs];

        System.out.println("List the numbers: ");
        for (int i = 0; i < inputs; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        int largest = 0;
        int secondLargest = 0;
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i]!=largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second largest is: " + secondLargest);
    }
}
