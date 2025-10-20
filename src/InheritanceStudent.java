public class InheritanceStudent {
    protected String name;
    protected double mark;

    public InheritanceStudent(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }
}

class GraduatedStudent extends InheritanceStudent{
    private String topic;

    public GraduatedStudent(String name, double mark, String topic) {
        super(name, mark);
        this.topic = topic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research topic: " + topic);
    }

    public static void main(String[] args) {
        InheritanceStudent s1 = new InheritanceStudent("Pj", 98.0);
        GraduatedStudent g1 = new GraduatedStudent("Ellie", 89, "AI");

        s1.displayInfo();
        System.out.println();
        g1.displayInfo();
    }
}
