#include <bits/stdc++.h>
using namespace std;
int gcd(int a, int b){
    if(a < b){
        return gcd(b,a);
    }
    if(b == 0){
        return a;
    }
    cout<<"GCD "<<a%b;
    cout<<"GCD "<<b%a;
    return gcd(b,a%b);
}
int main()
{
	int a,b;
	cin>>a>>b;
	
	cout<<"The Val "<<gcd(a,b)<<endl;

}
