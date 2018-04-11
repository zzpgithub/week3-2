package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass.getLeader() != null && klass.getLeader().getId() == getId()) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        if (!super.equals(o)) return false;
//        Student student = (Student) o;
//        return Objects.equals(klass, student.klass);
//    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(super.hashCode(), klass);
//    }
}


