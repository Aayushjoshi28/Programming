#include<stdio.h>
#include<stdlib.h>

typedef struct dnode
{
	struct dnode *prev;
	int data;	
	struct dnode *next;
}dnode;

dnode *HEAD=NULL;

void create();
void display();
void traverse();
void count();
void search();
void insert_beg();
void insert_end();
void insert_sp();
void delete_beg();
void delete_end();
void delete_sp();

void main()
{
	int ch;
	while(5)
	{
		printf("\n\t --------- Doubly Linked list-----------");
		printf("\n\t1.create 2.display 3.traverse 4.count 5.search 6.ib 7.ie 8.isp 9.db 10.de 11.dsp 12. exit");
		printf("\n\t Enter the choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:create();break;
			case 2:display();break;
			case 3:traverse();break;
			case 4:count();break;
			case 5:search();break;
			case 6:insert_beg();break;
			case 7:insert_end();break;
			case 8:insert_sp();break;
			case 9:delete_beg();break;
			case 10:delete_end();break;
			case 11:delete_sp();break;
			case 12:exit(0);
			default:
				printf("\n\t Wrong Choice...");
		}
	}
}
void create()
{
	int n;
	dnode *p;
	printf("\n\t Enter Number of nodes in DLL:");
	scanf("%d",&n);		// 4
	if(n>0)
	{
		// for first node
		HEAD=(dnode *)malloc(sizeof(dnode)); // 1000
		HEAD->next=NULL;
		HEAD->prev=NULL;
		printf("\n\t Enter data to store at head node:");
		scanf("%d",&(HEAD->data));  // 11
		printf("\n\t Head created sucessfully...");
		p=HEAD; // 1000

		// for remaining n-1 nodes use loop
		for(int i=1;i<n;i++)
		{
			p->next=(dnode *)malloc(sizeof(dnode));
			p->next->prev = p;
			p=p->next;
			p->next=NULL;
			printf("\n\t Enter data to store at Node[%d]:",i+1);
			scanf("%d",&(p->data));		//22 
			printf("\n\t %d inserted successfully at node[%d][%u]",(p->data),i+1,p);
		}
	}
}
void display()
{
	dnode *p; // forward printing
	dnode *q; // backward printing
	p=HEAD;
	q=HEAD;
	printf("\n\t Forward printing\n");
	while(p!=NULL)
	{
		q=p;
		printf(" [%u]%d(%u)[%u] ",p->prev,p->data,p,p->next);
		p=p->next;
	}
	printf("\n\t Backward printing\n");
	while(q!=NULL)
	{
		printf(" [%u]%d(%u)[%u] ",q->prev,q->data,q,q->next);
		q=q->prev;
	}
}
void traverse()
{
	dnode *p; // forward traversing
	dnode *q; // backward traversing
	p=HEAD;
	q=HEAD;
	while(p!=NULL)
	{
		q=p;
		p=p->next;
	}
	printf("\n\t Forward traversing sucess\n");
	
	while(q!=NULL)
	{
		q=q->prev;
	}
	printf("\n\t Backward traversing sucesss\n");
}
void count()
{
	dnode *p; // forward printing
	p=HEAD;
	int cnt=0;
	while(p!=NULL)
	{
		cnt =cnt+1;
		p=p->next;
	}
	printf("\n\t No of NOdes in DLL = %d\n",cnt);
}
void search()
{
	dnode *p; // forward printing
	p=HEAD;
	int se,found=0;
	printf("\n\t Enter element to search:");
	scanf("%d",&se);
	while(p!=NULL)
	{
		if(p->data==se)
		{
			printf("\n\t %d found at %u",p->data,p);
			found=1;
			break;
		}
		p=p->next;
	}
	if(found==0)
	{
		printf("\n\tElement Not found in the list");
	}
	
}
void insert_beg()
{
	dnode *p;
	p=(dnode *)malloc(sizeof(dnode));
	printf("\n\t Enter Data:");
	scanf("%d",&(p->data));
	p->prev=NULL;
	HEAD->prev=p;
	p->next=HEAD;
	HEAD=p;
	printf("\n\t Sucess");
}
void insert_end()
{
	dnode *p,*q;
	p=(dnode *)malloc(sizeof(dnode));
	printf("\n\t Enter Data:");
	scanf("%d",&(p->data));
	p->next=NULL;
	q=HEAD;
	while(q->next!=NULL)
	{
		q=q->next;
	}
	q->next=p;
	p->prev=q;
	printf("\n\t Sucess");
}
void insert_sp()
{
	int loc;
	printf("\n\t Enter loc:"); //3
	scanf("%d",&loc);
	dnode *p,*q;
	p=(dnode *)malloc(sizeof(dnode));
	printf("\n\t Enter Data:");
	scanf("%d",&(p->data));
	q=HEAD;
	for(int i=1;i<(loc-1);i++)
	{
		q=q->next;
	}
	p->next=q->next;
	p->prev=q;
	q->next=p;
	p->next->prev=p;
	printf("\n\t Sucess");
}
void delete_beg()
{
	if(HEAD==NULL)
	{
		printf("\n\t Deletion is not possible..");
	}
	else
	{
		dnode *p;
		p=HEAD;
		HEAD=HEAD->next;
		HEAD->prev = NULL;
		free(p);
		printf("\n\t Deletion Success...");
	}
}
void delete_end()
{
	if(HEAD==NULL)
	{
		printf("\n\t LL empty.. deletion not possible");
	}
	else
	{
		dnode *p;
		p=HEAD;
		while(p->next!=NULL)
		{
			p=p->next;
		}
		p->prev->next=NULL;
		free(p);
		printf("\n\t Deletion success..");
	}
}
void delete_sp()
{
	int loc;
	dnode *p;
	p=HEAD;
	printf("\n\t Enter loc to delete:");
	scanf("%d",&loc); // 3
	for(int i=1;i<loc;i++)
	{
		p=p->next;
	}
	p->prev->next=p->next;
	p->next->prev=p->prev;
	free(p);
	printf("\n\t Deletion Success");
}









