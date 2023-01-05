package Operation;

import student.Student;
import student.StudentList;

public class exitOperation implements ioOPerate{
    @Override
    public void work(StudentList studentList) {
        System.out.println("exit");
        for (int i = 0; i < studentList.getUsedSize(); i++) {
            studentList.setStudent(i, null);
        }
        System.out.println("exit successfully!");
        System.exit(0);
    }
}
