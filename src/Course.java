import java.util.ArrayList;

public class Course extends Program{

    protected String nameOfCourse;
    public ArrayList<Classes> listOfClasses = new ArrayList();
    private Classes class1;

    public Classes getClass1() {
        return class1;
    }

    public void setClass1(Classes class1) {
        this.class1 = class1;
    }

    public Course(String nameOfProgram, String nameOfCourse) {
        super(nameOfProgram);
        this.nameOfCourse = nameOfCourse;
    }

    public Course(String nameOfCourse){
        this.nameOfCourse = nameOfCourse;
    }

    public Course(){

    }

    @Override
    public void classAttendence() {
        super.classAttendence();
        System.out.print(" Just nu läser vi kursen " + nameOfCourse + ".");
    }

    public void studyGroup(){
        System.out.println("Sitter i grupparbete med andra i kursen " + nameOfCourse + ".");
    }

    public void addClass(String nameOfClass){
        this.class1 = new Classes(nameOfClass);
        listOfClasses.add(class1);
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", listOfClasses=" + listOfClasses +
                ", class1=" + class1 +
                ", course=" + course +
                '}';
    }
}
