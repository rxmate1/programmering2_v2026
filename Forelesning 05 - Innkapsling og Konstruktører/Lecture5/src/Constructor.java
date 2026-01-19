public class Constructor {
    public static void main(String[] args) {

        /*
        Her benytter vi en konstruktør til å ta imot verdier for firstName, lastName, age og studentId og sette dem
        samtidig som Student-objektet blir opprettet. Dette er mer smiding enn å sette verdier for disse
        instansvariablene på en og en linje.
         */
        System.out.println("---Student constructor use---");
        Student johnDoe = new Student("John", "Doe",
                5000, "654321");

        /*
        Etter å ha benyttet konstruktøren er verdiene for disse instansvariablene satt og vi kan benytte dem uten å
        foreta oss noe mer. Vi kan imidlertid ogås oppdatere dem men set-metodene som er tilgjengelig, om vi skulle
        ønsket det.
         */
        System.out.println(johnDoe.getFirstName());
        System.out.println(johnDoe.getLastName());
        System.out.println(johnDoe.getAge());
        System.out.println(johnDoe.getStudentId());

        /*
        Under er et tilsvarende eksempel av konstruktørbruk for Course klassen etter at det er blitt implementert
        en konstruktør for denne klassen som tar parametere for instansvariablene courseName og courseCode.
         */

        System.out.println("\n---Course constructor use---");
        Course databaseSystems = new Course("Database systems", "ITF10319", 10);

        System.out.println(databaseSystems.getCourseName());
        System.out.println(databaseSystems.getCourseCode());
        System.out.println(databaseSystems.getStudyPoints());

    }
}
