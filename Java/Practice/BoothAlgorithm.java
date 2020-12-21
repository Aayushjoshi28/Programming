import java.util.*;

public class BoothAlgorithm
{
        static int[] M = new int[4];
	    static int[] Q = new int[4];
	    static int[] Acc = new int[4];
	    static int[] A = new int[4];
	    static int Q_1 = 0, carry=0, borrow=0;
    public static void shift()
    {
        int i,j;
        Q_1 = Q[0];
        for(i=0;i<=3;i++)
        {
            if(i+1<=3)
                Q[i]=Q[i+1];
            else 
                Q[3] = Acc[0];
                
        }
        for(i=0;i<=3;i++)
        {
            if(i+1<=3)
                Acc[i]=Acc[i+1];
        }
        
    }
    
    public static int sub(int x , int y)
    {
        if(x==0 && y==0 || x==1 && y==1)
        {
            if(borrow==1)
            {
                return 1;
            }
            return 0;
        }
        else if(x==1 && y==0)
        {
            if(borrow ==1)
                return 0;
        }
        else if(x==0 && y==1)
        {
            if(borrow == 1)
            {
                borrow = 1;
                return 0;
            }
            
            borrow = 1;
            
        }
        return 1;
    }
    
    public static int add(int x , int y)
    {
        if(x==0 && y==0)
        {
            return 0;
        }
        else if(x==1 && y==1)
        {
            if(carry == 1)
            {
                carry =1;
                return 1;
            }
            carry =1;
            return 0;
            
            
        }
        else if(x==1 && y==0 || x==0 && y==1)
        {
            if(carry == 1)
            {
                carry = 1;
                return 0;
                
            }
            
            return 1;
        }
        return 1;
        
    }
    
    
	public static void main(String[] args) {
	    int i,j,count=4;
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter Multiplicand Starting from MSB:");
		for(i=3;i>=0;i--)
		{
		    M[i] = sc.nextInt();
		    Acc[i] = 0;
		}
		
		System.out.println("Enter Multiplier Starting from MSB:");
		for(i=3;i>=0;i--)
		{
		    Q[i] = sc.nextInt();
		    //B[i] = Q[i];
		}
		
		while(count>0)
		{
		    if(Q[0]==0 && Q_1==0 || Q[0]==1 && Q_1==1)
		    {
		        shift();
		    }
		    else if(Q[0]==1 && Q_1==0)
		    {
		        for(i=0;i<=3;i++)
		        {
		            Acc[i] = sub(Acc[i],M[i]);
		        }
		        shift();
		    }
		    else if(Q[0]==0 && Q_1==1)
		    {
		        for(i=0;i<=3;i++)
		        {
		            Acc[i] = add(Acc[i],M[i]);
		        }
		        shift();
		    }
		    System.out.printf("\n\n");
		  //  for(i=3;i>=0;i--)
		  //  {
		  //      System.out.printf(Acc[i]+" ");
		  //  }
		  //  System.out.printf("\t\t\t");
		  //  for(i=3;i>=0;i--)
		  //  {
		  //      System.out.printf(Q[i]+" ");
		  //  }
		  //  System.out.printf("\t\t "+Q_1+"\n\n");
		    count--;
		}
		System.out.println("The Output is: ");
		for(i=3;i>=0;i--)
		{
		    System.out.printf(Q[i]+" ");
		}
		
	}
}