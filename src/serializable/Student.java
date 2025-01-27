package serializable;

import java.io.Serial;
import java.io.Serializable;

// the serializable tells JVM that the variables here can be serialized.
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // unique identifier for the serialized class
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return ("Student name is " + this.getName() + " and age is " + this.getAge());
    }
}
