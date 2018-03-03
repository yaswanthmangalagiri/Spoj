#include<iostream>
using namespace std;
int nonneg(int B[])
{	
	int sum=0; int max=-1;
	for(int i=0;i<6;i++)
	{
		if(B[i]>0)
		{
			sum+=B[i];			
		}
		else
		{
			if(max<sum)
			{
			sum=0;	
			}
		}
	}
	cout<<"THE SUM ";
	return sum;
}
int main()
{
	int A[6];
	cout<<"Enter the array"<<endl;
	for(int i=0;i<6;i++)
	{
		cin>>A[i];
	}
	nonneg(A);
	return 0;
	}
