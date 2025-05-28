// @override is not needed but i need to get in good habit of still using it
//import java.util.ArrayList;
public class Student implements Comparable<Student> {
    private String studentNumber;
    private String name;
    private int age;
    
// studennt with a age, name and a student number
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
// basic setters and getters
     public int getAge() {
        return this.age;
    }
// extremely repetive
    public String getName() {
        return this.name;
    }

// unique student number
    public String getStudentNumber() {
        return this.studentNumber;
    }

    // setting their stuff now
    // as a int or a string

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
// comparing
//this allows sorting yay...
//@param student, another student to compare with
    @Override
    public int compareTo(Student student) {
        return this.studentNumber.compareTo(student.getStudentNumber());

    }


// return their idenities 
    @Override
    public String toString() {
        return "N:" + this.name + " A:" + age + " SN:" + studentNumber;
    }
}

//* DONE!! */