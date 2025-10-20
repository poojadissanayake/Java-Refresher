public class EncapsulatedStudent {
    private String name;
    private int age;
    private double mark;

//    setters
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setMark(double m) {
        mark = m;
    }

//    getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMark() {
        return mark;
    }

    public static void main(String[] args) {
        EncapsulatedStudent student = new EncapsulatedStudent();
        student.setName("Pj");
        student.setAge(30);
        student.setMark(99);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Mark: " + student.getMark());
    }
}
