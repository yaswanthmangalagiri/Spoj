#include<iostream>
using namespace std;
int main()
{
	long N,M;
	cin>>N>>M;
	long NA[N]={0},sum=0,max=-1;
	int st=0;
	for(int i=0;i<N;i++)
	{
		cin>>NA[i];
		sum+=NA[i];
		while(sum>M)
		{
			sum=sum-NA[st];
			st++;
			if(sum==M)
			break;
		}
			if(sum<=M&&sum>max)
		max=sum;
	}
	cout<<max;
}

