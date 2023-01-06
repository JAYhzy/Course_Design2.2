package Operation;

import student.StudentList;

import java.util.Scanner;

public class discrect_math implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        double score = 0;
        for (int i = 0; i < studentList.getStudents().size(); i++) {
            score += studentList.getStudents().get(i).getDiscrete_MathGrade();
        }
        score /= studentList.getStudents().size();
        System.out.println("The average score Discrete Mathematics: " + score);
    }
}