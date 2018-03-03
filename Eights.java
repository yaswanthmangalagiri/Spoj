import java.util.*;
public class Eights
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        long t=in.nextLong();
        for(long i=0;i<t;i++)
        {
            long k=in.nextLong();
            long result=(k-1)*250+192;
            System.out.println(result);
            }            
    }
}