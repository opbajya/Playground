#include<iostream>
using namespace std;
int fact(int n)
{ int i,n1=n;
  cout<<"1 ";
   for(i=2;i<=n/2;i++)
   {
     if(n1%i==0) 
     { 
       cout<<i<<' ';
     }
     else i=i;
   }
 cout<<n;
}
  
int main()
{
 long int n;
  cin>>n;
  fact(n);
  return 0;
  
}