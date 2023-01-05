package Operation;

import student.Student;
import student.StudentList;

import java.util.Arrays;

// 对不及格学生的打印
public class flunkPrint implements ioOPerate {
    @Override
    public void work(StudentList studentList) {
        System.out.println("Fail Discrete Mathematics:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getDiscrete_MathGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
        System.out.println("Fail System ProgrammingGrade:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getSystem_ProgrammingGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
        System.out.println("Fail English:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getEnglishGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
        System.out.println("Fail DataStructure:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getDataStructureGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
        System.out.println("Fail Computer NetworkGrade:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getComputer_NetworkGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
        System.out.println("Fail Arts:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            if (studentList.getStudents()[i].getArtsGrade() < 60) {
                System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
                studentList.getStudents()[i].setFrequency( (studentList.getStudents()[i].getFrequency())+1);
            }
        }
    }
}
