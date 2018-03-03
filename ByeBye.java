import java.util.*;
public class ByeBye
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        while(1!=0)
        {
            int ingA[]=new int[8];
            int max=0;
            for (int i=0;i<8;i++ ) 
            {
                ingA[i]=in.nextInt();
            }
            if(ingA[0]==-1)
            {
                break;
            }
            for (int i=0;i<4 ;i++ )
            {
                double div=(double)ingA[i]/ingA[i+4];             
                if(div>(int)div)
                {
                    div=(int)div+1;
                }
                if((int)div>max)
                {
                    max=(int)div;
                }   
            }  
            int diff=0;            
            for (int i=0;i<4 ;i++ ) 
            {
                diff=(ingA[i+4]*max)-ingA[i];
                if(diff<0)
                {
                    diff*=-1;
                }
                System.out.print(diff+" ");
            }           
            System.out.println();
        }
    }
}