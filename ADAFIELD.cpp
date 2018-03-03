#include<iostream>
#include<vector>
using namespace std;
int befdiff=0;
void vecsort(int d,vector<long> v)
{
	int in=0,en=v.size();
	while(in<en)
	{
	Iterator	mid=(in+en)>>1;
		if(d>v[mid]&&d<v[mid+1])
		{
			v.insert(mid,d);
			befdiff=v[mid+1]-v[mid];
			return;
		}
		else if(d<v[mid])
		en=mid;
		else if(d>v[mid])
		in=mid+1;		
	}
}
/*int diff(vector<long> v,int befdiff,int d)
{
	int p=v.find(befdiff);
	v.erase(befdiff);
	v.insert(d,p);
	
	 sub=0,max=-1;
	for(int i=N-1;i>0;i--)
	{
		sub=v[i]-v[i-1];
		if(sub>max)
		max=sub;
	}
	return max;
}*/
int main()
{
	int t,N,Q,con,d;
	cin>>t;	
	while(t--)
	{
		
		cin>>N>>N>>Q;
	vector<long> vx;
	vector<long> vy;
	vx.push_back(0);
	vx.push_back(N);
	vy.push_back(0);
	vy.push_back(N);
	for(int q=0;q<Q;q++)
	{
		cin>>con;
		if(con==0)
		{
			cin>>d;
			vecsort(d,vx);
		}
		else
		{
			cin>>d;
			vecsort(d,vy);
		}
	}
	for(int i=0;i<vx.size();i++)
	cout<<"Vx "<<vx[i]<<endl;
/*	vecsort(vy,vy.size());
	for(int i=0;i<vx.size();i++)
	cout<<"VX "<<vx[i]<<endl;
	for(int i=0;i<vy.size();i++)
	cout<<"Vy "<<vy[i]<<endl;
	cout<<"Vysize"<<vy.size();
	long xdiff=	diff(vx,vx.size());
	long ydiff=diff(vy,vy.size());
	cout<<xdiff*ydiff;
}*/

}

