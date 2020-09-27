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
void swap_pair_node(node **head_ref)
  { 
    node *temp=*head_ref;
    if(*head_ref==NULL) return;
    else
    {
     while(temp!=NULL && temp->next !=NULL)
     {
       swap(temp->data,temp->next->data);
       temp=temp->next->next;
     }
    }
    
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
  int in;

 do
  {
    cin>>in ;
    if(in>=0) append(&head,in);
  }while(in>=0);
 swap_pair_node(&head);
 print_data(head);
  return 0;
}