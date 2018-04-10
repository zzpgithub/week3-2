package practice10;

import java.util.Set;

public class Teacher extends Person{
    private Set<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student){
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    @Override
    public String introduce() {
        if (classes == null ) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String classNum = "";
            for (Klass klass : classes) {
                classNum += klass.getNumber() + ", ";
            }
            classNum = classNum.substring(0,classNum.length()-2);
            return super.introduce() + " I am a Teacher. I teach Class " + classNum + ".";
        }
    }

    public boolean isTeaching(Student student) {
        if (classes != null) {
            for (Klass klass : classes) {
                if (klass.containStudent(student)) {
                    return true;
                }
            }
        }
        return false;
    }
}