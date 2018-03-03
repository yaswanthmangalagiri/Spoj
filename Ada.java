import java.util.*;
public class Ada
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int N=in.nextInt(); 
        int Q=in.nextInt();
        int NA[]=new int[100000];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
        }
        for(int q=0;q<Q;q++)
        {
            int a=in.nextInt();
            if(a==1)
            {
                int k=in.nextInt();
                int x=in.nextInt();
                for(int n=N;n>=k;n--)
                {
                NA[n]=NA[n-1];
            }
            NA[k-1]=x;
        }
          else if(a==2)
            {
                int k=in.nextInt();
                for(int n=k;n<N;n++)
                {
                NA[n-1]=NA[n];
            }
            }
            else
            {
                int k=in.nextInt();
                System.out.println(NA[k-1]);
            }
        } 
    }
    }