import java.util.*;
public class Toho
{     
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int t=in.nextInt();
        double result=0.666666666667;        
        for(int i=0;i<t;i++)
    {
        double k=in.nextInt();   
        while(k!=1)
        {
            result+=(((k+1)/(k+2))-(k/(k+1)))/k;
            k--;
        }
}
System.out.println("The result "+result);
}
}