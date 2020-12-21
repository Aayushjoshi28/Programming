#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
int data;
struct node *next;
}*head=NULL;
void create(int n)
{
int data,i=1;
struct node *newNode,*temp;
printf("\nEnter Your Data For Node %d:\t",i);
scanf("%d",&data);
newNode=(struct node*)malloc(sizeof(struct node));
if(newNode==NULL)
{
 printf("Cannot Create Starting Node\n");
 exit(0);
}
newNode->data=data;
newNode->next=NULL;
newNode->next=newNode;
head=newNode;
temp=head;
for(i=2;i<=n;i++)
{
 printf("\nEnter Your Data For Node %d:\t",i);
 scanf("%d",&data);
 newNode=(struct node*)malloc(sizeof(struct node*));
 if(newNode==NULL)
 {
 printf("Cannot Create Node %d\n",i);
 exit(0);
 }
 newNode->data=data;
 newNode->next=head;
 temp->next=newNode;
 temp=temp->next;
}
}
void print()
{
int i=1;
struct node* temp;
temp=head;
if(temp==NULL)
{
 printf("Linked List Not Available\n");
 exit(0);
}
printf("Linked List elements are\n");
while(temp->next!=head)
{
 printf("Value At Node %d is %d and address of next Node is %d\n",i,temp->data,temp->next);
 temp=temp->next;
 i++;
}
printf("Value At Node %d is %d and address of next Node is %d\n",i,temp->data,temp->next);
}
void insert_beg()
{
struct node *newNode,*temp;
int data;
temp=head;
if(temp==NULL)
{
 printf("Linked List Not Available and thus creating a new linked list with single node\n");
 printf("\nEnter Data For New Node:\t");
 scanf("%d",&data);
 newNode=(struct node*)malloc(sizeof(struct node));
 if(newNode==NULL)
 {
 printf("Cannot Create a new Node\n");
 exit(0);
 }
 head=newNode;
 head->next=head;
 printf("\nUpdated Linked List is:\t");
 print();
}
else
{
 printf("\nEnter Data For New Node:\t");
 scanf("%d",&data);
 newNode=(struct node*)malloc(sizeof(struct node));
 if(newNode==NULL)
 {
 printf("Cannot Create New Node\n");
 exit(0);
 }
 newNode->data=data;
 newNode->next=head;
 while(temp->next!=head)
 {
 temp=temp->next;
 }
 temp->next=newNode;
 head=newNode;
 printf("\nUpdated Linked List is:\t");
 print();
}
}
void insert_end()
{
struct node *temp,*newNode;
int data;
temp=head;
if(temp==NULL)
{
 printf("Linked List not available thus creating a new Linked List with single node\n");
 printf("\nEnter Data For New Node:\t");
 scanf("%d",&data);
 newNode=(struct node*)malloc(sizeof(struct node));
 if(newNode==NULL)
 {
 printf("Cannot Create a New Node thus exiting the program\n");
 exit(0);
 }
 newNode->data=data;
 head=newNode;
 head->next=head;
 printf("\nUpdated Linked List is :\t");
 print();
}
else
{
 printf("\nEnter Data For New Node:\t");
 scanf("%d",&data);
 newNode=(struct node*)malloc(sizeof(struct node));
 if(newNode==NULL)
 {
 printf("Cannot Create a New Node thus exiting the program\n");
 exit(0);
 }
 newNode->data=data;
 newNode->next=head;
 while(temp->next!=head)
 {
 temp=temp->next;
 }
 temp->next=newNode;
 printf("\nUpdated Linked List is:\t");
 print();
}
}
void delete_beg()
{
struct node* temp;
int data;
temp=head;
if(temp==NULL)
{
 printf("Linked List Not Available thus exiting the program\n");
 exit(0);
}
data=temp->data;
printf("Deleted Value From Linked List is %d\n",data);
while(temp->next!=head)
{
 temp=temp->next;
}
temp->next=head->next;
temp=head;
head=temp->next;
free(temp);
printf("\nUpdated Linked List is:\t");
print();
}
void delete_end()
{
struct node *temp,*t;
int data;
temp=head;
if(temp==NULL)
{
 printf("Linked List Not Available thus exiting the program\n");
 exit(0);
}
while(temp->next!=head)
{
 t=temp;
 temp=temp->next;
}
data=temp->data;
printf("Deleted Value From Linked List is %d\n",data);
t->next=temp->next;
free(temp);
printf("\nUpdated Linked List:\t");
print();
}
void main()
{
int n,ch;
printf("\nSingly Circular Linked List By Aayush Joshi SE4_14\n");
printf("\nEnter Number Of Nodes:\t");
scanf("%d",&n);
create(n);
while(1)
{
printf("\n1.Print Your Linked List Unaltered\t");
printf("\n2.Insert a Node at beginning\t");
printf("\n3.Insert a Node at end\t");
printf("\n4.Delete a Node at beginning\t");
printf("\n5.Delete a Node at end\t");
printf("\n6.Exit\t");
printf("\nEnter Your Choice:\t");
scanf("%d",&ch);
switch(ch)
{
 case 1:print();
break;
 case 2:insert_beg();
break;
 case 3:insert_end();
break;
 case 4:delete_beg();
break;
 case 5:delete_end();
break;
 case 6:exit(0);
break;
 default:printf("Wrong Choice\n");
}
}
getch();
}
