public class Course {
    private String courseCode;
    private String courseName;
    private int units;

    public Course(String courseCode, String courseName, int units) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.units = units;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Units: " + units);
        System.out.println("---------------------");
    }
}
