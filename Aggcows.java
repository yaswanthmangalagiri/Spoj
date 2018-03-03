import java.util.*;
public class Aggcows
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter cases");
        int C=in.nextInt(); double factor=0;
        for(int c=0;c<C;c++)
        {
            int stalls=in.nextInt();
            int cow=in.nextInt(); 
            int pos[]=new int[stalls];
            int ref[]=new int[stalls];
            for(int i=0;i<stalls;i++)
            {
                pos[i]=in.nextInt();
                ref[i]=pos[i];
            }            
            long min=0;    long max=0;
            ref[0]=0;ref[stalls-1]=0; 
            while(cow!=0)
            {
                ArrayList<Integer> ele=new ArrayList<Integer>();
                int sum=0;
            for(int i=0;i<stalls;i++)
            {   
                if(ref[i]==0)
                {
                    ele.add(i);
                    sum+=i;
                }
            }
            int mid=sum/2;
            ref[mid]=0;
            System.out.println("REF"+pos[mid]);
                   long diff=0; long diff2=0;
                   diff=pos[mid]-pos[ele.get(0)];
                   diff2=pos[ele.get(1)]-pos[mid];
                   if(diff<=diff2)
                   {
                       max=diff2;
                    }
                    else 
                    {
                        max=diff;
                    }
                    
                if(max>min)
                {
                    min=max;
                }
            
            cow--;
        }
        System.out.println(min);
    }
}}