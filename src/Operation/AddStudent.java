package Operation;

import student.Student;
import student.StudentList;

import java.util.Scanner;

public class AddStudent implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        if (studentList.getUsedSize() > 10) {
            System.out.println("add failed");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student number of the student you want to add:");
        long studentId = sc.nextLong();
        System.out.println("Please enter the name of the student you want to add:");
        String name = sc.next();
        System.out.println("Please enter the Discrete_Math scores of the students you want to add:");
        double Discrete_MathGrade = sc.nextDouble();
        System.out.println("Please enter the grade of the System_Programming you want to add:");
        double System_ProgrammingGrade = sc.nextDouble();
        System.out.println("Please enter the grade of the English you want to add:");
        double EnglishGrade = sc.nextDouble();
        System.out.println("Please enter the grade of DataStructure you want to add:");
        double DataStructureGrade = sc.nextDouble();
        System.out.println("Please enter the grade of the Computer_Network you want to add:");
        double Computer_NetworkGrade = sc.nextDouble();
        System.out.println("Please enter the grade of the Arts you want to add:");
        double ArtsGrade = sc.nextDouble();

        Student student = new Student(studentId, name, Discrete_MathGrade, System_ProgrammingGrade,EnglishGrade,DataStructureGrade,Computer_NetworkGrade, ArtsGrade );
        studentList.setStudent(studentList.getUsedSize(), student);
        studentList.setUsedSize(studentList.getUsedSize() + 1);
        System.out.println("Added successfully!");
    }
}