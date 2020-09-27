#include<iostream>
#include<string.h>
using namespace std;
#define size 20
int permute(char a[],int n,int selected[],int used[],int index)
{
  int i;
  if(index==n)
  {
    for(i=0;i<n;i++) cout<<char(selected[i]);
    cout<<"\n";
    
  }
  for(i=0;i<n;i++)
  {
    if(used[i]==1) continue;
    used[i]=1;
    selected[index]=a[i];
    permute(a,n,selected,used,index+1);
    used[i]=0;
  } 
}
int sort(char a[],int n)
{ int i,j;
 for(i=0;i<n;i++)
 {
   int temp=a[i];
   for(j=i-1;j>=0;j--)
   {
     if(a[j+1]<a[j]) a[j+1]=a[j];
     else break;
   }
   a[j+1]=temp;
 }
  
}
//////////////////////////////////
int p_wrapper(char s1[],int n)
 {
   sort(s1,n);
  int selected[size]={},used[size]={};
  permute(s1,n,selected,used,0);
 }


int main()
{
  char s1[size]; 
  cin>>s1;
  p_wrapper(s1,strlen(s1));
  return 0;
}
/*int perm(string s,int i,int n)
{ int j;
  if(i==n) cout<<s<<endl;
  else 
  {
    for(j=i;j<n;j++)
    {
      swap((s[i]),(s[j]));
      perm(s,i+1,n);
      swap((s[i]),(s[j]));
    }
  }
  
}

int main()
{
  string s1; 
  cin>>s1;
  perm(s1,0,s1.size());
  return 0;
}*/
