// Student subclass inherits from Person
public class Student extends Person {

    protected String myIdNum; 
    protected double myGPA;

    // Constructor initializes inherited vars using super()
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters/Setters
    public String getIdNum() { 
        return myIdNum; 
    }

    public double getGPA() { 
        return myGPA; 
    }

    public void setIdNum(String idNum) { 
        myIdNum = idNum; 
    }

    public void setGPA(double gpa) { 
        myGPA = gpa; 
    }

    // toString() overrides superclass method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
