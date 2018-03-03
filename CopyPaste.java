import java.util.*;
public class CopyPaste
{
	public static void main(String args[])
	{
		System.out.println("Enter the cases");
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			String inp=in.next();
			String outp="";
			outp+=inp.substring(0,3);
			int count=3;
			StringBuffer clip=new StringBuffer(outp);
			System.out.println("The string "+outp); 		
				int next=2;
			for(int j=3;j<inp.length();j++)
			{		
				for(int z=0;z+next<outp.length();z++)
				{
				    if(j+next<inp.length())
				    {
					if(inp.substring(j,j+clip.length()).equals(clip))
					{
						count++;
					}
					else if(inp.substring(j,j+next).equals(outp.substring(z,z+next)))
					{
						next++;
					}
					else if(next>=3)
					{
						clip.replace(0,clip.length(),outp.substring(z,z+next));
						count+=2;
						outp+=clip;
					}
				}
				}
		}		
			System.out.println("The count "+count);
	}
}
}