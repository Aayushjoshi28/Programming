/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-13T23:23:30+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Stack_Using_ll.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-28T11:33:10+05:30
 */



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
int peek();

void main()
{
	printf("\n\t Stack using Linked List By Aayush Joshi SE4_14");
	int ch;
	while(1)
	{
		printf("\n\t ----------- Stack using Linked List ------------");
		printf("\n\t 1. Display\t2.Push\t3.Pop\t4.peek\t5.Exit");
		printf("\n\t Enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:display();break;
			case 2:push();break;
			case 3:pop();break;
			case 4:peek();break;
			case 5:exit(0);
			default:
				printf("\n\t Enter choice between 1-4...");
		}
	}
}

void push()
{
	snode *p; // p variable is used for pointing new node
	p=(snode *)malloc(sizeof(snode));
	printf("\n\t Enter data for new node:");
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
		printf("\n\t Stack is already empty, pop is not possible");
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
		printf("\n\t Stack is empty");
	}
	else
	{
		while(p!=NULL)
		{
			printf("\n\t %d (%u) (n= %u)",p->data,p,p->next);
			p=p->next;
		}
	}
}

int peek()
{
	if(top != NULL)
	{
		printf("\n\t %d (%u)",top->data,top);
	}
	else
	{
		printf("\n\t The stack is empty");
	}
}
