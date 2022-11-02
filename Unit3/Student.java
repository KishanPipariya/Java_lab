package Unit3;

public class Student {
    int rollNo;
    String name;
    Course[] course = new Course[3];
    double totalMarks;
    static double highestMarks;
    Student(int rollNo, String name, double marks1, double marks2, double marks3){
        this.rollNo = rollNo;
        this.name = name;
        course[0] = new Course(1, "sub1", marks1);
        course[1] = new Course(2, "sub2", marks2);
        course[2] = new Course(3, "sub3", marks3);
        totalMarks= marks1 + marks2 + marks3;
    }
}

class Course{
    int courseCode;
    String courseName;
    double marks;
    Course(int courseCode, String courseName, double marks){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.marks = marks;
    }
}
