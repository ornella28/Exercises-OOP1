package se.lexicon;

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String major;

    //Creating constructor to initialize the fields

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    //Generate Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Major cannot be null or empty");
        }
        this.major = major;
    }

    // creating a method override toString to return the student information


    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Major: " + major;
    }
}
