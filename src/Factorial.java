import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number to find factorials: ");
        int num = sc.nextInt();
        sc.close();

        int factorial = factorials(num);
        System.out.println("Factorial: "+ factorial);
    }

    public static int factorials(int num){
        int result = 1;
        for (int i = 1; i <= num; i ++) {
            result = result * i;
        }
        return result;
    }
}
