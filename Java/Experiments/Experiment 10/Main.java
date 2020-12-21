import java.util.*;  
class Employee  {
    int empno;  
    String name;  
    float sal;  
    void acceptEmp()  {  
 	Scanner sc=new Scanner(System.in);  
    System.out.println("Enter Employee number:");          
    empno=sc.nextInt();  
    System.out.println("Enter Employee name:");  
 	name=sc.next();  
    }  
    void dispEmp()  {  
    System.out.println("Employee number:"+empno);          
    System.out.println("Employee name:"+name);  
    }  
}  
  
class FullTimeEmployee extends Employee  {  
    float basic,hra,da;  
    void getdata1()  {  
 	Scanner sc=new Scanner(System.in);  
    System.out.println("Enter basic salary:");  
 	basic=sc.nextFloat();  
    System.out.println("Enter HRA:");          
    hra=sc.nextFloat();  
    System.out.println("Enter DA:");   	
    da=sc.nextFloat();  
    }  
    void dispdata1()  {  
    System.out.println("Basic salary:"+basic);  
    System.out.println("HRA:"+hra);          
    System.out.println("DA:"+da);  
    }  
 	 
    void calcdata1()  {  
        sal=basic+hra+da;  
        System.out.println("The salary of the full-time employee is:"+sal);  
    }  	 
}  
  
  
class PartTimeEmployee extends Employee  {  
float workinghours;  float wage;  void getdata2()  {  
 	Scanner sc=new Scanner(System.in);  
    System.out.println("Enter working hours:");          
    workinghours=sc.nextFloat();          
    System.out.println("Enter Wage:");   	
    wage=sc.nextFloat();  
    }  
    void dispdata2()  {  
        System.out.println("Working hours:"+workinghours);  
        System.out.println("Wage is:"+wage);  
    }  
    void calcdata2()  
    {  
        sal=wage*workinghours;  
        System.out.println("The salary of the part-time employee is:"+sal);  
    }  
}  
  
    
public class Main  
{  
public static void main(String []args)  
{  
 	Scanner sc=new Scanner(System.in);  
 	Employee e=new Employee();  
    FullTimeEmployee e1=new FullTimeEmployee();          
    PartTimeEmployee e2=new PartTimeEmployee();   	
    int choice;  
    System.out.println("Enter choice for\n1.Full Time Employee\n2.Part Time Employee");   	
    choice=sc.nextInt();   	
    switch(choice)  {  
 	case 1:  
            System.out.println("----ENTER DETAILS----");  
            e.acceptEmp();  
 	        e1.getdata1();  
            System.out.println("-----FULL-TIME EMPLOYEE-----");              
            e.dispEmp();  
 	        e1.dispdata1();   	
            e1.calcdata1();   	
            break;  
 	case 2:  
            System.out.println("----ENTER DETAILS----");              
            e.acceptEmp();  
 	        e2.getdata2();  
            System.out.println("-----PART-TIME EMPLOYEE-----");              
            e.dispEmp();  
 	        e2.dispdata2();   	
            e2.calcdata2();   	
            break;    
 	default:  
            System.out.println("Enter valid choice!");  
  
 	}  
  }  
}  
