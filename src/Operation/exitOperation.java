package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class exitOperation implements ioOPerate {
    @Override
    public void work(Connection connection, StudentDao studentDao) throws SQLException {
        System.out.println("whether to exit?" + "(Y/N)");
        Scanner scan = new Scanner(System.in);
        if (scan.next().equalsIgnoreCase("Y")) {
            System.out.println("exit!");
            connection.close();
            System.exit(0);
        }
    }
}
