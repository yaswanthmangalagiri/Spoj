
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enterhte ");
        int T=in.nextInt();
        for(int t=0;t<T;t++)
        {
            int N=in.nextInt();
            int Arr[]=new int[N];
            for(int i=0;i<N;i++)
            {
                Arr[i]=in.nextInt();
            }
            int n=N;
           int rot=0;int NuRot=1;
            while(NuRot<=N)
            {
            while(rot<NuRot)
            {
                int first=Arr[0];
                for(int i=0;i<N-1;i++)
                {
                    Arr[i]=Arr[i+1];
                }
                Arr[N-1]=first;
                rot++;
            }
             System.out.println();
                int inver=0;
                for(int i=0;i<N;i++)
                {
                    for(int j=i+1;j<N;j++)
                    {   
                        if(Arr[i]>Arr[j])
                        {
                        inver++;
                        }
                    }
                }
                System.out.print(inver+" ");
                NuRot++;
            }
            }
    }
}
