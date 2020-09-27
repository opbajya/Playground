#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};

int main() 
{
   struct student s1;
  cout<<"\nStudent Details "<<endl;
  cin.getline(s1.name,50);
   cout<<"Name: "<<s1.name<<endl;
  cin>>s1.roll;
  cout<<"Roll: "<<s1.roll<<endl;
  cin>>s1.marks;
  cout<<"Marks: "<<s1.marks<<endl;
  return 0;
}