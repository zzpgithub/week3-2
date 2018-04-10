package practice10;

public class Student extends Person{
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
        if (this.klass.getLeader() != null  && klass.getLeader().getId() == getId()) {
            return super.introduce() + " I am a Student. I am Leader of "+ klass.getDisplayName() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at "+ klass.getDisplayName() + ".";
        }

    }
}

