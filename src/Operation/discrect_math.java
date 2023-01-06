package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class discrect_math implements ioOPerate{
    @Override
    public void work(Connection connection, StudentDao studentDao) throws SQLException {
        ArrayList<Student> students = studentDao.findStudent(connection);
        double average = 0;
        for (Student e: students)
            average += e.grade[0];
        System.out.println("The average score Discrete Mathematics: " + average/students.size());

    }
}