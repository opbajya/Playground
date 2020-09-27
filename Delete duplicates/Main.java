#include<iostream>
using namespace std;
class node
{
  public:
  int data;
  node *next;
};
////////////////////////////////////////////
int delete_duplicate(node *head)
{
  node *temp=head,*temp1,*dup,*dup1;
  while(temp!=NULL && temp->next!=NULL)
  { 
     temp1=temp;
   while(temp1->next!=NULL)
    {
      if(temp->data==temp1->next->data)
      {
        dup=temp1->next->next;
        dup1=temp1->next;
        temp1->next=dup;
        dup1->next=NULL;
        free(dup1);
      }
      else temp1=temp1->next;
    } 
     temp=temp->next;
  }
     return 0;
}
/////////////////////////////////////
void print_in(node *head)
{
  while(head!=NULL) 
  {
    cout<<head->data<<endl;
    head=head->next;
  }
}

///////////////////////////////////////
void append(node **head,int in)
{
  node *temp=*head;
  node *newnode=new node;
  newnode->data=in;
  newnode->next=NULL;
  if(*head==NULL) *head=newnode;
  else
  {
    while(temp->next!=NULL) temp=temp->next;
    temp->next=newnode;
  }
  
}

int main()
{
  node *head=NULL;
  int in;
  do
  {
    cin>>in;
    if(in>=0) append(&head,in);
  }while(in>=0);
  cout<<"Linked list before removal of duplicates"<<endl;
  print_in(head);
  cout<<"Linked list after removal of duplicates"<<endl;
  delete_duplicate(head);
  print_in(head);
}
 