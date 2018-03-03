import java.util.*;
public class HappyTl
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);   
        System.out.println("Enter the n&M");
        while(1!=0)
        {
            int n=in.nextInt();
           int  M=in.nextInt();
           if(n==0)
           {
               break;
            }
        int call[][]=new int[n][4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4;j++)
            {
                call[i][j]=in.nextInt();
            }
        }
        for(int m=0;m<M;m++)
        {
            int count=0;
            int sche=in.nextInt();
            int dche=in.nextInt();
            int endcheck=sche+dche;
            for(int i=0;i<n;i++)
            {
                int endcall=call[i][2]+call[i][3];
                    if((call[i][2]<=sche)&&((sche+1)<=endcall))
            {
                count++;
            }
            else if((endcheck>=(call[i][2]+1))&&(endcheck<=endcall))
            {
                count++;
            }
        }           
        System.out.println(count);
    }
    } 
}
}
