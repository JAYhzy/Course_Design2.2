/**
 * 学生类，里面一个学生的所有属性
 */
package student;

public class Student {
    private long studentId;
    private String name;
    private double Discrete_MathGrade;
    private double System_ProgrammingGrade;
    private double EnglishGrade;
    private double DataStructureGrade;
    private double Computer_NetworkGrade;
    private double ArtsGrade;
    private double average;
    private int frequency = 0;
    public Student(long studentId, String name, double discrete_MathGrade,
                   double system_ProgrammingGrade, double englishGrade,
                   double dataStructureGrade, double computer_NetworkGrade, double artsGrade) {
        this.studentId = studentId;
        this.name = name;
        Discrete_MathGrade = discrete_MathGrade;
        System_ProgrammingGrade = system_ProgrammingGrade;
        EnglishGrade = englishGrade;
        DataStructureGrade = dataStructureGrade;
        Computer_NetworkGrade = computer_NetworkGrade;
        ArtsGrade = artsGrade;
    }
    public double getAverage() {
        double average=0;
        average = (getDiscrete_MathGrade() + getEnglishGrade() +getSystem_ProgrammingGrade()+getComputer_NetworkGrade()+getArtsGrade()+getDataStructureGrade() )/6;
        return average;
    }

    public int getFrequency() {return frequency;}

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscrete_MathGrade() {
        return Discrete_MathGrade;
    }

    public void setDiscrete_MathGrade(double discrete_MathGrade) {
        Discrete_MathGrade = discrete_MathGrade;
    }

    public double getSystem_ProgrammingGrade() {
        return System_ProgrammingGrade;
    }

    public void setSystem_ProgrammingGrade(double system_ProgrammingGrade) {
        System_ProgrammingGrade = system_ProgrammingGrade;
    }

    public double getEnglishGrade() {
        return EnglishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        EnglishGrade = englishGrade;
    }

    public double getDataStructureGrade() {
        return DataStructureGrade;
    }

    public void setDataStructureGrade(double dataStructureGrade) {
        DataStructureGrade = dataStructureGrade;
    }

    public double getComputer_NetworkGrade() {
        return Computer_NetworkGrade;
    }

    public void setComputer_NetworkGrade(double computer_NetworkGrade) {
        Computer_NetworkGrade = computer_NetworkGrade;
    }

    public double getArtsGrade() {
        return ArtsGrade;
    }

    public void setArtsGrade(double artsGrade) {
        ArtsGrade = artsGrade;
    }
}




