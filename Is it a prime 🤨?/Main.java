#include<iostream>
using namespace std;
int prime(long int n )
{ int i=2;
   while(i<=n/2)
  { 
    if(n%i==0) return 0;
    else i=i+1;
  }
 return 1;
}
int main()
{
  long int n;
  cin>>n;
 int p=prime(n);
  if(p==1) cout<<"Prime";
  else cout<<"Not Prime";
}