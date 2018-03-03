#include<iostream>
using namespace std;
int main()
{
	int t,n,m;
	cin>>t; int d=0;
	for(int i=0;i<t;i++)
	{
		cin>>n>>m;
		if(n>2&&m>2)
		{
			if(n<=m)
			{
				if(n%2==0)
				{
					d=(n-2)/2;
					n=n-(2*d);
					m=m-(2*d);
				}
				else
				{
					d=(n-1)/2;
					n=n-(2*d);
					m=m-(2*d);
				}			
			}
			else
			{
				if(m%2==0)
				{
					d=(m-2)/2;
					n=n-(2*d);
					m=m-(2*d);
				}
				else
				{
					d=(m-1)/2;
					n=n-(2*d);
					m=m-(2*d);
				}	
			}
		}
		if(m==2)
		{
			if(n==1)	
			cout<<"R"<<endl;
			else if(n==2)
			cout<<"L"<<endl;
			else if(n>2)
			cout<<"U"<<endl;
		}			
		else if(m==1)
		{
			if(n==1)	
			cout<<"R"<<endl;
			else if(n>=2)
			cout<<"D"<<endl;			
		}
		else if(n==1)		
			cout<<"R"<<endl;
		else if(n==2)
		{
			if(m==1)	
			cout<<"D"<<endl;
			else if(m>=2)
			cout<<"L"<<endl;	
		}		
	}
	return 0;
}
