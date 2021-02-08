/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-02T18:02:32+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: singlylinkedlist.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-12T20:13:30+05:30
 */
#include<stdio.h>
#include<stdlib.h>

//creating the structure of a node for the singly linked list
typedef struct snode
{
  int data;
  struct node *next;
}snode;

snode *HEAD = NULL;

//declaring all the required functions
void create();
void traverse();
void print();
void count();
void search();
void concate();
void insert_beg();
void insert_end();
void insert_sp();
void delete_beg();
void delete_end();
void delete_sp();

//creating the main function for navigating through out the from using menu
void main()
{
  int ch;
  while(1)
  {
    printf("\n\t -----------------------------------Singly Linked List -----------------------------------");
		printf("\n\t1.Create\t2.Traverse\t3.Print \t4.Count \t5.Search\t6.concate\t7.Insert_beg\t8.Insert_end\t9.Insert_sp\t10.Delete_beg\t11.Delete_end\t12.Delete_sp\t13.exit");
		printf("\n\t ENter Your Choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:create();break;
			case 2:traverse();break;
			case 3:print();break;
			case 4:count();break;
			case 5:search();break;
			case 6:concate();break;
			case 7:insert_beg();break;
			case 8:insert_end();break;
			case 9:insert_sp();break;
			case 10:delete_beg();break;
			case 11:delete_end();break;
			case 12:delete_sp();break;
			case 13:exit(0);
			default:
				printf("\n\t Enter Correct Choice(1-13)...!!");
    }
  }
}

void create()
{
  int n;
  snode *p;
  printf("\n\t Enter the Number of nodes in SLL:");
  scanf("%d",&n);
  if(n>0)
  {
    //for first node of the SLL
    HEAD = (snode *) malloc(sizeof(snode)); //allocating the memory to head node.
    HEAD -> next = NULL;
    printf("\n\t Enter data to store at head node:");
    scanf("%d",&(HEAD->data)); // using HEAD->data to store the input directly into the data.
    printf("\n\t Head node created sucessfully...");
    p=HEAD; //storing the value of HEAD in p so that the value of HEAD does not change.

    // for remaining n-1 nodes in SLL
    for(int i=1;i<n;i++)
    {
      p->next = (snode *) malloc(sizeof(snode)); //allocating the memory to upcoming nodes.
      p = p->next; //changing the address of p to the next allocated address.
      p -> next=NULL;
      printf("\n\t Enter data to store at node %d:",i+1);
      scanf("%d",&(p->data)); //as the address of p is changed to upcoming nodes so p->next can be used to store the input directly into the data.
      printf("\n\t %d inserted sucessfully at node [%d][%u]",(p->data),i+1,p);
    }
  }
}

void traverse()
{
  snode *p;
  p=HEAD;
  while(p!=NULL)//The loop will break at NULL as in SLL the last node points to the NULL address.
  {
     p = p->next; //this will keep shifting to the next node as the loop goes on running.
  }
  printf("\n\t SLL is traversed sucessfully...");
}

void print()
{
  snode *p;
  p=HEAD;
  printf("\n");
  while(p!=NULL)//The loop will break at NULL as in SLL the last node points to the NULL address.
  {
    printf("\t [data=%d][address=%u][next=%u]",p->data,p,p->next);
    p = p->next; //this will keep shifting to the next node as the loop goes on running.
  }
}

void count()
{
  int count = 0;
  snode *p;
  p=HEAD;
  while(p!=NULL)//The loop will break at NULL as in SLL the last node points to the NULL address.
  {
     count++;
     p = p->next; //this will keep shifting to the next node as the loop goes on running.
  }
  printf("\n\t The SLL contains %d nodes",count);
}

void search()
{
  int se; //se = searching element
  int flag=0;
  snode *p;
  p=HEAD;
  printf("\n\t Enter the element for searching:");
  scanf("%d",&se);
  while(p!=NULL)//The loop will break at NULL as in SLL the last node points to the NULL address.
  {
    if(p->data==se)//traversing and comparing the data enteries with the
    {
      printf("\n\t %d is found at %u",se,p);
      flag = 1;
      break;
    }
    p = p->next; //this will keep shifting to the next node as the loop goes on running.
  }
  if(flag==0)
  {
    printf("\n\t element %d is not found in SLL",se);
  }
}

void concate()
{
  // declaring two variables to save the head of two linked lists.
  snode *h1;
  snode *h2;
  //creating first singly linked list.
  printf("\n\t Create SLL1:");
  create();
  h1=HEAD;
  printf("\n\t SLL1 created sucessfully");
  //creating second singly linked list.
  printf("\n\t Create SLL2:");
  create();
  h2=HEAD;
  printf("\n\t SLL2 created sucessfully");
  //starting the process of concating the singly linked lists.
  if(h1==NULL)//if the h1 linked list is NULL.
  {
    printf("\n\t New head after concat = %u",h2);
  }
  else if(h2==NULL)//if the h1 linked list is NULL.
  {
    printf("\n\t New head after concat = %u",h1);
  }
  else //if the h1 an d h2 linked list are not NULL.
  {
    snode *p;
    p=h1;
    while(p->next!=NULL) ////The loop will break at the pointer whose next points to NULL.
    {
      p=p->next;//this will keep shifting to the next node as the loop goes on running.
    }
    p->next=h2;
    printf("\n\t LL1 and LL2 concatinated");
    HEAD=h1; //setting the value to the main head as the print function needs the main head value.
    print();
  }
}

void insert_beg()
{
  snode *p;
  p = (snode*) malloc(sizeof(snode));
  printf("\n\t Enter data to insert at new node:");
  scanf("%d",&(p->data));
  p->next=HEAD;
  HEAD=p;
  printf("\n\t New node inserted successfully....&.....HEAD also updated");
}

void insert_end()
{
  snode *p; //for a new node
  snode *q; //for the traversing purpose
  p = (snode*) malloc(sizeof(snode));
  printf("\n\t Enter data to insert at new node:");
  scanf("%d",&(p->data));
  p->next=NULL;
  q=HEAD;
  while(q->next!=NULL) //This loop will run till it finds out the next ponter address as NULL.
  {
    q=q->next;
  }
  q->next=p; //After finding the null value we simply change the pointer of that NULL to address of the newly created node.
  printf("\n\t New node inserted successfully...");
}

void insert_sp()
{
  int loc; //for the location at which the node will be inserted.
  snode *p; //for saving the new node.
  snode *q; //for traversing to the location where the node will be inserted.
  p = (snode*) malloc(sizeof(snode));
  q = HEAD;
  printf("\n\t Enter the location for inserting the node:");
  scanf("%d",&loc);
  printf("\n\t Enter the data to be saved in the node:");
  scanf("%d",&(p->data));
  for(int i=1;i<loc;i++)//for traversing till the location
  {
    q=q->next;
  }
  p->next=q->next; //assigning the next of q node in the next of the p so it get connected to the next node.
  q->next=p;//assigning the next of q as the p so the q also gets connected to the p node.
  printf("\n\t New node inserted successfully at %d location...",loc);
}

void delete_beg()
{
  snode *p;
  p=HEAD;
  HEAD=HEAD->next;//setting the HEAD node to the upcoming node to free up the Initial HEAD node.
  free(p);
  printf("\n\t The node at beginning deleted successfully...");
}

void delete_end()
{
  snode *p; //for the purpose of deleting a node.
  snode *q; //for the previous node of a deleted node.
  p=HEAD;
  q=HEAD;
  while(p->next!=NULL)
  {
    q=p;//This will save the node previos w.r.t last node.
    p=p->next;
  }
  q->next=NULL;//Making the next node of q NULL.
  printf("\n\t The node at end deleted successfully...");
  free(p); //The space allocated to the p is free as we want to deleted the node.
}

void delete_sp()
{
  int loc; //for the location of the node.
  snode *p;//for saving the node to be deleted.
  snode *q;//for traversing to the previous node of the node getting deleted.
  p=HEAD;
  q=HEAD;
  printf("\n\t Enter the Location of node to be deleted:");
  scanf("%d",&loc);
  for(int i=1;i<loc;i++)//for traversing till the location
  {
    p=p->next;
  }
  for(int i=1;i<loc-1;i++)//for traversing till the node before location
  {
    q=q->next;
  }
  q->next=p->next;//assigning the value of next of the to be deleted node to the previous node.
  free(p);
  printf("\n\t The node at location %d deleted successfully...",loc);
}
