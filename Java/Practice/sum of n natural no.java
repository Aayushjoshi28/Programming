import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        int num, count, total = 0;


        System.out.println("Enter the value of n:");
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        num = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
    }
}
