import java.util.*;
public class Kickstart
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
     System.out.println("Enter the cases");   
     int T=in.nextInt();
        for(int t=1;t<=T;t++)
        {       
            int N=in.nextInt();
            ArrayList<Integer> R=new ArrayList<Integer>();
            ArrayList<Integer> B=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
        {
            int n=in.nextInt();
            R.add(i,n);            
        }
        for(int i=0;i<N;i++)
        {
            int n=in.nextInt();
            B.add(i,n);            
        }
        R.sort();
        B.sort();
        int total=0;
        for(int i=0;i<N-1;i++)
        { 
            R.sort();
        B.sort();
            int bitx=R[i]^B[i];
            total+=bitx;
            if(R.get(i)<B.get(i))
            {
               B.remove(i);
               R.add(i,R.get(i));
            }
            else
            {
            R.remove(i);
             B.add(i,B.get(i));
            }
        }
        System.out.println("Case #"+t+": "+total);
    }
}
}