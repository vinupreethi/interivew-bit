package org.designpatterns.StructuralDesignPatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[])
    {
        List<Student> studentList=new ArrayList<>();
        College college=new College("vinu","vinu321@gmail.com","98231321");
        School school=new School("vinu","vinu@gmail.com","34234342");
        studentList.add(new SchoolAdapter(school));
        studentList.add(college);
       // System.out.println(studentList);
        for(Student student:studentList)
            System.out.println(student.getName()+" "+student.getEmail()+" "+student.getPhone());
    }
}
