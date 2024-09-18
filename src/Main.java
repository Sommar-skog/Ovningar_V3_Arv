public class Main {
    public static void main(String[] args) {

        //Ska student

        Student student1 = new Student("Amanda", 10223);

        //Skapa program
        Program program1 = new Program("Agil Javaprogrammering");

        //koppla samman program och student
        student1.setProgram(program1);

        //Lägg till kurs på studentens program
       student1.getProgram().addCourseToProgram("Objektorienterad programmering");

       //Lägg till föreläsning på studentens kurs
       student1.getProgram().getCourse().addClass("Arv");

       //Skriv ut metod med sträng och namn för program,kurs, föreläsning
        student1.getProgram().getCourse().getClass1().classAttendence();




    }
}