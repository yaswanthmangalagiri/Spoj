#include<iostream>
using namespace std;
int main()
{
	int t,N,C;
	cin>>t>>N>>C;
	 int arr[N]={0};
	string test;
	int inst,inend,val;
	for(int i=0;i<C;i++)
	{
		cin>>test;
		if(test=="find")
		{
			int sumof=0;
			cin>>inst>>inend;
			for(int j=inst-1;j<inend;j++)
			{
				sumof+=arr[j];			
			}			
				cout<<sumof<<endl;				
		}
		else
		{
			cin>>inst>>inend>>val;
				for(int j=inst-1;j<inend;j++)
			{
				arr[j]+=val;
			}
		}	
	}
			return 0;
}
