package mojaPaczka;

public class Student {

    private String sudentName;
    private int studentAge;
    private int yearOfStudy;

    public Student(String sudentName, int studentAge, int yearOfStudy) {
        this.sudentName = sudentName;
        this.studentAge = studentAge;
        this.yearOfStudy = yearOfStudy;
    }

    public String getSudentName() {
        return sudentName;
    }

    public void setSudentName(String sudentName) {
        this.sudentName = sudentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
