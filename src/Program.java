import java.util.ArrayList;
import java.util.List;

public class Program {

    protected String nameOfProgram;
    private ArrayList<Course> listOfCourses = new ArrayList();
    public Course course;

    public Program(){

    }

    public Program(String nameOfProgram){
        this.nameOfProgram = nameOfProgram;
    }

    public void addCourseToProgram(String nameOfCourse){
        this.course = new Course(nameOfCourse);
        listOfCourses.add(course);
    }

    public void classAttendence(){
        System.out.print("Är på föreläsning med andra från " + nameOfProgram + ".");
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public void setNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Program{" +
                "nameOfProgram='" + nameOfProgram + '\'' +
                ", listOfCourses=" + listOfCourses +
                ", course=" + course +
                '}';
    }

}
