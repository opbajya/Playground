#include<iostream>
#include<math.h>
using namespace std;
int arm(long int n)
{ 
  long int n1=n;
  int p=0;
  while(n1!=0)
  {
    n1=n1/10;
    p++;
  }
 long int n2=0;
 long n3=n;
 for(int i=0;i<p;i++)
 {
   n2=n2+ pow(n3%10,p);
   n3=n3/10;
 }
 if(n2==n) return 1;
 else return 0;
}

int main()
{
  long int n;
  cin>>n;
  int a=arm(n);
  if(a==1) cout<<"Yes";
  else cout<<"No";
}