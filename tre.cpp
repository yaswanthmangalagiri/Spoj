#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	cout<<"Enter the val"<<endl;
	int N,st,en; int mat[N-1][N-1];
	cin>>N;
	for(int i=1;i<N;i++)
	{
		cin>>st;
		cin>>en;
		mat[st][en]=1;
	}
	int visit[N-1];int count=0;
	for(int i=1;i<N;i++)
	{
		for(int j=1;j<N;j++)
		{
			if(mat[i][j]==1)
			{
				visit[i]+=1;	i=j;			
				break;			
			}			
		}	
	}
	sort(visit,visit+N-1);
	cout<<"Count "<<visit[N-1];
}
