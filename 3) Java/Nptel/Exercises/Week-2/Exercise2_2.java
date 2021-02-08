/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:29+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise2_2.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T06:48:05+05:30
 */



// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
		System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
		System.out.println(s);
    }
}

public class Exercise2_2  { 
    public static void main(String[] args) {
    	Printer pt = new Printer();
    	String  s;
    	s="Hi! I am class STUDENT";
    	pt.print(s);
    	pt.print();
    }
}
