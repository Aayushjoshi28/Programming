/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:34+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise2_3.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T06:50:21+05:30
 */



// This is the main class Question
public class Exercise2_3{
    public static void main(String[] args) {
		// Object of the main class is created
		Exercise2_3 q = new Exercise2_3();
		// Print method on object of Question class is called
		q.studentMethod();
    }

	// 'print()' method is defined in class Question
	void print(Exercise2_3 object){
		System.out.print("Well Done!");
	}
// Define a method named 'studentMethod()' in class Question
	void studentMethod()
	{
		Exercise2_3 qt = new Exercise2_3();
		// Call the method named 'print()' in class Question
		print(qt);
  	}
}
