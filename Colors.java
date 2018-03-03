import java.util.*;
public class Colors
{     
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int n=in.nextInt();
        int total=2*n;
        String cha=in.next();
    char newch[]=new char[total];           
        int i=0;            
            for(int j=0;j<4;j++)
            {
            int b[]=new int[4];       
            b[cha.charAt(i)-65]=1;
            b[cha.charAt(i+1)-65]=1;
                if(b[j]==0)
                {
                    newch[i]=(char)(j+65);
                    System.out.println("The j "+newch[i]);
                    i++;
                }
            }   
        for( i=2;i<total;i+=2)
        {
            int b[]=new int[4];
            b[cha.charAt(i)-65]=1;
            b[cha.charAt(i+1)-65]=1;
            for(int j=0;j<4;j++)
            {       
                if(b[j]==0)
                {                   
                    newch[i]=(char)(j+65);                 
                    System.out.println("The j "+newch[i]);
                    i++;

                }
            }
              /* if(cha.charAt(i-1)==newch[i])
                {
                    char swap=newch[i+1];
                    newch[i+1]=newch[i];
                    newch[i]=swap;                  
                }*/
            System.out.println("The new CH"+newch.toString());                
            }   
}
}