package no.hiof.oleedvao.lecture6.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private Course favoriteCourse; // Instansvariabel med objekt-referanse

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

    // Getter for å hente referanse til favoritt kurs (Course-objekt)
    public Course getFavoriteCourse() {
        return favoriteCourse;
    }

    // Setter for å oppdatere referanse til favoritt-kurs (Course-objekt)
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
