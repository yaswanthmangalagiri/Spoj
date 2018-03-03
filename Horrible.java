import java.util.*;
public class Horrible
{
    public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("The test cases?");
    int t,N,C;
    t=in.nextInt();
    
    for(int T=0;T<t;T++)
    {
        N=in.nextInt();
    C=in.nextInt();
    long arr[]=new long[N];
    int test,inst,inend,val;
    for(int i=0;i<C;i++)
    {
        test=in.nextInt();
        if(test==1)
        {
            long sumof=0;
            inst=in.nextInt();
            inend=in.nextInt();
            for(int j=inst-1;j<inend;j++)
            {
                sumof+=arr[j];          
            }           
                System.out.println(sumof);             
        }
        else
        {
            inst=in.nextInt();
            inend=in.nextInt();
            val=in.nextInt();
                for(int j=inst-1;j<inend;j++)
            {
                arr[j]+=val;
            }
        }   
    }
}
}
}