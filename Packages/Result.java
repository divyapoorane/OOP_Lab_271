package result;

import student.Student;

public class Result {

    public void calculateGrade(Student s) {

        int marks = s.getMarks();

        if (marks >= 90)
            System.out.println(s.getName() + " Grade: A");
        else if (marks >= 75)
            System.out.println(s.getName() + " Grade: B");
        else if (marks >= 50)
            System.out.println(s.getName() + " Grade: C");
        else
            System.out.println(s.getName() + " Grade: Fail");
    }
}