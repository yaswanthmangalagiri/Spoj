import java.util.*;
public class Bracket
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int leng=in.nextInt(); 
        int bit[]=new bit[leng];
        String bracket=in.next();
        int oper=in.nextInt(); 
        for(int t=0;t<10;t++)
        {  
            int series=in.nextInt();
            for(int i=0;i<leng;i++)
            {
                if(bracket.charAt(i)=='(')
                 {
                     bit[i]=1;
                    }
                    else
                    {
                        bit[i]=2;
                }
            }
            for(int s=0;s<series;s++)
            {       
                int check=in.nextInt();
                    if(check>0)
                    {
                        if(bit[check]==1)
                        {
                        bit[check]=2;
                    }
                    else
                    {
                          bit[check]=1;
                    }
                }
                    else
                    {
                        for(int i=1;i<leng;i++)
                        {
                            if(bit[i]==1)&&(bit[i+])
                        System.out.println("NO");
                    }
                }
            }
        }
    }