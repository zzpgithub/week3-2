package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
            if (teacher != null) {
                teacher.knowJoinAndLeader(this, leader);
            }
        }
    }

    public void appendMember(Student student) {
        if (!isIn(student)) {
            studentList.add(student);
            if (teacher != null) {
                teacher.knowJoinAndLeader(this, student);
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    public boolean isIn(Student student) {
        return studentList.contains(student);
    }
}

