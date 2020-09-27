#include<iostream>
using namespace std;
int prmt(int n)
{ 
  int x=1,y=2,apple=12;
    if(n>apple)
    {   y=y+2;
        x=x+1;
      apple=4*x+4*y;
      return (4*y);
    }
    else return 4*y;

}
int main()
{
  int n;
  cin>>n;
  cout<<prmt(n);
  return 0;
}