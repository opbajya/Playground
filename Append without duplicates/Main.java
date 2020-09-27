#include<iostream>
using namespace std;
class node 
{ 
  public:
  int d;
  node *next;
};
///////
 void print_data(node **head)
{
   node *temp=*head;
  if(temp==NULL) cout<<"List is empty";
  else 
  {
    while(temp->next!=NULL)
    {
      cout<<temp->d<<endl;
      temp=temp->next;
    }
    cout<<temp->d<<endl;
      
  }
 }
/////////////////////////
void add_data(node **head,int data)
{
  node *newnode= new node;
  node *temp=*head;
  newnode->d=data;
  newnode->next=NULL;
  if(*head==NULL) *head=newnode;
  else
  { 
    while(temp->d!=data && temp->next!=NULL)
   {
      temp=temp->next;
    }
   if( temp->next==NULL && temp->d!=data) temp->next=newnode;
    }
  }

//////////////////////////
int main()
{
  node *head=NULL;
  int data;
  do
  {
    cin>>data;
    if(data>=0) add_data(&head,data);
  }while(data>=0);
  print_data(&head);
}