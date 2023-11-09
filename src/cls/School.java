package cls;

import java.util.Arrays;

public class School {
    private ClassRoom[] classrooms;

    public School(ClassRoom[] classrooms) {
        setClassrooms(classrooms);
    }

    public ClassRoom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ClassRoom[] classrooms) {
        if (classrooms.length != 5) {
            throw new IllegalArgumentException("Need too be 5 classrooms");
        }
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "School{" +
                "classrooms=" + Arrays.toString(classrooms) +
                '}';
    }
}
