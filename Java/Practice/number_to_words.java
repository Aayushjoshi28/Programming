import java.util.Scanner;
class Calculate
{ 
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number to convert in words:");
    int n = sc.nextInt();
    System.out.print(n);
    //Object created of class numConWords
    numtoWords nw = new numtoWords();
    nw.generateWords((n / 1000000000), " Hundred");
    nw.generateWords((n / 10000000) % 100, " crore");
    nw.generateWords(((n / 100000) % 100), " lakh");
    nw.generateWords(((n / 1000) % 100), " thousand");
    nw.generateWords(((n / 100) % 10), " hundred");
    nw.generateWords((n % 100), " ");
  }
}
class numtoWords
{

  void generateWords(int n, String ch)
  {
    String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
        " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
        " Nineteen" };

    String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };

    if (n > 19)
    {
      System.out.print(ten[n / 10] + " " + one[n % 10]);
    }
    else
    {
      System.out.print(one[n]);
    }
    if (n > 0)
      System.out.print(ch);
  }
}
