import java.util.*;
public class Quicksort
{
   static int wc=0;int les=0;int grt=0;
    public void quick(int arr[],int start,int end)
    {
        int pivot=(end-start)/2;
        quick(arr,0,pivot);            
        quick(arr,pivot+1,end);
        for(int i=start;i<=end;i++)
        {
            if(arr[i]<=arr[pivot])
            {
                les++;
            }
            else
            {
                grt++;
            }            
        }
        if((les!=0)||(grt!=0))
        System.out.println("WORST");
    }    
    public static void main(String args[])
    { 
        Quicksort q=new Quicksort();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int T=in.nextInt();         
        for(int t=0;t<T;t++)
        {
            int N=in.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i]=in.nextInt();
            }
            q.quick(arr,0,N-1);
            if(wc!=0)
                System.out.println("case #"+(t+1)+":"+" YES");
            else
                System.out.println("case #"+(t+1)+":"+" NO");
        }
    }
}
            