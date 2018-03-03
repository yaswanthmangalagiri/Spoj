import java.util.*;
public class Interveiw
{
    public static int nonneg(int B[],int max)
    {
        int sum=0;int max=-1;
        for(int i=0;i<6;i++)
        {
            if(B[i]>0)
            {
                sum+=B[i];
            }
            else
            {
                if(max<sum)
                {
                    sum=0;                    
                }
            }
        }
        return sum;
    }
                  
    public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("The test cases?");
    int A[]=new int[6];
    for(int i=0;i<6;i++)
    {
        A[i]=in.nextInt();        
    }
    nonneg(A);    
}
}
