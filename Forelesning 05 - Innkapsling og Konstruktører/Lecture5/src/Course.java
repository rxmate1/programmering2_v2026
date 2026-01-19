/*
Denne klassen er blitt oppdatert til å følge innkapslingsprinsippet, samt at vi har definert et par konstruktører
som kan hjelpe oss med å sette verdier for instansvariabler ved opprettelse av objekter.
Se Student for mer utdypende forklaringer på disse konseptene.
 */
public class Course {

    private String courseName;
    private String courseCode;
    private int studyPoints;

    public Course() {

    }

    public Course(String courseName, String courseCode, int studyPoints) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.studyPoints = studyPoints;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }
}
