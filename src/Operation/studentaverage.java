package Operation;

import student.StudentList;

import java.util.Scanner;

public class studentaverage implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        System.out.println("The average of students:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            System.out.println(studentList.getStudents()[i].getName() + studentList.getStudents()[i].getAverage());
        }
    }
}