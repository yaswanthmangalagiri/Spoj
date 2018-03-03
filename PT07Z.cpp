#include<iostream>
#include<vector>
using namespace std;

void heapify(vector<long> v,int N,int i)
{
	int large=i,left,right;
	left=2*N+1;right=2*N+2;
	if(v[left]>v[large])
	large=left;
	if(v[right]>v[large])
	right=left;
	if(large!=i)
	{
		swap(v[i],v[large]);
		heapify(v,N,large);
	}
	
}
void heapsort(vector<long> v,int N)
{
	for(int i=N/2-1;i>=0;i--)
	{
		heapify(v,N,i);
	}
}
int diff(vector<long> vx,int N)
{
	int sub=0,max=-1;
	for(int i=N-1;i>0;i--)
	{
		sub=vx[i]-vx[i-1];
		if(sub>max)
		max=sub;
	}
	return max;
}
int main()
{
	int t,N,q,con,d;
	vector<long> vx;
	vector<long> vy;
	for(int i=0;i<N;i++)
	{
		if(con==0)
		{
			cin>>d;
			vx.push_back(d);
		}
		else
		{
			cin>>d;
			vy.push_back(d);
		}
	}
	heapsort(vx,vx.size());
	heapsort(vy,vy.size());
	long xdiff=	diff(vx,vx.size());
	long ydiff=diff(vy,vy.size());
	cout<<xdiff*ydiff;
}

