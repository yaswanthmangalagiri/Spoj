import java.util.*;
public class Hckrndm
{
    int count=0;
    public boolean there(int array[],int beg,int end,int rndm)
    {
         if(end>=beg)
        {
             int mid=(end+beg)/2;
             if(array[mid]==rndm)
            {
                count++;
                return true;
            }
            else if(rndm>array[mid])
            {
                there(array,mid+1,end,rndm);
            }
            else 
            {
               there(array,beg,mid-1,rndm);
            }  
        }
        return false;
    }
    public static void main(String args[])
    {
        Hckrndm h=new Hckrndm();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two nos");
        int n=in.nextInt();
        int k=in.nextInt();
        int NA[]=new int[n];
        for(int i=0;i<n;i++)
        {
            NA[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(NA[i]>NA[j])
            {
                int temp=NA[i];
                NA[i]=NA[j];
                NA[j]=temp;
            }
        }
        }
        int test=0;
        for(int i=0;i<n;i++)
        {
            test=NA[i]+k;
           h.there(NA,0,n-1,test);
        }
                    System.out.println(h.count);
    }
}
                    