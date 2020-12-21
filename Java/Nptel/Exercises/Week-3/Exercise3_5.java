/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:37:11+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise3_5.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T07:25:09+05:30
 */
 import java.util.Scanner;
 class Question {  //Define a class Question with two elements e1 and e2.
   Scanner sc = new Scanner(System.in);
   int e1 = sc.nextInt();  //Read e1
   int e2 = sc.nextInt();  //Read e2
  }
 public class Question5 {
 public static void swap(Question t) {
     int temp = t.e1;
     t.e1 = t.e2;
     t.e2 = temp;
   }
 public static void main(String[] args) {
  //Create an object of class Question
    	Question t = new Question();
   //Call the method swap()
         swap(t);

     System.out.println(t.e1+" "+ t.e2);
   }

 }
