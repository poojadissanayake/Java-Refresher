public class EncapsulationConstructorStudent {
    private String name;
    private int age;
    private double mark;

    public EncapsulationConstructorStudent(String n, int a, double m) {
        name = n;
        age = a;
        mark = m;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mark: " + getMark());
    }

    public static void main(String[] args) {
        EncapsulationConstructorStudent student = new EncapsulationConstructorStudent("Ellie", 25, 99);
        student.displayInfo();
    }
}
