import java.util.*;
public class EditDistance
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Strings");
            String str;
            while(in.hasNextLine())
            {
                str=in.next();
        int count=0;   int count2=0;
        for(int i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                char first=str.charAt(i);
                if(Character.isUpperCase(first))
                {
                    count++;
                }
            }
            if(i%2!=0)
                {
                char first=str.charAt(i);
                if(Character.isLowerCase(first))
                {
                    count++;
                }
            }
            if(i%2==0)
                {
                char first=str.charAt(i);
                if(Character.isLowerCase(first))
                {
                    count2++;
                }
            }
            if(i%2!=0)
                {
                char first=str.charAt(i);
                if(Character.isUpperCase(first))
                {
                    count2++;
                }
            }  
        }
        if(count>count2)
        {
        System.out.println(count2);
    }
    else
    {
        System.out.println(count);
    }
    }
    }
}
