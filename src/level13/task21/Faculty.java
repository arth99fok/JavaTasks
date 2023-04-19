package level13.task21;

import java.util.ArrayList;

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
