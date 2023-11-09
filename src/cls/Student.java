package cls;

import java.util.Arrays;

public class Student extends Person {
    private Grade[] grades;

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        setGrades(grades);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        if (grades.length != 6) {
            throw new IllegalArgumentException("Must be 1 Grade for each professions");
        }
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public double getAverageScore() {
        double sum = 0;
        for (Grade grade : getGrades()) {
            sum += grade.getScore();
        }
        return sum / getGrades().length;
    }
}
