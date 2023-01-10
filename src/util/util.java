package util;

import student.Student;
import student.StudentDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class util {
    public static ArrayList<ArrayList<Student>> judgeStandard(ArrayList<Student> students)
    {
        //����Ϊÿһ����Ŀ�������ѧ������
        ArrayList<ArrayList<Student>> res = new ArrayList<>();
        ArrayList<Student> demo;
        int count = 0;
        while (count < 6)
        {
            demo = new ArrayList<>();
            for (Student e : students)
                if (e.grade[count] < 60)
                    demo.add(e);
            res.add(demo);
            count++;
        }
        return res;
    }
    public static int judgeFlunk(Student student)
    {
        //���㲻�����Ŀ��
        int res = 0;
        for (double grade : student.grade)
            if (grade < 60)
                res++;
        return res;
    }
    public static double getAverage(Student student) {
        double average=0;
        for (double grade : student.grade)
            average += grade;
        return average / 6;
    }

    public static void updateInformationNew(Connection connection, Student student) throws SQLException {
        StudentDao studentDao = new StudentDao();
        boolean update = studentDao.update(connection, student);
        if (!update)
            System.out.println("����ʧ��");
    }

    /**
     * �˷��������ж��û������ֺ�id�Ƿ��ظ�
     * @param connection
     * @param student
     * @return
     */
    public static boolean judgementSoleByUserId(Connection connection, Student student)
    {
        StudentDao studentDao = new StudentDao();
        try {
            ArrayList<Student> students = studentDao.findStudent(connection);

            for (Student student1 : students)
                if (student1.getStudentId() == student.getStudentId() || student1.getName().equals(student.getName()))
                    return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
