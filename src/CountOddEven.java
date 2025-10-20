import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] intArray = new int[size];

        System.out.println("List the numbers: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        sc.close();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < intArray.length; i ++) {
            if (intArray[i] % 2 == 0) {
                evenCount ++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
