#include<iostream>
#include<algorithm>
using namespace std;
long i, N;
long place(long dist,long C,long arr[])
{
	long cow=1;int lastplace=arr[0];
	for(i=1;i<N;i++)
	{	
		if(arr[i]-lastplace>=dist)
		{
		
			lastplace=arr[i];
			cow++;
			if(cow==C)
				return 1;
		}
	}
	return 0;
}
long bisear(long ini,long end,long cow,long a[])
{	long max=-1; end=a[end-1];
	while(ini<end)
	{
		long mid=(ini+end)/2;
	if(place(mid,cow,a)==1)
	{
		if(mid>max)
		max=mid;
		ini=mid+1;
	}
	else
	{
		end=mid;
	}
}
return max;
}
int main()
{
	long t,C;
	cin>>t;
	while(t--)
	{
		
	cin>>N>>C;
	long arr[N]={0};
	for(long i=0;i<N;i++)
	cin>>arr[i];
	sort(arr,arr+N);
	long k=bisear(0,N,C,arr);
	cout<<k<<endl;
}
}

/*
1
5 3
1 2 4 8 9
*/
