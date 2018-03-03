import java.util.Scanner;
public class Queries
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter cases");
        int C=in.nextInt();
            for(int c=0;c<C;c++)
        {
            int N=in.nextInt();
            int NA[]=new int[N];
            for(int i=0;i<N;i++)
            {
                NA[i]=in.nextInt();
            }
            int M=in.nextInt();           
            for(int m=0;m<M;m++)
            {
            int X[]=new int[2];
            int Y[]=new int[2];
            for(int i=0;i<2;i++)
            {
                X[i]=in.nextInt();
                Y[i]=in.nextInt();
            }
            int max=-100000;        
            for(int i=X[0];i<=Y[0];i++)
            {                    
                for(int j=X[1];j<=Y[1];j++)
                {   int sum=0;
                    for(int k=i;k<=j;k++)
                    {
                        sum+=NA[k-1];
                    }
                    if(sum>=max)
                    {
                        max=sum;
                    }                  
                }     
            }
         System.out.println(max);  
            }
        }
    }
}