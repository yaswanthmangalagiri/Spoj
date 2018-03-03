import java.util.Scanner;
public class QueriesI
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Ente the num");
        int N=in.nextInt();
            int NA[]=new int[N];
            for(int i=0;i<N;i++)
            {
                NA[i]=in.nextInt();
            }
            int M=in.nextInt();           
            for(int m=0;m<M;m++)
            {
                int x=in.nextInt();
                int y=in.nextInt();
            int max=-100000;       
            for(int i=x;i<=y;i++)
            {  
                int sum=0; 
                for(int j=i;j<=y;j++)
                {
                sum+=NA[j-1];
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