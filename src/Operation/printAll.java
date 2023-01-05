package Operation;

import student.Student;
import student.StudentList;

import java.util.Arrays;
public class printAll implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        // 打印所有学生的信息
        System.out.println("student information:");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            System.out.println(studentList.getStudents()[i].getStudentId() + studentList.getStudents()[i].getName());
            System.out.println("Discrete Math Grade:"  + studentList.getStudents()[i].getDiscrete_MathGrade());
            System.out.println("System Programming Grade Grade:"  + studentList.getStudents()[i].getSystem_ProgrammingGrade());
            System.out.println("English Grade:"  + studentList.getStudents()[i].getEnglishGrade());
            System.out.println("DataStructure  Grade:"  + studentList.getStudents()[i].getDataStructureGrade());
            System.out.println("Computer Network Grade:"  + studentList.getStudents()[i].getComputer_NetworkGrade());
            System.out.println("Arts Grade:"  + studentList.getStudents()[i].getArtsGrade());
            System.out.println("Average Grade:"  + studentList.getStudents()[i].getAverage());
        }
    }
}
