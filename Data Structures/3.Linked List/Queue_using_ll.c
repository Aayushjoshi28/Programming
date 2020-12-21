/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-13T23:23:30+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Queue_using_ll.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-24T14:44:23+05:30
 */

#include<stdio.h>
#include<stdlib.h>

typedef struct qnode
{
	int data;
	struct qnode *next;
}qnode;

qnode *front=NULL;
qnode *rear=NULL;

void enqueue(); // rear
void dequeue(); // front
void display();
int peek();

void main()
{
	printf("\n\t Queue using Linked List By Aayush Joshi SE4_14");
	int ch;
	while(1)
	{
		printf("\n\t ----------- Queue using Linked List ------------");
		printf("\n\t 1.Display\t2.Enqueue\t3.Dequeue\t4.peek\t5.Exit");
		printf("\n\t Enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:display();break;
			case 2:enqueue();break;
			case 3:dequeue();break;
			case 4:peek();break;
			case 5:exit(0);
			default:
				printf("\n\t Enter choice between 1-4...");
		}
	}
}

void enqueue()
{
	qnode *p;
	p=(qnode *)malloc(sizeof(qnode));
	printf("\n\t Enter data for New Node:");
	scanf("%d",&(p->data));
	p->next=NULL;

	// now check Queue is empty or not?
	if(rear==NULL && front==NULL)
	{
		rear=p;
		front=p;
	}
	else  // Q is not empty
	{
		rear->next=p;
		rear=p;
	}
	printf("\n\t %d enqueued at %u sucessfully...", p->data,p);
}


void dequeue()
{
	qnode *p;
	p=front;
	if(front==NULL)
	{
		printf("\n\t Queue is already empty.. dequeue not possible");
	}
	else
	{
		front=front->next;
		printf("\n\t %d is dequeued from %u sucesfully...",p->data,p);
		free(p);
	}
}


void display()
{
	qnode *p;
	p=front;
	if(front==NULL)
	{
		printf("\n\t Queue is empty.");
	}
	else
	{
		printf("\n");
		while(p!=NULL)
		{
			printf("\t %d(%u)(n=%u) ",p->data,p,p->next);
			p=p->next;
		}
	}
}

int peek()
{
	if(front != NULL)
	{
		printf("\n\t %d (%u)",front->data,front);
	}
	else
	{
		printf("\n\t Queue is empty");
	}
}
