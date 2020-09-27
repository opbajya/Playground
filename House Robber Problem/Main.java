#include<iostream>
using namespace std;
int robedAmount(int arr[],int size,int i)
{ 
  if(i>=size) return 0;
  return max(arr[i]+robedAmount(arr,size,i+2),robedAmount(arr,size,i+1));
 
}
int max(int m,int n)
{
  if(m>n) return m;
  else  return n;
}
int main()
{
  int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
  cin>>*(arr+i);
  cout<<robedAmount(arr,size,0);

  return 0;
}