public class Classes extends Course{

    protected String nameOfClass;

    public Classes(String nameOfProgram, String nameOfCourse,String nameOfClass) {
        super(nameOfProgram, nameOfCourse);
        this.nameOfClass = nameOfClass;
    }

    public Classes(String nameOfClass){
        this.nameOfClass = nameOfClass;
    }

    @Override
    public void classAttendence() {
        super.classAttendence();
        System.out.print(" Dagens föreläsning heter " + nameOfClass + ".");
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }
}
