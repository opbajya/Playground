#include<iostream>
#include<bits/stdc++.h>
using namespace std;
class node
{
  public:
  int data;
  node *next;
};
//////////
node *reverse_node(node *head_ref, int n)
  { 
      int i=0;
      node *curr=head_ref,*prev=NULL,*next=NULL;
      while(i<n && curr!=NULL) 
      {
        i++;
       next=curr->next;
       curr->next=prev;
       prev=curr;
       curr=next;
      }
     if(next != NULL)  
     head_ref->next=reverse_node(next,n);
     return prev;
    
  }
//////////////////
void print_data(node *head)
 { if(head==NULL) cout<<"List is empty";
   while(head!=NULL)
  { 
    cout<<head->data<<endl;
    head=head->next;
  }
}
  /////////////
void append(node **addhead, int in)
{
  node *newnode =new node,*temp=*addhead;
  newnode->data=in;
  newnode->next=NULL;
 
  if(*addhead==NULL) *addhead=newnode;
  else
  {
    while(temp->next!=NULL) temp=temp->next;
    temp->next=newnode;
  
  } 
}
////////////
int main()
{
  node *head=NULL;
  int in,n;
  int count=-1;
 do
  { count++;
    cin>>in ;
    if(in>=0) append(&head,in);
  }while(in>=0);
  cin>>n;
  //cout<<count;
  head=reverse_node(head,n);
  print_data(head);
  return 0;
}