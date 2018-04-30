package sit.model;

public class Course {

    private String courseName;

    private int numberOfStudents;

    private RegisStudent[] students;

    public Course(String courseName, int numOfStudentCanRegis) {
        this.courseName = courseName;
        this.students = new RegisStudent[numOfStudentCanRegis];
        this.numberOfStudents = 0;

    }

    public int addStudent(RegisStudent student) {

        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                return -1;
            }

            if (numberOfStudents == students.length) {
                return -2;

            } else {
                students[numberOfStudents] = student;
                numberOfStudents++;
                break;
            }
        }

        return numberOfStudents - 1;

    }

    public boolean dropStudent(RegisStudent student) {
        for(int i = 0; i < students.length; i++){
            if(student.equals(students[i])){
                numberOfStudents--;
                
                for(int j = i; j < numberOfStudents ; j++){
                    students[j] = students[j+1];
                }
                
                return true;
            }
        }
        return false;
    }

    public RegisStudent[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;

    }
}
