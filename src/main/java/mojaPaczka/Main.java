package mojaPaczka;

public class Main {
    public static void main(String[] args) {

        School highSchool = new School(340,15,17,"ZST");
        Teacher adam = new Teacher("Adam Nowak","Matematyka",45);
        Student kamil = new Student("Kamil Dyg",18,2);

        System.out.println("\nUczeń "+kamil.getSudentName()+" lat "+kamil.getStudentAge()+
                " uczęszcza do szkoły "+ highSchool.getName() +" na roku "+kamil.getYearOfStudy()+
                ". \nJego wychowawca to "+adam.getTeacherName()+ " który uczy "+adam.getTeachOf()+
                ". \nWszystkich uczniów w tej szkole jest "+highSchool.getStudentsNumber()+
                " którzy są są rozdzielenie do "+highSchool.getGroupNumbers()+ " klas."+
                "\nWszystkich nauczycieli jest "+highSchool.getTeacherNumber());
    }
}
