package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentaverage implements ioOPerate{
    @Override
    public void work(Connection connection, StudentDao studentDao) throws SQLException {
        ArrayList<Student> students = studentDao.findStudent(connection);
        System.out.println("The average of students:");
        for (Student student : students) {
            System.out.println(student.getStudentId() + "\t"+ student.getName() + "\t" + student.getAverage());
        }
    }
}