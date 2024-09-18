public class Student {

    //Attribut
    private String name;
    private final int studentID;
    public Program program;

    public Student (String name, int studentID){
        this.name = name;
        this.studentID = studentID;
        program = new Program();
    }

    // Egna metoder
    public void study(){
        System.out.println("Sitter och pluggar!");
    }

    public void party(){
        System.out.println("Ute och festar!");
    }

    //Getter & Setter
    public void setProgram(Program program){
        this.program = program;
    }
    public Program getProgram(){
        return program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", program=" + program +
                '}';
    }
}
