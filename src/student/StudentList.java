/**
 * 里面存放了一群学生的信息，是学生对象的一个集合，我们对学生系统的操作主要围绕这个StudentList类来展开
 */
package student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
        public ArrayList<Student> students=new ArrayList<>();
        public StudentList() {}
        public ArrayList<Student> getStudents(){return students;}
        public void setStudent (int pos,Student student){
            students.set(pos,student);
        }
        public Student getBook(int pos){
            return students.get(pos);
        }









}

