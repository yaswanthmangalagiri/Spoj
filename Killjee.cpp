#include<iostream>
using namespace std;
int main()
{
    int N;int NA[]={0};int misn=100000000;int q,L,R,U,P;
    cin>>N; 
    for(int i=0;i<N;i++)
    {
        cin>>NA[i];
    }
    int Q;
    cin>>Q;
    for(int i=0;i<Q;i++)
    {
        cin>>q;
        if(q==1)
        {
            cin>>U>>P;
            NA[U-1]=P;
        }
        else
        {
            cin>>L>>R>>P;
            for(int j=L-1;j<R;j++)
            {
                if(NA[j]>P)
                {
                int chec=NA[j]-P;
                if(chec<misn)
                misn=chec;
                }
            }
            cout<<misn<<endl;
        }
    }
}
