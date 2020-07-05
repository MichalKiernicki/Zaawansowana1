package mojaPaczka;

public class School {

    private int studentsNumber;
    private int groupNumbers;
    private int teacherNumber;
    private String name;

    public School(int studentsNumber, int groupNumbers, int teacherNumber, String name) {
        this.studentsNumber = studentsNumber;
        this.groupNumbers = groupNumbers;
        this.teacherNumber = teacherNumber;
        this.name = name;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public int getGroupNumbers() {
        return groupNumbers;
    }

    public void setGroupNumbers(int groupNumbers) {
        this.groupNumbers = groupNumbers;
    }

    public int getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(int teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
