public class Student {
    private int id;
    private String name;
    private int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMarks() {
        return marks;
    }
    public int setId(int id) {
        return this.id = id;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
