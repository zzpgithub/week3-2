package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (!studentList.contains(leader)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = leader;
        }
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }
}
