/*
Når vi har en pakkestruktur må den gjeldende klassens lokasjon også spesifiseres med en package-statement.
 */
package no.hiof.oleedvao.lecture6;

// Vi kan ha individuelle imports for hver klasse eller en som henter inn alle klasser av en pakke med *.
//import no.hiof.oleedvao.lecture6.model.Course;
//import no.hiof.oleedvao.lecture6.model.Student;
import no.hiof.oleedvao.lecture6.model.*;

public class PackagesAndImports {
    public static void main(String[] args) {

        /*
        Når vi benytter en pakkestruktur hvor klassene ligger i forskjellige nivåer må vi importere klasser for å gjøre
        det tydelig for Java hvilke vi skal benytte. Se import-statementene over klassedefinisjonen.
         */
        Student student = new Student();
        Course course = new Course();
    }
}
