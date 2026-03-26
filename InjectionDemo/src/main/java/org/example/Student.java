package org.example;

public class Student {

    private Course course;// course type ka object

    //Dependency injection
    //setter injection

    public Student(){
    }
    public Student(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();
        if(start>=1){
            System.out.println("journey Started.....");

        }
        else{
            System.out.println("Payment failed....");
        }
    }
}
