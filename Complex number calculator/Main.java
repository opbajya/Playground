#include <iostream>
using namespace std;
struct complex
{
  int real;
  int imag;
};
int add(complex c1,complex c2)
{
  int r=c1.real+c2.real;
  int i=c1.imag+c2.imag;
  cout<<r;
  if(i>0) cout<<'+'<<i<<'i';
  else cout<<i<<'i';
}
int sub(complex c1,complex c2)
{
  int r=c1.real-c2.real;
  int i=c1.imag-c2.imag;
  cout<<r;
  if(i>0) cout<<'+'<<i<<'i';
  else cout<<i<<'i';
}
int multi(complex c1,complex c2)
{
  int r1=c1.real*c2.real;
  int i1=c1.real*c2.imag;
  int i2=c2.real*c1.imag;
  int r2;
    r2=-1*(c1.imag*c2.imag);
  int r=r1+r2;
  int i=i1+i2;
  cout<<r;
  if(i>0) cout<<'+'<<i<<'i';
  else cout<<i<<"i";
}
int main()
{
   complex c1,c2;
  int choice;
  cin>>choice;
  cin>>c1.real;
  cin>>c1.imag;
  cin>>c2.real;
  cin>>c2.imag;
   if(choice>3 || choice<1) cout<<"Invalid choice";
  else
  {
    if(choice==1) add(c1,c2);
     else  if(choice==2) sub(c1,c2);
       else multi(c1,c2);
  }
    return 0;
}