#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter the values";
	cin>>n;
	string ch,newch;
	int total=2*n;
		cin>>ch;
        int i=0;
        	for(int j=0;j<4;j++)
            {
			int b[4];
			b[ch[i]-65]=1;
			cout<<"check in b"<<ch[i];
        	b[ch[i+1]-65]=1;
            	if(b[j]==0)
            	{
            		newch[i]=(j+65);
					i++;
				}
            }   cout<<"The new chars "<<newch[i];cout<<newch[i+1];
		for( i=2;i<total;i+=2)
        {
        	int b[4];
        	b[(int)ch[i]-65]=1;
        	b[(int)ch[i+1]-65]=1;
        	for(int j=0;j<4;j++)
            {
            	if(b[j]==0)
            	{
            		newch[i]=(j+65);
					i++;
				}
			}
				if(ch[i-1]==newch[i])
				{
					char swap=newch[i+1];
					newch[i+1]=newch[i];
					newch[i]=swap;
				}
			cout<<newch[i];cout<<newch[i+1];
            }
	return 0;
}
