#include<iostream>
using namespace std;
int N;

void update(int bit[],int st, int en,int delta)
{
      for(int x=st; x <=N; x += x&-x)
        bit[x]+=delta;
}
int query(int bit[],int at)
{
     int sum = 0;
     for(int x=at; x > 0; x -= x&-x)
      {
		 sum+=bit[x];
	}
     return sum;
}
int main()

{
	int sum=0;
	cout<<"Ente rhte al"<<endl;
	int C,t,q,st,en,V;	
	cin>>t;
	while(t--)
	{	cin>>N>>C;
		int tree[N+1]={0};
		int bit[N+1]={0};
		while(C--)
		{
			cin>>q;
	if(q==0)
	{		
		cin>>st>>en>>V;
		for(int i=st;i<=en;i++)
		{		
			update(bit,i,en,V);		
		}	
			
	}
	else
	{
		cin>>st>>en;
		int smin=query(bit,st-1);
		int smax=query(bit,en);
		cout<<smax-smin<<endl;
	}
	}
	
}

}
/*
1
8 6
0 2 4 26
0 4 8 80
0 4 5 20
1 8 8 
0 5 7 14
1 4 8
*/
