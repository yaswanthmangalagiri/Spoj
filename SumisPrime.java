import java.util.*;
public class SumisPrime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter cases");
        long C=in.nextLong();
        for(long c=0;c<C;c++)
        {
        long a=in.nextLong();
        long b=in.nextLong();
        long ans=0;
        for(long te=a;te<=b;te++)
        {
           long sum=0;
            for(long i=1;i<=te;i++)
            {
                if(te%i==0)
                {
                    sum+=i;
                }
            }
                long count=0;
                for(long k=1;k<=sum;k++)
                {
                    if(sum%k==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                    ans++;
                }            
            te++;            
        }
        System.out.println(ans);
    }
    }
}
            