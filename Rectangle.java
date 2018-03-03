import java.util.Scanner;
public class Rectangle
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int C=in.nextInt();    int count=0;     
        for(int i=2;i<C;i++)
        {
            for(int j=i;j>0;j++)
            {
                if((i*j)<=C)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(C+count);
    }
}