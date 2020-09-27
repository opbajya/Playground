#include<iostream>
using namespace std;

 int keyfound(int n1,int n2,int n3)
{
  int s_thou,l_hun,s_tens,l_unit;
  int n11=n1,n22=n2,n33=n3;
  int i=0,j=0;
   if ((n1>=1000 && n1<=9999) && (n2>=1000 && n2<=9999) &&(n3>=1000 && n3<=9999) )
   {
     while(n11!=0 )
  { 
    while(n22!=0)
    { 
      if(i==0) l_unit=n22%10;
      if(i==1) s_tens=n22%10;
      if(i==2) l_hun=n22%10;
      if(i==3) s_thou=n22%10;
      n22=n22/10;
      i=i+1;
    }
     
     if(j==0)
    {
      if(n11%10<l_unit) l_unit=l_unit;
      else l_unit=n11%10;
    }
    if(j==1)
    {
      if(n11%10 > s_tens) s_tens=s_tens;
      else s_tens=n11%10;
    }
      
    if(j==2)
    {
      if(n11%10<l_hun) l_hun=l_hun;
      else l_hun=n11%10;
    }
    if(j==3)
    {
      if(n11%10>s_thou) s_thou=s_thou;
      else s_thou=n11%10;
    }
    n11=n11/10;
    j=j+1;
  }
 
    j=0;
   while(n33!=0)
    {
       
     if(j==0)
    {
      if(n33%10<l_unit) l_unit=l_unit;
      else l_unit=n33%10;
    }
    
    if(j==1)
    {
      if(n33%10>s_tens) s_tens=s_tens;
      else s_tens=n33%10;
    }
      
    if(j==2)
    {
      if(n33%10<l_hun) l_hun=l_hun;
      else l_hun=n33%10;
    }
  
       if(j==3)
    {
      if(n33%10>s_thou) s_thou=s_thou;
      else s_thou=n33%10;
    }
     
    n33=n33/10;
    j=j+1;
    }
  
  return  ( 1000*s_thou+ 100*l_hun + 10*s_tens+ l_unit);
   }
   else return -1;
}

int main()
{
  int n1,n2,n3;
  cin>>n1>>n2>>n3;
  cout<<keyfound(n1,n2,n3);
  return 0;
}