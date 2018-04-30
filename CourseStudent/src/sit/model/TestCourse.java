/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author GIFS
 */
public class TestCourse {
    public static void main(String[] args) {
        
        Course Course = new Course("Miracle Of Life", 3);
        RegisStudent addedStudent1=new RegisStudent(1, "SomChai");
        RegisStudent addedStudent2=new RegisStudent(2, "SomSri");
        RegisStudent addedStudent3=new RegisStudent(3, "SomBat");
        Course.addStudent(addedStudent1);
        Course.addStudent(addedStudent2);
//        Course.addStudent(addedStudent3);
        
        System.out.println(Course.getNumberOfStudents());
        
        
    }
}
