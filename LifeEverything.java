import java.util.*;
public class LifeEverything
{
    public static void main(String args[])
    {
        System.out.println("Enter the n");
        ArrayList<Integer> li=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);  
        int n;
        do 
        {
            n=in.nextInt();
            li.add(n);
        } while(n!= 42);
        for(int i=0;i<li.size()-1;i++)
        {
        System.out.println(li.get(i));
    }
    }
    }