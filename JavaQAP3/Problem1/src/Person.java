// Person.java
public class Person {
    // instance vars (protected, accessible to subclasses)
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Constructor to initialize the Person obj
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters/Setters 
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // Returns description of the Person obj
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
