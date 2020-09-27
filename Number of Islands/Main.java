#include<iostream>
using namespace std;
int boundry(int x,int y,int i,int j)
{
  	if(i>=x || i<0 || j>=y  || j<0) return false;
 
return true;
}
int delisland(int **A,int x,int y,int i,int j)
{
  if(boundry(x,y,i,j) && A[i][j]==1)
  { A[i][j]=0;
  delisland(A,x,y,i-1,j-1);
  delisland(A,x,y,i-1,j);
  delisland(A,x,y,i,j-1);
  delisland(A,x,y,i+1,j+1);
  delisland(A,x,y,i+1,j);
  delisland(A,x,y,i,j+1);
  delisland(A,x,y,i-1,j+1);
  delisland(A,x,y,i+1,j-1);
  
  }
}
int bridge_no(int **A,int x,int y)
{
  int count=0;
   for(int i=0;i<x;i++)
   {
    for(int j=0;j<y;j++)
    { if(A[i][j]==1)
      {  count++;
         delisland(A,x,y,i,j);
      }
    }}
  if (count==0) return 0;
 else  return count-1;
      
}

int main()
{
  int x,y;
  cin>>x>>y;
   int **A=(int **)malloc(x*sizeof(int *));
   for(int i=0;i<x;i++) 
       A[i]=(int *)malloc(y*sizeof(int));
  
  for(int i=0;i<x;i++)
    for(int j=0;j<y;j++) cin>>A[i][j];
 
   cout<<bridge_no(A,x,y)<<endl;
  return 0;
}