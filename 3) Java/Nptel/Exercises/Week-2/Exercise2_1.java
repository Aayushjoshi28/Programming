/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:21+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise2_1.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T06:47:26+05:30
 */



// This is the class named School
class School {
    // This is a method in class School
    public void print() {
		System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
	// This is a method in class Student
    public void print() {
		System.out.println("Hi! I am class STUDENT");
    }
}

public class Exercise2_1  { 
    public static void main(String args[]){
    	Student st = new Student();
    	st.print();
    	School sc = new School();
    	sc.print();
	}
}
