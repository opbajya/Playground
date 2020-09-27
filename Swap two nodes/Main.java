#include<iostream>
using namespace std;
class node
{
  public:
  int data;
  node *next;
};
/////////
void swap_node(node **head_ref, int p, int q)
{
   if(p==q) return;
   node *p_prev=NULL,*p_curr=*head_ref;
 
   while(p_curr->data!=p && p_curr)
   {
     p_prev=p_curr;
    p_curr=p_curr->next;
   }
  node *q_prev=NULL,*q_curr=*head_ref;
   while(q_curr->data!=q && q_curr)
   {
     q_prev=q_curr;
     q_curr=q_curr->next;
   }
    if(q_curr==NULL || p_curr==NULL) return;
    if(p_prev!=NULL) p_prev->next=q_curr;
    else *head_ref=q_curr;
     
    if(q_prev!=NULL) q_prev->next=p_curr;
    else *head_ref=p_curr;
      node *temp=q_curr->next;
      q_curr->next=p_curr->next;
      p_curr->next=temp;
  
  }
//////////////////
void print_data(node *head)
 { 
   while(head!=NULL)
  { 
    cout<<head->data<<" ";
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
  int n,p,q,in;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>in ;
    append(&head,in);
  }
  cin>>p;
  cin>>q;
  swap_node(&head,p,q);
  print_data(head);
  return 0;
}