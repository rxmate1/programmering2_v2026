public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("---Student---");

        Student student1 = new Student();

        /*
        Etter å fulgt innkapslings-prinsippet kan vi nå bare aksessere instansvariablene gjennom get- og set-metoder.
        Dette er i motsetning til hvordan student2 er definert i kommentaren lenger ned
         */

        /*
        Vi benytter standardiserte set-metoder for å sette verdier for instansvariabler. Disse tilater oss å sende
        med verdien som skal settes, men hvordan denne operasjonen blir utført bestemmes av metode-definisjonen
        i klassen.
         */
        student1.setFirstName("Ole-Edvard");
        student1.setLastName("Ørebæk");
        student1.setStudentId("123456");

        /*
        Skal vi hente ut verdier for instansvariabler benytter vi get-metoder. Disse metodene standardiserer hvilke
        instansvariabler som vi kan hente ut (de vi har tilgjengelige set-metoder for) og hvordan verdiene hentes ut.
         */
        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Student ID: " + student1.getStudentId());

        /*
        En fordel med å benytte get- og set-metoder er at vi kan automatisere logikk, slik som å kontrollere
        parameterverdier. Her har vi automatisert at bare alder-verdier mellom 0 og 120 er godtatt.
        Se setAge()-definisjonen i Student-klassen for logikken.
         */
        System.out.println();
        student1.setAge(-50);
        System.out.println("Trying to set age to -50 result: " +
                student1.getAge());
        student1.setAge(2000);
        System.out.println("Trying to set age to 2000 result: " +
                student1.getAge());
        student1.setAge(28);
        System.out.println("Trying to set age to 28 result: " +
                student1.getAge());

        /*
         En annen fordel med get- og set-metoder er at vi kan kontrollere akkurat hvilke handlinger som skal være lov
        for en gitt instansvariabel. Her kan vi bare lese birthNumber, men ikke sette noen ny verdi.
        Det motsatte hadde også vært mulig ved å bare opprette en set-metode og ingen get-metode.
         */
        System.out.println();
        System.out.println("Birth number: " + student1.getBirthNumber());

        System.out.println("\n---Course object---");

        Course programming2 = new Course();
        programming2.setCourseName("Programming 2");
        programming2.setCourseCode("ITF10619");
        programming2.setStudyPoints(10);

        System.out.println(programming2.getCourseName() + " - "
                + programming2.getCourseCode() + " - "
                + programming2.getStudyPoints());
    }
}
