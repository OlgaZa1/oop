package cls;

public class Person {
    protected String name;
    protected int age;


    public Person(String name, int age) {
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20) {
            age = 20;
        }else if (age>120){
            age=120;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
