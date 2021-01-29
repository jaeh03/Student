/*
 * John Ho
 * Student ID: 991619682

 */
package student;

/**
 *
 * @author johnt
 */
public class StudentList {
    public static void main(String[] args) {
        Student []studentList = new Student[3] ;
        
        Student s1 = new Student(); 
        s1.setName("Ronak");
        
        Student s2 = new Student(); 
        s2.setName("Sheth");
        
        studentList[0] = s1;
        studentList[1] = s2; 
        
        for(Student s : studentList){
            System.out.println(s.getName());
        }
    }
}
