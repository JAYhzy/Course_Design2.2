package util;

import student.Student;
import student.StudentDao;

import java.util.ArrayList;

public class util {
    public static ArrayList<ArrayList<Student>> judgeStandard(ArrayList<Student> students)
    {
        //对象为每一个科目不及格的学生集合
        ArrayList<ArrayList<Student>> res = new ArrayList<>();
        ArrayList<Student> demo = null;
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
        //计算不及格科目数
        int res = 0;
        for (double grade : student.grade)
            if (grade < 60)
                res++;
        return res;
    }
}
