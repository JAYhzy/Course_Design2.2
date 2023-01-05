/**
 * 里面存放了一群学生的信息，是学生对象的一个集合，我们对学生系统的操作主要围绕这个StudentList类来展开
 */
package student;
import java.util.Scanner;

public class StudentList {
    private int usedSize;
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Student[] getStudents() {
        return students;
    }

    // 打印指定下标的学生对象
    public void printStudent(int pos) {
        System.out.println(students[pos]);
    }

    // 获取指定下标的图书
    public Student getStudent(int pos) {
        return students[pos];
    }

    // 在数组的指定位置放置图书
    public void setStudent(int pos, Student student) {
        students[pos] = student;
    }

    // 初始化学生数组
    private Student[] students = new Student[10];
    public StudentList() {
        students[0] = new Student(9370118, "qw", 76, 92,89,8,78,67);
        students[1] = new Student(9370119, "as", 43, 67,67,43,98,56);
        students[2] = new Student(9370120, "zx", 23, 99,67,87,54,34);
        usedSize = 3;
    }
}

