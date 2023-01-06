package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
public class printAll implements ioOPerate{
    @Override
    public void work(Connection connection, StudentDao studentDao) throws SQLException {
        // 打印所有学生的信息
        System.out.println("student information:");
        ArrayList<Student> students = studentDao.findStudent(connection);

        System.out.println(students);
    }
}
