//Problem 2.
//        Some students take several courses in this semester,
//        1. Discrete Math
//        2. System Programming
//        3. English
//        4. Data Structure
//        5. Computer Network
//        6. Arts
//        Please write a Java program to store scores of all courses for per student, and achieve the following functions.
//        1. How many all students fail to some exam.
//        2. For all students, get the average score of their discrete math
//        3. Get the average score of each student
//        4. How many exams a student fails averagely to.

import Operation.*;
//import Operation.studentChange;
import student.StudentDao;
import student.StudentList;

import java.sql.Connection;
import java.util.Scanner;
import Operation.ioOPerate;
public class Main {
    public static void menu() {
        System.out.println("=========================");
        System.out.println("0.Add student information.");
        System.out.println("1.Print student information.");
        System.out.println("2.How many all students fail to some exam.");
        System.out.println("3.For all students, get the average score of their discrete math.");
        System.out.println("4.Get the average score of each student.");
        System.out.println("5.How many exams a student fails averagely to.");
        System.out.println("6.exit");
        System.out.println("=========================");
    }
    public static void main(String[] args) throws Exception {
        Connection connection = new util.jdbc_util().getCon();
        StudentDao studentDao = new StudentDao();
        studentDao.createTable(connection);
        
        ioOPerate[] ioOperation = new ioOPerate[] {  // 对接口数组进行赋值，分别指向不同的实例化操作对象，利用下标对不同对象进行操作
                new AddStudent(),
                new printAll(),
                new flunkPrint(),
                new discrect_math(),
                new studentaverage(),
                new studentflunkaverage(),
                new exitOperation(),
        };
        do {
            menu();
            System.out.print("Please enter you choice:");
            Scanner sc  = new Scanner(System.in);
            int choice = sc.nextInt();
            // 多态 根据当前接口对象ioOperation的不同引用来进行不同的操作
            ioOperation[choice].work(connection, studentDao);
        }while(true);
    }
}
