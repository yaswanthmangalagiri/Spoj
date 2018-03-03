import java.util.*;
public class BetweenMountains
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter cases");
        int C=in.nextInt(); double factor=0;
        for(int c=0;c<C;c++)
        {
            int m1=in.nextInt();
            int M1[]=new int[m1]; 
            for(int i=0;i<m1;i++)
            {
                M1[i]=in.nextInt();
            }
            int m2=in.nextInt();
            int M2[]=new int[m2];            
            for(int i=0;i<m2;i++)
            {
                M2[i]=in.nextInt();
            }
            int min=1000000;
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                  int difftest=M2[j]-M1[i];
                  if(difftest<0)
                  {
                      difftest*=-1;
                    }
                  if(min>difftest)
                  {
                      min=difftest;
                }                   
            }
        }
            System.out.println(min);
        }
    }
}
                    