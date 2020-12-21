import java.io.*;
class Employee
{
    int empId;
    String empName;
    int basic_salary,DA,HRA,income_tax;
    double gross_salary;
    void getData(int a,String n,int b,int c,int d,int e)
    {
        empId=a;
        empName=n;
        basic_salary=b;
        DA=c;
        HRA=d;
        income_tax=e;
    }
    void Display()
    {
    	System.out.println("Employee ID:"+empId);
    	System.out.println("Employee Name:"+empName);
    	System.out.println("Basic Salary:"+basic_salary);
    	System.out.println("DA:"+DA);
    	System.out.println("HRA:"+HRA);
    	System.out.println("Income Tax:"+income_tax);  	
        System.out.println("Gross Salary:"+gross_salary);
    }   
    void Calculation()
    {
        gross_salary=basic_salary+DA+HRA-income_tax;
    }
}
public class Emp
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream din=new DataInputStream(System.in);
		int empd,bs,da,hra,it;
		String empname;
		Employee e1;
		e1= new Employee();
		System.out.print("enter employee id:");
		empd=Integer.parseInt(din.readLine());
		System.out.print("enter employee name:");
		empname=din.readLine();
		System.out.print("enter basic salary:");
		bs=Integer.parseInt(din.readLine());
		System.out.print("enter DA:");
		da=Integer.parseInt(din.readLine());
		System.out.print("enter HRA:");
		hra=Integer.parseInt(din.readLine());
		System.out.print("enter Income Tax:");
		it=Integer.parseInt(din.readLine());
		e1.getData(empd,empname,bs,da,hra,it);		
		e1.Calculation();
		e1.Display();	
	}
}

