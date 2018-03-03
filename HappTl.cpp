#include<iostream>
using namespace std;
int main()
{
	int S,D,st,en,qst,dur;	
	int N,M;
	cin>>N>>M;
	while(N!=0&&M!=0)
	{
	int mat[N][2]={0};
	
	for(int i=0;i<N;i++)
	{
		cin>>S>>D>>st>>en;
		mat[i][0]=st;
		mat[i][1]=st+en;
	}
	for(int qu=0;qu<M;qu++)
	{
		int count=0;
		cin>>qst>>dur;
		int sum=qst+dur;
		for(int i=0;i<N;i++)
	{
		if(mat[i][0]<qst&&mat[i][1]>qst)
			{			
				count++;
			}
		else if(sum>mat[i][0]&&sum<mat[i][1])
		{			
				count++;
			}
		}
		cout<<count<<endl;
	}
	cin>>N>>M;
}
}
