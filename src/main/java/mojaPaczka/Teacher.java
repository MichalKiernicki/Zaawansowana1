package mojaPaczka;

public class Teacher {

    private String teacherName;
    private String teachOf;
    private int age;

    public Teacher(String teacherName, String teachOf, int age) {
        this.teacherName = teacherName;
        this.teachOf = teachOf;
        this.age = age;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeachOf() {
        return teachOf;
    }

    public void setTeachOf(String teachOf) {
        this.teachOf = teachOf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

