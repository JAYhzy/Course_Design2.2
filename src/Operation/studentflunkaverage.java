package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentflunkaverage implements ioOPerate{
    @Override
    public void work(Connection connection, StudentDao studentDao) throws SQLException {
        ArrayList<Student> students = studentDao.findStudent(connection);
        int total = 0;

        for (Student student : students)
            total += student.getFrequency();

        System.out.println("How many exams a student fails averagely to:");
        System.out.println(total/students.size());
    }

}













