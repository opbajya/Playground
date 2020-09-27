#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;  
  cin.getline(str,100);
 for(i=0;i==count;i++)
 { 
   if(str[i] =='\0') count=count;
   else count +=1;
 }
  for(i=0;i<count;i++)
 {
   rev[i]=str[count-i-1];
 }
cout<<rev;

}