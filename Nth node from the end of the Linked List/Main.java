#include<iostream>
using namespace std;
class node
{ public:
  int data;
  node *next,*prev;
};
 node *search_node_last(node *head,int n)
 { 
   node *temp=head;
   int count=1,in=0;
   while(temp->next!=NULL) 
   {
     temp=temp->next;
     count++;
   }
   if(n==0 || n>>count) return NULL;
   else
   {
     if(n==1) return temp;
     else 
     {
        while(temp->prev!=NULL)
      {
          if(in==n-1) return temp;
          else
          {
            temp=temp->prev;
            in++;
          }
       }
     }
   }
     
 
   
 }
//////////////
void push(node **head,int data) 
{
  node *newnode= new node;
  node *temp=*head;
  newnode->prev=NULL;
  newnode->data=data;
  newnode->next=NULL;
    if(*head==NULL) *head=newnode;     
    else
    {
      while(temp->next!=NULL) temp=temp->next;
      temp->next=newnode; 
      newnode->prev=temp;
     
    }
}
/////////////////////////////////////
int main()
{
  node *head=NULL;
  int data,n;
  cout<<"Enter the nth node:";
 do
  {
  cin>>data;
  if(data>0) push(&head,data);
  }while(data>0);
  cin>>n;
 node *temp= search_node_last(head,n);
  if(temp==NULL) cout<<endl<<"There is no nth node in the list";
  else cout<<endl<<temp->data<<" is the nth node element in the list";
  
}