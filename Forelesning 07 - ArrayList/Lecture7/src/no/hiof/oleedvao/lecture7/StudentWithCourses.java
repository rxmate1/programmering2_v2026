package no.hiof.oleedvao.lecture7;

import no.hiof.oleedvao.lecture7.model.Course;
import no.hiof.oleedvao.lecture7.model.Student;

import java.util.ArrayList;

public class StudentWithCourses {
    public static void main(String[] args) {

        /*
        Se Student-klassen sin definisjon: Vi har nå opprettet en instansvariabel, courses, som er en ArrayList som
        kan holde på Course objekter og som representerer "kursene" som studenten tar.
         */
        Student ole = new Student("Ole-Edvard", "Ørebæk", 28, "123456");

        Course prog2 = new Course("Programmering 2", "ITF10619", 10);

        Course databaser = new Course("Databasesystemer", "ITF12345", 10);

        /*
        Vi har opprettet en metode som har den spesifikke oppgaven å legge til Course-objekter til den interne
        Course-ArrayListen. Merk at vi ikke benytter en typisk set-metode for denne handlingen og vil typisk ikke ha
        en slik set-metode for lister.
        For andre handlinger slik som å hente spesifikke elementer, fjerne elementer, få antall elementer osv., vil vi
        typisk opprette unike metoder for hver av disse. Dette er mer fornuftig for å håndtere innkapsling med lister.
         */
        ole.addToCourses(prog2);
        ole.addToCourses(databaser);

        /*
        Vi benytter her en get-metode for å hente en liste med studenten sine "kurs".
        VIKTIG: Merk at vi har definert get-metoden på en litt spesiell måte slik at den returnerer en KOPI av
        "studenten" sin liste, IKKE den faktiske listen. Dette er gjort for å sørge for at den virkelige listen ikke
        kan modifiseres fritt utenfor klassen. Altså gjør vi dette for å opprettholde innkapsling.
         */
        ArrayList<Course> olesCoursesCopy = ole.getCourses();

        /*
        Skriver ut alle kursene inneholdt i Student-objektet
         */
        System.out.println("Ole-E's courses (copy in variable): ");
        for (Course course : olesCoursesCopy) {
            System.out.println(course.getCourseName());
        }

        /*
        Merk at hvis vi ender listen vi har hentet ut av Student-objektet er separat og hvis vi endrer innholdet vil
        ikke dette påvirke studentens interne liste, som bevist lenger ned.
         */
        olesCoursesCopy.add(new Course("Silly Course", "ITF1337", 0));

        /*
        Utskrift av den oppdaterte liste-kopien.
         */
        System.out.println("\nOle-E's courses (updated copy in variable): ");
        for (Course course : olesCoursesCopy) {
            System.out.println(course.getCourseName());
        }

        /*
        Vi kan se at hvis vi igjen kopierer Course-listen direkte fra Student-objektet har ikke endringen mot den
        tidligere kopien påvirket selve innholde i Student-objektet.
         */
        System.out.println("\nOle-E's courses (direct copy from objekt)");
        for (Course course : ole.getCourses()) {
            System.out.println(course.getCourseName());
        }





    }
}
