#include<stdio.h>
#include<stdlib.h>

typedef struct snode
{
	int data;
	struct snode *next;
}snode;

snode *top=NULL;

void push();
void pop();
void display();

void main()
{
	int ch;
	while(1)
	{
		printf("\n\t ----------- Stack using Linked List ------------");
		printf("\n\t 1. Display\t2.Push\t3.Pop\t4.Exit");
		printf("\n\t Enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:display();break;
			case 2:push();break;
			case 3:pop();break;
			case 4:exit(0);
			default:
				printf("\n\t Enter choice between 1-4...");
		}
	}
}

void push()
{
	snode *p; // p variable is used for pointing new node
	p=(snode *)malloc(sizeof(snode));
	printf("\n\t ENter data for NEw node:");
	scanf("%d",&(p->data));

	if(top==NULL) // stack empty, p is first
	{
		p->next = NULL;
	}
	else  // p is non-first
	{
		p->next=top;
	}
	top = p;
	printf("\n\t %d pushed at %u sucessfully",p->data,top);
}


void pop()
{
	snode *p;
	p=top;
	if(top==NULL)
	{
		printf("\n\t Stack already empty, pop not possible");
	}
	else
	{
		top=p->next;	
		printf("\n\t %d is popped from %u",p->data,p);
		free(p);
	}
}

void display()
{
	snode *p;
	p=top;
	if(top==NULL)
	{
		printf("\n\t Stack empty");
	}
	else
	{
		while(p!=NULL)
		{
			printf("\n %d (%u) (n= %u)",p->data,p,p->next);
			p=p->next;
		}
	}
}
