#include<stdio.h>
#include<stdlib.h>
//creating node for the linked list
typedef struct node
{
  int data;
  struct node *next;
}node;



void  main()
{
  node *head=NULL;
  node *n2=NULL;
  node *n3=NULL;

  //ALLOCATE MEMORY TO THESE NODES
  head = (node *) malloc(sizeof(node));
  n2 = (node *) malloc(sizeof(node));
  n3 = (node *) malloc(sizeof(node));
  //print address of all nodes
  printf("\n\t Address of head node = %u",head);
  printf("\n\t Address of n2 node = %u",n2);
  printf("\n\t Address of n3 node = %u",n3);

  //Assign data to all nodes
  printf("\n\t Enter data to store in head node:");
  scanf("%d",&(head->data));
  printf("\n\t Enter data to store in n2 node:");
  scanf("%d",&(n2->data));
  printf("\n\t Enter data to store in n3 node:");
  scanf("%d",&(n3->data));

  //creating links between nodes
  head -> next = n2;
  n2 -> next = n3;
  n3 -> next = NULL;

  //printing linked List
  node *p;
  p = head;
  while(p != NULL)
  {
    printf("\t %d[%u]",p->data,p);
    p=p->next;
  }
}
