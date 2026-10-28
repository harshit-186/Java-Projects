package StudentManagementSystem;

import java.util.Set;
import java.util.TreeSet;

public class Student {
    private int roll;
    private String name ;
    Set<String> courseNames;

    public Student(int roll, String name) {
        this.roll = roll;
        this.courseNames = new TreeSet<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", courseNames=" + courseNames +
                '}';
    }
}
