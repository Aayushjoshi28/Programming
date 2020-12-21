import java.util.*;  
public class Main  
{  
 	public static void main(String[] args)  
 	{  
 		Scanner sc = new Scanner(System.in);  
   		System.out.println("Input a Sentence: ");  
 		String line = sc.nextLine();  
 		String upper_case_line = "";   	
 		Scanner lineScan = new Scanner(line);   	
 		while(lineScan.hasNext())  
 		{  
    		String word = lineScan.next();               
    		upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";  
	 	}  
      	System.out.println(upper_case_line.trim());  
	}  
}
