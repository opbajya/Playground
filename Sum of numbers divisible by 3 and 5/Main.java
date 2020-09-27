#include<iostream>
using namespace std;
 unsigned int SumNumbersDivisible(unsigned int m,unsigned int n)
 { 
   int sum=0;
   int i;
   for(i=m;i<n;i++)
   {
     if(i%15==0)  sum =sum+i;
   }
  return sum;
 }
int main()
{
  unsigned int m,n;
  cin>>m>>n;
  cout<<SumNumbersDivisible(m,n);
  return 0;
}