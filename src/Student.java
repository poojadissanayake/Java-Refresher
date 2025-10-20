public class Student {
    String name;
    int age;
    double marks;

//    constructor
    public Student(String n, int a, double m) {
        name = n;
        age = a;
        marks = m;
    }

    public void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Elle", 30, 98.0);
        Student student2 = new Student("PJ", 31, 99);

        student1.displayInfo();
        student2.displayInfo();

    }
}
