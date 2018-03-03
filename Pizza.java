import java.util.Scanner;
public class Pizza
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=in.nextInt(); 
        String pf[]=new String[n];
        int counthalf=0;int counttf=0; ;
        int  pizzas=1;int countq=0;    
        for(int i=0;i<n;i++)
        {
            pf[i]=in.next();
            if(pf[i].equals("1/2"))
            {
               counthalf++;
            }
            else if(pf[i].equals("3/4"))
            {
               counttf++;
            }
            else
            {
               countq++;
            }
        }           
         System.out.println("Count TF i"+counttf);   
         System.out.println("Count Half i"+counthalf);
           System.out.println("Count Half"+counthalf);
        if(countq>counttf)
        {
            countq=countq-counttf;
        } 
      else
        {
            countq=0;
        } 
         if(counthalf%2>0)
        {
        if(countq>counthalf)
        {
            countq=countq-2;
        } 
        else
        {
            countq=0;
        } 
        counthalf++;
    }        
         System.out.println("Countq "+countq);
        if(countq%4>0)
        {
            countq=1+(countq/4);
    }
    else
    {
        countq/=4;
    }
   System.out.println(counttf+" "+counthalf+" "+countq);
       pizzas+=counttf+(counthalf/2)+(int)countq;
        System.out.println(pizzas);
    }
}