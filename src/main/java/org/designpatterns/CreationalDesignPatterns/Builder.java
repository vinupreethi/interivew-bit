package org.designpatterns.CreationalDesignPatterns;
class Student
{
    String name;
    int rollno;
    Student(StudentBuilder studentBuilder)
    {
        this.name=studentBuilder.name;
        this.rollno=studentBuilder.rollNo;

    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
// Builder class: StudentBuilder
class StudentBuilder {
    String name;
    int rollNo;

    // Setter for Name with method chaining
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    // Setter for Roll No with method chaining
    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    // Build method that returns the constructed Student object
    public Student build() {
        return new Student(this);
    }
}

class Director
{
    private  StudentBuilder studentBuilder;

    public Director(StudentBuilder builder) {
        this.studentBuilder= builder;
    }

    // Default student creation
    public Student createDefaultStudent() {
        return  studentBuilder.setName("Vinu")
                .setRollNo(123)
                .build();
    }

    public Student createStudent() {
        return  studentBuilder.setName("Vinu")
                .build();
    }

}
public class Builder {
    public static void main(String args[])
    {
        Director director=new Director(new StudentBuilder());
        System.out.println(director.createDefaultStudent());
        director=new Director(new StudentBuilder());
        System.out.println(director.createStudent());

    }
}
