#include<iostream>
#include <math.h> 
using namespace std;
long int power(long int x ,long int y)
{
    if (y != 0)
        return (x*power(x, y-1));
    else
        return 1;
}

int main()
{
  long int n1,n2;
  cin>>n1>>n2;
 cout<<power(n1,n2);
 
  return 0;
}