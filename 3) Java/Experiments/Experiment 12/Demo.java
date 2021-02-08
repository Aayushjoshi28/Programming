import java.util.*;  
  
public class Student  {  
  String name;    
  int rno;  
  Scanner sc = new Scanner(System.in);    
  void accept1()  
  {  
        System.out.println("Enter the name of the student");  
      name = sc.nextLine();  
        System.out.println("Enter the roll no. of the student");                  
        rno = sc.nextInt();  
  }  
}  
  
public class Test extends Student  {  
   double sub1 , sub2 ;  
   Scanner sc = new Scanner(System.in);  
   void accept2()  {  
        System.out.println("Enter the marks of subject 1");     
        sub1 = sc.nextDouble();  
        System.out.println("Enter the name of subject 2");    
        sub2 = sc.nextDouble();  
   }  
}  
  
public interface Marksheet  {  
    String clg= "SAKEC";  public void calcMark();  
}  
  
public class Marks extends Test implements Marksheet  {  
    double marks;  
    String clgName;  
    Scanner sc = new Scanner(System.in);  
  
    public void acceptClgName()  {  
        System.out.println("Enter the College Name");          
        clgName = sc.nextLine();  
    }  
  
    public void calcMark()  {  
      marks = (sub1 + sub2)/2;  
        System.out.println();  
        System.out.println("Student Name\tR.NO\tCollegeName\tsub1\tsub2\tMarks");  
        System.out.println(name+"\t\t"+rno+"\t"+clg+"\t\t"+sub1+"\t"+sub2+"\t"+marks);  
    }  
}  
  
public class Demo  
{  
    public static void main(String args[])  {  
      Marks m1 = new Marks();     
      m1.accept1();     
      m1.accept2();  
      m1.calcMark();   
  }  
}