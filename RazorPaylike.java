import java.util.*;
public class RazorPaylike
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int n=in.nextInt();
        int S[]=new int[n];
        int F[]=new int[n];
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            S[i]=in.nextInt();
            F[i]=in.nextInt();
            A[i]=in.nextInt();
        }
        int summax=0;int max=0;
        for(int i=0;i<n;i++)
        {
           int sum=A[i];max=0;
            System.out.println("New Sum "+A[i]);
            for(int j=i+1;j<n;j++)
            {  
                    if(S[j]>=F[i])
                    {
                        System.out.println("Tenta add "+A[j]);
                        if(A[j]>max)
                        max=A[j];
                }
            }
        System.out.println("confirm "+max);
            sum+=max;
            if(sum>summax)
            summax=sum;
        }
        System.out.println("The Max "+summax);
    }
}

            /*
        1 2 50 
        3 5 20
        6 19 100
        2 100 200
       */