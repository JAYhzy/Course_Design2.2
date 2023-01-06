package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.util.ArrayList;

// 对不及格学生的打印
public class flunkPrint implements ioOPerate {
    @Override
    public void work(Connection connection, StudentDao studentDao) throws Exception {
        ArrayList<ArrayList<Student>> students = util.util.judgeStandard(studentDao.findStudent(connection));

        System.out.println("----------------------------------------");

        System.out.println("Fail Discrete Mathematics:");
        if (students.get(0).size() != 0)
            for (Student student: students.get(0))
                System.out.println(student.toString2() + "Mathematics:" + student.grade[0]);
        else
            System.out.println("All Pass");

        System.out.println("Fail System ProgrammingGrade:");
        if (students.get(1).size() != 0)
            for (Student student: students.get(1))
                System.out.println(student.toString2() + "ProgrammingGrade:" + student.grade[1]);
        else
            System.out.println("All Pass");

        System.out.println("Fail English:");
        if (students.get(2).size() != 0)
            for (Student student: students.get(2))
                System.out.println(student.toString2() + "English:" + student.grade[2]);
        else
            System.out.println("All Pass");

        System.out.println("Fail DataStructure:");
        if (students.get(3).size() != 0)
            for (Student student: students.get(3))
                System.out.println(student.toString2() + "DataStructure:" + student.grade[3]);
        else
            System.out.println("All Pass");

        System.out.println("Fail Computer NetworkGrade:");
        if (students.get(4).size() != 0)
            for (Student student: students.get(4))
                System.out.println(student.toString2() + "NetworkGrade:" + student.grade[4]);
        else
            System.out.println("All Pass");

        System.out.println("Fail Arts:");
        if (students.get(5).size() != 0)
            for (Student student: students.get(5))
                System.out.println(student.toString2() + "Arts:" + student.grade[5]);
        else
            System.out.println("All Pass");

        System.out.println("----------------------------------------");
    }
}
