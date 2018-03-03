import java.util.*;
public class AlphaCode
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter cases");
         String code;
         do
         { 
             int count=0; int count2=0;
             code=in.next(); int leng=code.length();
            if(code.charAt(0)!=0)
            {            
                count=1;count2=1;
                for(int i=0;i<=leng;i++)
                {
                    for(int j=i+1;j<leng;j++)
                    {
                        int intsub=Integer.parseInt(code.substring(i,j+1));
                        if(i%2==0)
                        {
                            if((intsub>9)&&(intsub<27))
                            {
                            if(intsub%10==0)
                            {
                                    count*=1;
                                }
                                else
                                {
                                    count*=2;
                                }
                            }
                            else 
                            {
                                if(intsub%10==0)
                            {
                                if(intsub>20)
                                {
                                    count=0;
                                }
                            }
                            else
                            {
                                count*=1;
                            }
                        }
                        }
                        else
                        {
                            if((intsub>9)&&(intsub<27))
                            {
                            if(intsub%10==0)
                            {
                                    count2*=1;
                                }
                                else
                                {
                                    count2*=2;
                                }
                            }
                            else 
                            {
                                if(intsub%10==0)
                            {
                                if(intsub>20)
                                {
                                    count2=0;
                                }
                            }
                            else
                            {
                                count2*=1;
                            }
                        }
                        }
                        } 
                    }
                    if((count>0)&&(count2>0))
                    {
                    System.out.println(count+count2);                
               }
              /* else if(count>0)
               {
                   System.out.println(count);
                }                
               else if(count2>0)
               {
                   System.out.println(count2);
                }*/
                }
            }while(!code.equals("0"));
        }
    }