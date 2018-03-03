import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int[] sten(String s,int sear)
    {
        int in[]=new int[2];
        in[0]=s.indexOf(',',sear);
        in[1]=s.indexOf(',',in[0]+1);
        return in;
    }
    static String[] processQueries(String[] queries) throws IllegalArgumentException {
        // Write your code here.
    Map<Long,Long> ordtime=new HashMap<Long,Long>();
    Map<Long,String> ordsymbol=new HashMap<Long,String>();
    Map<Long,String> ordtype=new HashMap<Long,String>();
    Map<Long,String> ordside=new HashMap<Long,String>();
    Map<Long,Double> ordprice=new HashMap<Long,Double>();
    Map<Long,Long> ordquan=new HashMap<Long,Long>();
        int in[]=new int[2];
        long longorder=0;long longquantity=0;long longtime=0;double doubleprice=0.00;
       int r=1;
        String res[]=new String[r];
    for(int q=0;q<queries.length;q++)
    {        
        if(queries[q].charAt(0)=='N')
        {    
           String symbol="";String type="";String side="";
            int st=1; longorder=0;
             try
           {
                in=sten(queries[q],st);
                st=in[1];
                String orderid=queries[q].substring(in[0]+1,in[1]);
                longorder=Long.parseLong(orderid);
           }
           catch(Exception e)
            {
                 System.out.println(longorder+" - Reject - 303 - Invalid order details");
                break;
            }
           try
           {
                in=sten(queries[q],st);
                String timestamp=queries[q].substring(in[0]+1,in[1]);            
                st=in[1];
               longtime=Long.parseLong(timestamp);
           }
            catch(Exception e)
            {
                System.out.println(longorder+"  - Reject - 303 - Invalid order details");
                break;
            }
             try
           {       
                in=sten(queries[q],st);
                 symbol=queries[q].substring(in[0]+1,in[1]);
                st=in[1];
                for(int i=0;i<symbol.length();i++)
                {
                    if(!(symbol.charAt(i)>='A'&&symbol.charAt(i)<='Z'))
                        break;
                }
           }
            catch(Exception e)
            {
                 System.out.println(longorder+"  - Reject - 303 - Invalid order details");
                break;
            } 
               in=sten(queries[q],st);
                type=queries[q].substring(in[0]+1,in[1]);            
               st=in[1];
               for(int i=0;i<type.length();i++)
                {
                    if(type.charAt(i)=='M'||type.charAt(i)=='L'||type.charAt(i)=='I')
                         ordtype.put(longorder,type);
                        else
                        break;
                }
            in=sten(queries[q],st);
            side=queries[q].substring(in[0]+1,in[1]);  
           st=in[1];
           for(int i=0;i<side.length();i++)
                {
                    if(side.charAt(i)=='B'||side.charAt(i)=='S')
                     ordside.put(longorder,side);
                        else
                        break;
                }
           
             try
           {         
               in=sten(queries[q],st);
                 String price=queries[q].substring(in[0]+1,in[1]);  
               st=in[1];
                 int dot=price.indexOf('.');
                 if(dot+3!=price.length())
                 {
                     break;
                 }
                   doubleprice= Double.parseDouble(price);
           }
            catch(Exception e)
            {
                System.out.println(longorder+"  - Reject - 303 - Invalid order details");
                break;
            }            
           try
           {                 
               in=sten(queries[q],st);
               if(in[1]==-1)
                   in[1]=queries[q].length();
               String quantity=queries[q].substring(in[0]+1,in[1]);  
               st=in[1];
               if(quantity.indexOf('.')>=0)
                   break;
              longquantity= Long.parseLong(quantity);
           }
            catch(Exception e)
            {
                System.out.println(longorder+"  - Reject - 303 - Invalid order details");
                break;
            }
            if(longorder!=0)
            {
                ordtime.put(longorder,longtime);           
                ordsymbol.put(longorder,symbol);
                ordtype.put(longorder,type);
                ordside.put(longorder,side);
                ordprice.put(longorder,doubleprice);
                ordquan.put(longorder,longquantity);
                res.length+=1;
                res[res.length()-1]=String.valueOf(longorder)+" - Accept";                 
                System.out.println("Res "+res[res.length-1]+" Size ");
            }           
        }
    }
    return res;
}
          public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cases");
        int n=in.nextInt();
        String[] queries=new String[n];
        queries[0]=in.next();
        String res[]=processQueries(queries);
        System.out.println("Res "+res[0]);
    }
}

        