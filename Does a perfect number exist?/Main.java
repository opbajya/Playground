#include<iostream>
using namespace std;
long int sum( long int num)
{ 
   long int sum=1;
  for(int i=2;i*i<num;i++)
  {
    if(num%i==0) sum=sum+i+ num/i;
   if(i*i==num) sum=sum-i;
  }
  
  if(sum==num) cout<<"Yes";
  else cout<<"No";
}
 
int main()
{
  long int n;
  cin>>n;
  sum(n);
  return 0;
}