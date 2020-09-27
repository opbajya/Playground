#include<iostream>
using namespace std;
int sum(int n)
{ 
  while(n>9 )
  {
     n=n%10 + n/10;
    
  }
  cout<<n;
}
int main()
{
  long int n;
  cin>>n;
  sum(n);
}