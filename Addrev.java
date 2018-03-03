import java.util.*;
public class Addrev
{
    public long reverse(long torev)
    {
        long revsum=0; long rem=0;
          while(torev%10==0)
           {
                torev/=10;
            }
        while(torev!=0)
        {           
            rem=torev%10;
            revsum=revsum*10+rem;
            torev/=10;
        }
        return revsum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Addrev ar=new Addrev();        
        System.out.println("Enter cases");
        long N=in.nextLong(); 
        for(long i=0;i<N;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long sum=0;
            a=ar.reverse(a);
            b=ar.reverse(b);
            sum=a+b;
            sum=ar.reverse(sum);
            System.out.println(sum);
        }
    }
}