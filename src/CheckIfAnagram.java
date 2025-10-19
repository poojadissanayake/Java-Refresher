import java.util.Arrays;
import java.util.Scanner;

public class CheckIfAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the two words: ");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        sc.close();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();

//        sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

//        compare
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Anagrams!");
        } else {
            System.out.println("Not anagrams!");
        }
    }
}
