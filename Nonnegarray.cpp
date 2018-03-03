#include<iostream>
using namespace std;
int main()
{
	int A[6];
	for(int i=0;i<6;i++)
	{
		cin>>A[i];	
	}
	int startin=0,endin=0;int max=-1; int count=0;
	int sum=0;	int i=0; int leng=-1; int newstartin=100000000;
	for( i=0;i<6;i++)
	{		
		if(A[i]>0)
		{
			sum+=A[i];
			count++;
		}
		else
		{
		if(sum>0)
		{
			if(max<sum)
			{
				max=sum; 
				endin=i;
				startin=endin-count;
				if(newstartin<startin)
				{
					startin=newstartin;
					
				}
				if((endin-newstartin)>leng)
				{
					leng=endin-newstartin;
				}
				sum=0; count=0;
			}			
		}
		}
	}
	if(sum>0)
		{
			if(max<sum)
			{
				max=sum; 
				endin=i;
				startin=endin-count;
				if(newstartin<startin)
				{
					startin=newstartin;
					
				}
				if((endin-newstartin)>leng)
				{
					leng=endin-newstartin;
				}
				sum=0; count=0;
			}			
		}
	cout<<"star in "<<startin<<" "<<endin<<endl;
	for(int i=startin;i<endin;i++)
	{
		cout<<A[i]<<" ";
	}
	return 0;
}
