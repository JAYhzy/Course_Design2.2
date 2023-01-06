package Operation;

import student.Student;
import student.StudentList;

import java.util.Arrays;
public class printAll implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        // 打印所有学生的信息
        System.out.println("student information:");
        for (int i = 0; i < studentList.getStudents().size(); i++) {
            System.out.println(studentList.getStudents().get(i).getStudentId() + studentList.getStudents().get(i).getName());
            System.out.println("Discrete Math Grade:"  + studentList.getStudents().get(i).getDiscrete_MathGrade());
            System.out.println("System Programming Grade Grade:"  + studentList.getStudents().get(i).getSystem_ProgrammingGrade());
            System.out.println("English Grade:"  + studentList.getStudents().get(i).getEnglishGrade());
            System.out.println("DataStructure  Grade:"  + studentList.getStudents().get(i).getDataStructureGrade());
            System.out.println("Computer Network Grade:"  + studentList.getStudents().get(i).getComputer_NetworkGrade());
            System.out.println("Arts Grade:"  + studentList.getStudents().get(i).getArtsGrade());
            System.out.println("Average Grade:"  + studentList.getStudents().get(i).getAverage());
        }
    }
}
