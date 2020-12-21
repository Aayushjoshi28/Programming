/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T07:25:26+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: do_while_and_switch_case_in_Menu.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T07:54:32+05:30
 */
import java.util.Scanner;

class do_while_and_switch_case_in_Menu  {
  public static void main(String args[]) throws java.io.IOException {
    Scanner scan = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Get Help On Below Loops:"+" ");
      System.out.print("1.if"+" ");
      System.out.print("2.switch"+" ");
      System.out.print("3.while"+" ");
      System.out.print("4.do-while"+" ");
      System.out.print("5.for\n");
      System.out.print("Choose the Loop For Which U Need Help:"+" ");
      choice = scan.nextInt();
    } while((choice < 1) || (choice > 5));

    System.out.println("\n");
    switch(choice)  {
      case 1 :
        System.out.println("The if:\n");
        System.out.println("if(conditional) statement;");
        System.out.println("else statement;");
        break;

      case 2 :
        System.out.println("The switch:\n");
        System.out.println("switch(expression) {");
        System.out.println("case constant");
        System.out.println("statement sequence");
        System.out.println("break;");
        System.out.println("//....");
        System.out.println("}");
        break;

      case 3 :
        System.out.println("The while:\n");
        System.out.println("while(condition) statement;");
        break;

      case 4 :
        System.out.println("The do-while:\n");
        System.out.println("do {");
        System.out.println("statement;");
        System.out.println("} while(condition);");
        break;

      case 5 :
        System.out.println("The for:\n");
        System.out.println("for(init;condition;iteration)");
        System.out.println("statement;");
        break;
    }
  }
}
