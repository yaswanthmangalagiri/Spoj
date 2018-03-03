#include<iostream>
using namespace std;
int main()
{
	int t,b,g,ns;
	cin>>t>>b>>g>>ns;
	int lim=((b+g)-ns)+1;
	cout<<"LIMG "<<lim;
	int possible=1,possibleg=1,possibleb=1;
	int total=0;
	for(int i=0;i<t;i++)
	{		
	if(b+g>5)
	{	
		for(int tot=b+g;tot>lim;tot--)
		{
			possible*=tot;
		}		
		for(int totb=b;totb>b-4;totb--)
		{
			possibleb*=totb;
		}
		for(int totg=g;totg>g-1;totg--)
		{
			possibleg*=totg;
		}
			
	total=possible-(possibleb*possibleg);
	cout<<"POSSIBLE "<<possible<<" "<<possibleb<<" "<<possibleg<<endl;
	cout<<"TOTAL "<<total;
	}
else
{
	return 1;
}
}
return 0;
}

