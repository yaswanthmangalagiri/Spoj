#include<iostream>
using namespace std;
int main()
{
	int t,a,b,q,st,en;
	long min;
	cin>>t;
	for(int n=0;n<t;n++)
	{
	cin>>a>>q;
	long arr[a]={0};
	for(int i=0;i<a;i++)
	cin>>arr[i];
	cout<<"Scenario #"<<n+1<<":"<<endl;
	for(int i=0;i<q;i++)
	{		
		cin>>st>>en;min=1000000001;
		for(int j=st-1;j<en;j++)
		{
			if(arr[j]<min)
			min=arr[j];
		}
		cout<<min<<endl;
	}
	}
	return 0;
}
