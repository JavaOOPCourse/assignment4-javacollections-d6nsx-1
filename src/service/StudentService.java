package service;

import model.Student;
import java.util.*;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void init() {
        students.add(new Student(1, "Anna", 3.8));
        students.add(new Student(2, "Bob", 1.9));
        students.add(new Student(3, "Chris", 3.2));
        students.add(new Student(4, "Diana", 2.5));
        students.add(new Student(5, "Eric", 1.5));

        students.removeIf(s -> s.getGpa() < 2.0);
        students.add(2, new Student(99, "New Student", 3.0));
    }

    public void showStudents() {
        Iterator<Student> it = students.iterator();

        Student best = students.get(0);

        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);

            if (s.getGpa() > best.getGpa())
                best = s;
        }

        System.out.println("Highest GPA: " + best);
    }
}