package student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class studentDao {

    public ArrayList<Student> findStudent(Connection connection) throws SQLException {
        ArrayList<Student> students = new ArrayList<>();
        String sql = "select * from grade;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next())
        {
            int studentId    = resultSet.getInt("studentid");
	        String name = resultSet.getString("name");
	        double Discrete_Math    = resultSet.getDouble("Discrete_Math");
            double System_Programming   = resultSet.getDouble("System_Programming");
            double English  = resultSet.getDouble("English");
            double DataStructure    = resultSet.getDouble("DataStructure");
            double Computer_Network = resultSet.getDouble("Computer_Network");
            double Arts = resultSet.getDouble("Arts");
            double average  = resultSet.getDouble("average");
	        int frequency    = resultSet.getInt("frequency");
            students.add(new Student(studentId, name, Discrete_Math, System_Programming, English, DataStructure, Computer_Network, Arts, average, frequency));
        }
        resultSet.close();
        preparedStatement.close();
        return students;
    }
}






