#include<iostream>
using namespace std;
int main()
{
	int X[3],Y[3];
	for(int i=0;i<3;i++)
	{
		cin>>X[i]>>Y[i];
	}	
	int count=0;
	for(int i=0;i<2;i++)
	{
	int Xdiff=X[i+1]-X[i];
	int addX=Xdiff;
	int Ydiff=Y[i+1]-Y[i];
	int addY=Ydiff;
	cout<<"THE DIFFS "<<Xdiff<<Ydiff; 
	if(Xdiff<0)
	{
		Xdiff*=-1;		
	}
	if(Ydiff<0)
	{
		Ydiff*=-1;		
	}
	if(Xdiff<Ydiff)
	{
		count+=Xdiff;
		X[i]+=addX;	Y[i]+=addX;
	}
	else
	{
		count+=Ydiff;
		Y[i]+=addY;	X[i]+=addY;
	}
	cout<<"The new cod "<<X[i]<<" "<<Y[i]<<endl;
	Xdiff=X[i+1]-X[i];
	Ydiff=Y[i+1]-Y[i];
	if(Xdiff<0)
	{
		Xdiff*=-1;		
	}
	if(Ydiff<0)
	{
		Ydiff*=-1;		
	}
	if((Xdiff==0)&&(Ydiff!=0))
	{
		Y[i]+=addY;
		X[i]+=addY;	
		count+=Ydiff;	
	}
	else if((Ydiff==0)&&(Xdiff!=0))
	{
		Y[i]+=addX;
		X[i]+=addX;
		count+=Xdiff;		
	}	
	cout<<"THE DIFFS 2 "<<Xdiff<<Ydiff<<endl;
	 cout<<"The COunt "<<count;
}

}
