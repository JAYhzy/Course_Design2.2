package student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

    /**
     * 创建表
     * @param conn
     * @throws Exception
     */
    public void createTable(Connection conn) throws Exception {
        String sql = """
                CREATE TABLE IF NOT EXISTS `grade` (
                	`id` INT(11) NOT NULL AUTO_INCREMENT,
                	`studentid` VARCHAR(50) NULL DEFAULT NULL,
                	`name` VARCHAR(50) NULL DEFAULT NULL,
                	`Discrete_Math` INT(11) NULL DEFAULT NULL,
                	`System_Programming` INT(11) NULL DEFAULT NULL,
                	`English` INT(11) NULL DEFAULT NULL,
                	`DataStructure` INT(11) NULL DEFAULT NULL,
                	`Computer_Network` INT(11) NULL DEFAULT NULL,
                	`Arts` INT(11) NULL DEFAULT NULL,
                	`average` INT(11) NULL DEFAULT NULL,
                	`frequency` INT(11) NULL DEFAULT NULL,
                	INDEX `id` (`id`)
                )
                COLLATE='latin1_swedish_ci'
                ENGINE=InnoDB
                ;
                """;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("successfully!");
        }
        //释放资源
        preparedStatement.close();
    }

    public boolean AddStudent(Connection connection, Student student) throws SQLException {
        //language=MariaDB
        String sql = "insert into grade values(null, ?, ?, ?, ?, ?, ?, ?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, (int) student.getStudentId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setDouble(3, student.getDiscrete_MathGrade());
        preparedStatement.setDouble(4, student .getSystem_ProgrammingGrade());
        preparedStatement.setDouble(5, student.getEnglishGrade());
        preparedStatement.setDouble(6, student.getDataStructureGrade());
        preparedStatement.setDouble(7, student.getComputer_NetworkGrade());
        preparedStatement.setDouble(8, student.getArtsGrade());
        preparedStatement.setDouble(9, student.getAverage());
        preparedStatement.setInt(10, student.getFrequency());
        int n = preparedStatement.executeUpdate();
        return n == 1;
    }

    public void update(Connection connection, Student student) throws SQLException {
        //language=MariaDB
        String sql = "update grade set average = ? , frequency = ? where studentid = ?;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, student.getAverage());
        preparedStatement.setInt(2, student.getFrequency());
        preparedStatement.setInt(3, (int) student.getStudentId());

        int n = preparedStatement.executeUpdate();
    }

    public ArrayList<Student> findStudent(Connection connection) throws SQLException {
        ArrayList<Student> students = new ArrayList<>();
        String sql = "select * from grade;";
        Student student = null;

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
            student = new Student(studentId, name, Discrete_Math, System_Programming, English, DataStructure, Computer_Network, Arts);

            //此处判断如果数据库中average 或者 frequency为空就update一下给她添加进去
            if (resultSet.getString("average") == null)
                util.util.updateInformationNew(connection, student);
            if (resultSet.getString("frequency") == null)
                util.util.updateInformationNew(connection, student);
            students.add(student);
        }
        resultSet.close();
        preparedStatement.close();
        return students;
    }
}






