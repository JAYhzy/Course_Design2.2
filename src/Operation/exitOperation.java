package Operation;

import student.Student;
import student.StudentList;

import java.util.Scanner;

public class exitOperation implements ioOPerate {
    @Override
    public void work(StudentList studentList) {
        System.out.println("whether to exit?" + "(Y/N)");
        Scanner scan = new Scanner(System.in);
        if (scan.next().equalsIgnoreCase("Y")) {
            System.out.println("exit!");
            System.exit(0);
        }
    }
}
