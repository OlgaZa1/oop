package cls;

import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students;

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        setName(name);
        setTeacher(teacher);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        if (students.length != 15) {
            throw new IllegalArgumentException("Need too be 15 students");
        }
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public double averageScore() {
        double sum = 0;

        for (Student student : getStudents()) {

            sum += student.getAverageScore();

        }
        return sum / getStudents().length;
    }
}