public class Course {
    private String courseCode;
    private String courseTitle;

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void displayCourseDetails(){
        System.out.println("Course Code : " +courseCode);
        System.out.println("Course Title : " +courseTitle);
    }
}

class Student {
    private String studentID;
    private String studentName;
    private int courseCount = 0;
    private Course [] course = new Course [3];

    public Student(){
    }

    public Student(String studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void enrollCourse (Course c){
        if (courseCount < 3) {
            course[courseCount] = c;
            courseCount++;
        }
        else{
            System.out.println("Exceeded the maximum course limit");
        }
    }

    public void displayStudentDetails(){
        System.out.println("Student ID: " +studentID);
        System.out.println("Student Name: " +studentName);
        System.out.println("Enrolled Courses:");

        for(int i=0; i < courseCount; i++){
            course[i].displayCourseDetails();
            System.out.println(" ");
        }
    }
}

class StudentCourseApp {
    public static void main (String [] args){
        Course course1 = new Course("SE1232", "Introduction to Programming");
        Course course2 = new Course("IT1170", "Data Science and Concepts");
        Course course3 = new Course("IT1040", "Object Oriented Programming");

        Student student1 = new Student("IT3412312", "Wesaminigay");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student1.enrollCourse(course3);

        student1.displayStudentDetails();
    }
}


