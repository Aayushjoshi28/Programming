/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:37:05+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise3_4.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T07:24:36+05:30
 */



import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

 QuestionScope st = new QuestionScope(); // Create an object to call non-
                                                //static method
        int result1=st.sum(n1,n2);       // Call the method
        int result2=QuestionScope.multiply(n1,n2);	// Create an object to call
                                                //static method

        System.out.println(result1);
	System.out.println(result2);

}
}
