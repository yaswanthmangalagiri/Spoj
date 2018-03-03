import java.util.*;
public class Progression
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);int factor=0;
         System.out.println("Enter the numbers");
        for(int i=0;i<100;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
        if((a==b)&&(b==c))
        {
            break;
        }
            if((a+c)==(2*b))
                {
                  factor=c-b;
                    System.out.println("AP"+" "+(c+factor));
                }
                else
                {
                     factor=c/b;
                    System.out.println("GP"+" "+(c*factor));                    
                }
        }
    }
}
