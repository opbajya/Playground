#include<iostream>
using namespace std;
 long int diff(long int n)
{
  long int d,n1=n;
  long int p=0;
  while(n1!=0)
  {
    n1=n1/10;
    p++;
  }
   if(p%2!=0)
   {
    for(long int i=1;i<=p;i++)
    {
      if(i%2==0) d=d-n%10;
      else d=d+n%10;
      n=n/10;
    }
   }
   else
   {
    for(long int i=1;i<=p;i++)
     {
       if(i%2==0) d=d+n%10;
       else d=d-n%10;
       n=n/10;
     }
     
   }
if(d<0)  cout<<(-1*d);
else cout<<d;
}
   
 
int main()
{
 long int n;
  cin>>n;
 diff(n);
  return 0;
}