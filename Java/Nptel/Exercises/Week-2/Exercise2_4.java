/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:40+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise2_4.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T06:49:17+05:30
 */



// This is the main class Question
public class Exercise2_4	{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}

class Answer{
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){
		this();
		System.out.println("You got "+marks+" for an "+ type);
	}
}
