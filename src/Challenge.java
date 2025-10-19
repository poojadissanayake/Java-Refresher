public class Challenge {
    static void main(String[] args) {
        int newValue = 50;
//        = assignment
//        == equality

        if (newValue == 50) {
            System.out.println("Is 50");
        }

        boolean isCar = false;

        if (!isCar) {
            System.out.println("is not a car");
        }

        String makeOfCar = "Merc";
        boolean isDomestic = makeOfCar == "Mustang" ? false : true;

        if (isDomestic) {
            System.out.println("This is MErc");
        }

        double val1 = 20.00;
        double val2 = 80.00;

        double sum = (val1 + val2) * 100.00;
        System.out.println("Sum : " + sum);
        double remains = sum % 40.00;
        boolean isTrue = remains == 0.00 ? true : false;

        System.out.println("Bool: " + isTrue);

        if (!isTrue) {
            System.out.println("Got some remainder");
        }
    }
}
