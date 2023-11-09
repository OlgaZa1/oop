package cls;

import java.util.Random;

public class SchoolStatistics {
    public static void main(String[] args) {
        School school = generateSchool();
        for(ClassRoom classrom : school.getClassrooms()) {
            System.out.println(classrom);
        }
        System.out.println("School's average score: "+ schoolAverageScore(school));

    }


    private static int generateRandomGrade() {
        Random random = new Random();
        return random.nextInt(61) + 40;
    }

    private static School generateSchool() {
        return new School(generateClassRooms());
    }
    private static ClassRoom[] generateClassRooms() {
        Teacher[] teachers = generateTeachers();
        ClassRoom[] classrooms = new ClassRoom[teachers.length];
        int i = 0;
        for (Teacher teacher : teachers) {
            String className = "class: " + i;
            classrooms[i] = new ClassRoom(className, teacher, generateStudents());
            i++;
        }
        return classrooms;
    }

    private static Student[] generateStudents() {
        String[] names = {"Gideon", "Vasya", "Kolya", "Efi", "Alexey", "Max", "Yonatan", "Denis", "Doron", "Olga"};
        Student[] students = new Student[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            students[i] = new Student(names[random.nextInt(10)], random.nextInt(33), generateGrades());
        }
        return students;
    }

    private static Grade[] generateGrades() {
        Grade[] grades = new Grade[6];
        Random random = new Random();
        int i = 0;
        for (Profession profession : Profession.values()) {
            grades[i] = new Grade(random.nextInt(100), profession);
            i++;
        }
        return grades;
    }

    private static Teacher[] generateTeachers() {
        String[] teachersNames = {"Moshe", "Shmulik", "Igor", "Nadya", "Zamira"};

        Random random = new Random();
        Teacher[] teachers = new Teacher[5];
        int tInd = 0;
        for (String teacherName : teachersNames) {
            teachers[tInd] = new Teacher(teacherName, random.nextInt(59), Profession.randomProfession());
            tInd++;
        }
        return teachers;
    }
    public static double schoolAverageScore(School school) {
        double sum =0;
        ClassRoom []classrooms = school.getClassrooms();
        for(ClassRoom classRoom : classrooms) {
            sum  += classRoom.averageScore();
        }
        return sum / classrooms.length;
    }

}
