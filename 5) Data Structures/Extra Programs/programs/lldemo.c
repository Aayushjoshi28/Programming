#include<stdio.h>
#include<stdlib.h>

typedef struct node			//12 bytes
{
	int data;		// 4 Bytes
	struct node *next;	// 8 Bytes
}node;

void main()
{
	struct node *head=NULL;
	struct node *n2=NULL;
	struct node *n3=NULL;
	// allocate memory to these nodes
	head=(node *)malloc(sizeof(node));
	n2=(node *)malloc(sizeof(node));
	n3=(node *)malloc(sizeof(node));
	
	// print address of all nodes
	printf("\n\t Address of head node = %u",head);
	printf("\n\t Address of n2 node = %u",n2);
	printf("\n\t Address of n3 node = %u",n3);
	
	//assign data to all nodes
	printf("\n\t Enter Data to store in head node:");
	scanf("%d",&(head->data));
	printf("\n\t Enter Data to store in n2 node:");
	scanf("%d",&(n2->data));
	printf("\n\t Enter Data to store in n3 node:");
	scanf("%d",&(n3->data));
	
	//create link between the nodes
	head->next=n2;
	n2->next = n3;
	n3->next=NULL;	

	// print linked list
	node *p;
	p=head;
	while(p!=NULL)
	{
		printf("\t %d[%u]",p->data,p);
		p=p->next;
	}
}

















