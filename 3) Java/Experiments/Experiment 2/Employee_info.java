/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Emp.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:21:23+05:30
 */


import java.util.*;
import java.io.*;

class EmployeeId
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

class Employee_info
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream din = new DataInputStream(System.in);
		int empd,bs,da,hra,it;
		String empname;
		EmployeeId e1= new EmployeeId();
		System.out.println("Enter employee id:");
		empd=Integer.parseInt(din.readLine());
		System.out.println("Enter employee name:");
		empname=din.readLine();
		System.out.println("Enter basic salary:");
		bs=Integer.parseInt(din.readLine());
		System.out.println("Enter DA:");
		da=Integer.parseInt(din.readLine());
		System.out.print("Enter HRA:");
		hra=Integer.parseInt(din.readLine());
		System.out.print("Enter Income Tax:");
		it=Integer.parseInt(din.readLine());
		e1.getData(empd,empname,bs,da,hra,it);
		e1.Calculation();
		e1.Display();
	}
}
