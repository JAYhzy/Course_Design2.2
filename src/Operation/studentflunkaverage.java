package Operation;

import student.StudentList;

import java.util.Scanner;

public class studentflunkaverage implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        System.out.println("How many exams a student fails averagely to:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            System.out.println(studentList.getStudents()[i].getName() +" "+ studentList.getStudents()[i].getFrequency());
        }
    }

}













