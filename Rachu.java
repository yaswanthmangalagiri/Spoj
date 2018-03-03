import java.util.*;
public class Rachu
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
            System.out.println("Enter the Muffins and friends");
            long m=in.nextLong();
            long f=in.nextLong(); 
            long lim=f-1;
            long num=1;long den=1;
            for(long i=(m+f-1);i>=lim;i--)
            {
                num*=i--;
            }
            for(long i=(f-1);i>=1;i--)
            {
                den*=i--;
            }
            long result=(num/den)-1;
            System.out.println("Ways "+result);
        }
    }