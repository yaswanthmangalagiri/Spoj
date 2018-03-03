import java.util.*;
public class EatCake
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int T=in.nextInt();         
        for(int t=0;t<T;t++)
        {
            int count=0;
            int n=in.nextInt();
            while(n!=0)
            {
            for(int i=1;i<=n;i++)
            {
                if((i*i)==n)
                {
                    count++;   
                    n-=(i*i);
                    break;
                }
                else if((i*i)>n)                
                {
                    n-=((i-1)*(i-1));
                    count++;         
                    break;
                }
            }
        }
            System.out.println("Case #"+(t+1)+": "+count);
        }
    }
}
