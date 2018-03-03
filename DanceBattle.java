import java.util.*;
public class DanceBattle
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int t=in.nextInt();         
        for(int i=0;i<t;i++)
        {
            int honor=0;
            int E=in.nextInt();
            int N=in.nextInt();
            int NA[]=new int[N];
            for(int n=0;n<N;n++)
            {
                NA[n]=in.nextInt();
            }
            int flag=0;       
            for(int j=0;j<N;j++)
            {                                   
                if(NA[j]!=0)
                {
                if(NA[j]<E)                
                {
                    honor++;
                    E-=NA[j];
                    NA[j]=0;                   
                    flag++;
                }
                else if(honor>0)
                {
                    E+=NA[j];
                    NA[j]=0;
                    honor--;
                    flag++;
                }
                if(j==(N-1))
                {
                    if(flag>0)
                    {
                    flag=0;j=-1;
                }
                else 
                    break;
                }
            }
        }
        System.out.println("case #"+(i+1)+": "+honor);
    }
}
}