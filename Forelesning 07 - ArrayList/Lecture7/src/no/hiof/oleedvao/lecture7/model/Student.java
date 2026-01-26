package no.hiof.oleedvao.lecture7.model;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private Course favoriteCourse;
    /*
    Vi oppretter her en liste som kan holde på Course-objekter og som representerer "kursene" "studenten" tar.
    Merk at vi typisk initialiserer objektet med en gang
       ... = new ArrayList<>();
    Vi gjør dette fordi vi vet at alle studenter skal ha en tom-liste som utgangspunkt. Det er derfor ikke nødvendig
    å håndtere dette unikt gjennom slikt som konstruktører.
    */
    private ArrayList<Course> courses = new ArrayList<>();

    private String birthNumber = "12345678910";

    public Student() {

    }

    public Student(String firstName, String lastName,
                   int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.studentId = studentId;
    }

    /*
    Dette er en variant av en get-metode som håndterer henting av "studenten" sine "kurs" på en fornuftig måte.
    Merk at vi IKKE returnerer den faktiske listen, men en kopi med:
        ... new ArrayList<>(courses);
    Dette forsikrer at listen ikke kan modifiseres fra utsiden av klassen. Altså at vi opprettholder innkapsling.
     */
    public ArrayList<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    /*
    Vi utelater typisk set-metoder for lister ettersom de typisk defineres slik:

        public void setCourses(ArrayList<Course> courses) {
            this.courses = courses;
        }

     En slik set-metode er problematisk fordi den ikke modifiserer listen, men overskriver den med en ny liste. Dette
     gjør det i praksis slitsomt å håndtere slike lister da vi må gjøre ekstra ting slik som å kopiere, fylle og
     sammenligne nye og gamle lister ved endring.

     I stedet skriver vi egne metoder som definerer de spesifikke handlignene vi vil utføre, slik som å legge til ett
     "kurs" av gangen, og som modifiserer listen. På den måten har vi full kontroll over hvilke handlinger som kan
     utføres på listen gjennom opprettede objekter og at disse handlingene håndteres på en standardisert måte.
     */
    public void addToCourses(Course course) {
        /*
        Vi gjør her også en kontroll på at parameteren faktisk inneholder et objekt ved å sjekke at den ikke er null.
        Dette er teknisk sett ikke nødvendig, men gjør programmet mer robust for feil-bruk.
         */
        if (course != null) {
            courses.add(course);
        }
    }

    public Course getFavoriteCourse() {
        return favoriteCourse;
    }

    public void setFavoriteCourse(Course favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if (age > 120) {
            this.age = 120;
        }
        else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBirthNumber() {
        return birthNumber;
    }
}
