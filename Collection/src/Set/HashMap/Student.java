package Set.HashMap;

public class Student {
    String id;
    String fullName;

    public Student() {
    }

    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
