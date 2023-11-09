package cls;

public class Teacher extends Person {

    private Profession prof;

    public Teacher(String name, int age, Profession prof) {
        super(name, age);
        setProf(prof);

    }

    public Profession getProf() {
        return prof;
    }

    public void setProf(Profession prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "prof=" + prof +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
