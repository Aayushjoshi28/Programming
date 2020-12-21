import java.util.*; 
import java.io.*; 
public class Exp_of_Vectors { 
	public static void main(String args[]) { 
		Scanner input = new Scanner(System.in); 
		Vector v = new Vector(); 
		int ch,i,n,pos; 
		String elem; 
		System.out.println("Enter Number Of Items"); 
		n=input.nextInt(); 
		System.out.println("Enter Your Items"); 
		for(i=0;i<n;i++) { 
			System.out.printf("Enter item %d\n",i+1); 
			elem=input.next(); 
			v.addElement(elem); 
		} 
		do { 
			System.out.println("---------------------------------------------------------------------"); 
			System.out.println("1. Add "); 
			System.out.println("2. Remove "); 
			System.out.println("3. Search "); 
			System.out.println("4. Display "); 
			System.out.println("5. Exit ");
			System.out.print("Enter Your Choice:"+" ");  
			ch=input.nextInt(); 
			System.out.println(); 
			switch(ch) { 
				case 1:	System.out.println("Enter Your Item to be Inserted"); 
						elem=input.next(); 
						System.out.println("Enter Your Position at which you want to insert your Item"); 
						pos=input.nextInt(); v.add(pos-1,elem); 
						System.out.println(); 
						break; 
				case 2:	if(!v.isEmpty()) { 
							System.out.println("List is:"); 
							for(i=0;i<v.size();i++) { 
								System.out.println(v.elementAt(i)); 
							} 
						} 
						else { 
							System.out.println("List Underflow"); 
							break; 
						} 
						System.out.println("Enter Position of element which is to be removed"); 
						pos=input.nextInt(); 
						System.out.println("Deleted Element From the List is: "+ v.elementAt(pos-1)); 
						v.removeElementAt(pos-1); 
						System.out.println(); 
						break; 
				case 3:	System.out.println("Enter Your Element to be searched"); 
						elem=input.next(); 
						pos=-1; 
						pos=v.indexOf(elem,0); 
						if(pos!=-1) { 
							System.out.println("Element Found At"+(pos+1)+" position"); 
						} 
						else { 
							System.out.println("Element Not Found"); 
						} 
						System.out.println(); 
						break; 
				case 4:	if(!v.isEmpty()) { 
							System.out.println("List is:"); 
							for(i=0;i<v.size();i++) { 
								System.out.println(v.elementAt(i)); 
							} 
						} 
						else { 
							System.out.println("List Underflow"); 
						} 
						break; 
				case 5:	System.out.println("Exiting The Program"); 
						break; 
				default:System.out.println("Wrong Choice"); 
			} 
			
		} while(ch!=5); 
		input.close(); 
	} 
}