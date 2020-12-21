/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-12T22:52:53+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: DInput_Stream.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-12T23:20:08+05:30
 */
import java.io.*;

class DInput_Stream {
  public static void main(String[] args) {
      Float principalAmount = new Float(0);
      Float rateOfInterest = new Float(0);
      int numberOfYears = 0;
      try{
        DataInputStream in = new DataInputStream(System.in);

        String tempString;
        System.out.print("Enter principal Amount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);

        System.out.print("Enter Rate Of Interest: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);

        System.out.print("Enter Number Of Years: ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);

        float interestTotal = principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total Interest = "+ interestTotal);
      }
      catch (Exception ex)
      {}
  }
}
