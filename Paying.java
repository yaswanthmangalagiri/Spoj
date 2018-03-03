import java.util.*;
public class Paying
{
    public static void main(String args[])
    {
        System.out.println("Enter the cases later N");
        Scanner in=new Scanner(System.in);  
        int c=in.nextInt();
        for(int i=0;i<c;i++)
        {
            int count=0;
            double n=in.nextDouble();
            double sum=1;
                int j=0;
            for(int pay=1;pay<=n;pay++)
            {
                System.out.println("To Pay"+pay);
                if(pay<=sum)
                    {   
                    }               
                    else
                    {
                        if((sum+Math.pow(2,j+1)<n))
                        {
                             System.out.println( "Incremented ");
                        j++;
                        count++;sum=sum+Math.pow(2,j);
                    }
                    else
                    {
                        count++;
                        sum=sum+Math.pow(2,j);
                      
                    }         
                      System.out.println( "Sum "+sum+" Coins "+Math.pow(2,j));
                }                     
        }
        System.out.println(count);
    }
}
}