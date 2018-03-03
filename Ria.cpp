#include<bits/stdc++.h>
using namespace std;
const int N =100005;
typedef long long ll;
int a[N];
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int i,n;
        ll x=0,y=0;
        scanf("%d",&n);
        for(i=0;i<n;i++){
            scanf("%d",a+i);
        }
        sort(a,a+n);
        if(n==1){
            printf("%d\n",a[0]);
            continue;
        }
        for(i=0;i<n;i++){
               cout<<i<<" "<<a[i]<<endl;
            if(i==0 || i==n-1)
                x+=a[i];
            else
                y+=a[i];
        }
       cout<<x<<" "<<y<<endl;
        x=3LL*x+2LL*y;
        ll g= __gcd(x,6LL);
        if(g==6){
            printf("%lld\n",x/g);
        }
        else{
            int tt=6/g;
            printf("%lld/%d\n",x/g,tt);
        }
    }
}
