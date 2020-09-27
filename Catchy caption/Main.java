#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  char str[100];
  int j=0, i=0;
  cin.getline(str,100);
  
  while(str[j]!='\0')
  {
  if(str[j]==' ')
  {
    i++;
    j++;
  }
  else j=j+1;
  }
  if(i<10) cout<<"Caption eligible for the contest";
  else cout<<"Caption not eligible for the contest";
  
   
}