#include<iostream>
#include<string>
using namespace std;
int main()
{		
   	int n;int dont[4]={0};
	cout<<"Enter the values"<<endl;
	cin>>n;	int i;	int total=2*n;
	int alph[4];
	for(i=0;i<4;i++)
	{
		alph[i]=n;	
	}
	string ch;cin>>ch;
	for(i=0;i<total;i++)
	{		
		int chan=(int)ch[i]-65;
		alph[chan]-=1;	
	}
	string newch;
   	for(int k=0;k<total;k+=2)
    {	  	    
    	dont[ch[k]-'A']=1;
    	dont[ch[k+1]-'A']=1;
		for(int i=0;i<4;i++)
		{
			if(dont[i]!=1&&alph[i]!=0)
     	    {        	
        	    newch+=(char)(i+65);
        	    alph[i]--;    
			}
		}
		dont[ch[k]-'A']=0;
    	dont[ch[k+1]-'A']=0;
    	if(newch[k]==newch[k-1])
    	{
    		char tem=newch[k+1];
    		newch[k+1]=newch[k];
    		newch[k]=tem;
		}
    }	
    cout<<newch;
	
	}
