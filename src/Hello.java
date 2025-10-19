public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not an alien");
        }

        int topScore = 100;
        int score = 50;
        int min = 10;
        if (topScore >= 100) {
            System.out.println("High score!");
        }

        if ((score < topScore) && (score > min)){
            System.out.println("Pass");
        }
    }
}
