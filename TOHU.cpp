#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
	cout<<setprecision(13);
	cout<<"The test cases?"<<endl;
	int t; long double k; long double result=0.66666666667;
	cin>>t;	
	for(int i=0;i<t;i++)
	{
		cin>>k;	
		while(k!=1)
		{
				result+=(((k+1)/(k+2))-(k/(k+1)))/k;
				cout<<"Second "<<result<<endl;
				k--;
		}
	}	
	long double re=	(result/100000000000);
	cout<<"The result "<<result*0.000000000001;
	cout<<"Teh final"<<re;
	return 0;
}
