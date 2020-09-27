#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum,str;
	cin>>fnum;
    int found=fnum.find(".");    
  cout<<"Floating part is : ";
  if(found>=0)
  {
  while(fnum[found+1]!='\0')
  {
      cout<<fnum[found+1];
    found=found+1;
  }
  }
  else cout<<" ";
}