import java.util.*;
public class BuyingApples
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int C=in.nextInt(); 
        for(int c=0;c<C;c++)
        {            
            int N=in.nextInt();
            int K=in.nextInt();
            int KA[]=new int[K];
            int count=0;
            for(int i=0;i<K;i++)
            {
                KA[i]=in.nextInt();
                if(KA[i]>0)
                {                   
                    count++;
                }
            }
            int newKA[]=new int[count];
            int Price[]=new int[count];
            int k=0;int price=0;
            for(int i=0;i<K;i++)
            {               
                if(KA[i]>0)
                {
                    newKA[k]=i+1;
                    Price[k]=KA[i];
                    k++;
                }
            }
            int decision=0;
            if(K>=newKA[0])
            {
                 for(int j=0;j<count;j++)
                {                        
                    if(K%newKA[j]==0)
                    {
                        System.out.println("The value is "+newKA[j]);
                        int apples=K/newKA[j];
                        System.out.println("Price" +price);
                        price+=apples*Price[j];                        
                        decision=1;
                        break;
                    }
                }
                if(decision==1)
                {
                    System.out.println("Breaking ");
                    break;
                }
            for(int i=0;i<count;i++)
            {
                System.out.println("failed first");
                K-=newKA[i];                
                price+=Price[i];
                for(int j=0;j<count;j++)
                {                        
                    if(K%newKA[j]==0)
                    {
                        price+=(K/newKA[j])*Price[j];
                        decision=1;
                        break;
                    }
                }
                if(decision==1)
                {
                    break;
                }
            }
        }
            if(decision==0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(price);
            }
            }
        }
    }