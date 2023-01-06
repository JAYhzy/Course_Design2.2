package Operation;

import student.Student;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;

public abstract interface ioOPerate {
    public abstract void work(Connection connection, StudentDao studentDao) throws Exception;
}
