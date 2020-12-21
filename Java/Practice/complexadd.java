
import java.util.*; 
import java.util.Scanner;
class Complex {
	int real, imaginary; 
	Complex() 
	{ 
	} 
	Complex(int tempReal, int tempImaginary) 
	{ 
		real = tempReal; 
		imaginary = tempImaginary; 
	} 
	Complex addComp(Complex C1, Complex C2) 
	{ 
		Complex temp = new Complex(); 
		temp.real = C1.real + C2.real; 
		temp.imaginary = C1.imaginary + C2.imaginary; 
		return temp; 
	} 
} 
public class complexadd {
	public static void main(String[] args) 
	{ 
        int real1,img1,real2,img2;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter real part for first complex no: ");
		real1 = sc.nextInt();
		System.out.println("Enter imaginary part for first complex no: ");
		img1 = sc.nextInt();
		Complex C1 = new Complex(real1, img1); 

		System.out.println("Complex number 1 : " + C1.real + " + i" + C1.imaginary); 
		System.out.println("Enter real part for second complex no: : ");
		real2 = sc.nextInt();
		System.out.println("Enter imaginary part for second complex no: ");
		img2 = sc.nextInt();
		Complex C2 = new Complex(real2, img2); 

		System.out.println("Complex number 2 : " + C2.real + " + i" + C2.imaginary); 

		Complex C3 = new Complex();

		C3 = C3.addComp(C1, C2); 
        C1 = C1.addComp(C1, C2); 

		System.out.println("Sum of complex number in C3: " + C3.real + " + i" + C3.imaginary); 
    System.out.println("Sum of complex number in C1: " + C1.real + " + i" + C1.imaginary); 
	} 
} 
