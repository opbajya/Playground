#include<iostream>
using namespace std;
class node 
{ public:
  int data;
  node *next;
};
//////************************************
void print_data(node *head)
 {
  while(head!=NULL)
  {
    cout<<head->data<<"->";
    head=head->next;
 }
  cout<<"NULL"<<endl;
}
//////////
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
/////////
void merge_sort(node **head1,node *head2)
 {
   node *temp1=*head1,*temp2=head2;
  if(temp1==NULL) 
  { *head1=head2; 
   return;
  }
  if(temp2==NULL) return;
  if(temp1->data >temp2->data)
  {
    node *t=temp2->next;
    temp1=temp2;
    temp1->next=*head1;
    temp2=t;  
    *head1=temp1;
   }
  while(temp1->next!=NULL && temp2!=NULL)
  {
    if(temp1->next->data > temp2->data)
    {
      node *t1=temp1->next,*t2=temp2->next;
      temp1->next=temp2;
      temp2->next=t1;
      temp2=t2;
      temp1=temp1->next;
    }
    else temp1=temp1->next;
  }
  if(temp2!=NULL) temp1->next=temp2;
}
/////////
int main()
{
  node *head1=NULL,*head2=NULL;
  int n,in;
  cin>>n;
  ////
  for(int i=0;i<n;i++)
  {
    cin>>in ;
    append(&head1,in);
  }
  /////
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>in ;
    append(&head2,in);
  }
  merge_sort(&head1,head2);
  print_data(head1);
}