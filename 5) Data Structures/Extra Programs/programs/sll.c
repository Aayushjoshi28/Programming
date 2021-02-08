#include<stdio.h>
#include<stdlib.h>

typedef struct snode
{
	int data;
	struct node *next;
}snode;

snode *HEAD=NULL;
void create();
void traverse();
void print();
void count();
void search();
void concat();
void insert_beg();
void insert_end();
void insert_sp();
void delete_beg();
void delete_end();
void delete_sp();

void main()
{
	int ch;
	while(1)
	{
		printf("\n\t ---------- Singly Linked List----------");
		printf("\n\t1.Create\t2.Traverse\t3.Print\t4.Count\t5.Search\t6.concate\t7.Insert_beg\t8.Insert_end\t9.Insert_sp\t10.Delete_beg\t11.Delete_end\t12.Delete_sp\t13.exit");
		printf("\n\t ENter Your Choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:create();break;
			case 2:traverse();break;
			case 3:print();break;
			case 4:count();break;
			case 5:search();break;
			case 6:concat();break;
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

void traverse()
{
	snode *p;
	p=HEAD;
	while(p!=NULL)
	{
		p=p->next;
	}
	printf("\n\t Traverse of SLL done sucessfully...");
}
void create()
{
	int n;
	snode *p;
	printf("\n\t Enter Number of nodes in SLL:");
	scanf("%d",&n);		// 4
	if(n>0)
	{
		// for first node
		HEAD=(snode *)malloc(sizeof(snode));
		HEAD->next=NULL;
		printf("\n\t Enter data to store at head node:");
		scanf("%d",&(HEAD->data));  // 45
		printf("\n\t Head created sucessfully...");
		p=HEAD;

		// for remaining n-1 nodes use loop
		for(int i=1;i<n;i++)
		{
			p->next=(snode *)malloc(sizeof(snode));
			p=p->next;
			p->next=NULL;
			printf("\n\t Enter data to store at Node[%d]:",i+1);
			scanf("%d",&(p->data));		//55 // 65
			printf("\n\t %d inserted successfully at node[%d][%u]",(p->data),i+1,p);
		}
	}
}
void print()
{
	snode *p;
	p=HEAD;
	if(HEAD==NULL)
	{
		printf("\n\t Linked list is empty...");
	}
	printf("\n");
	while(p!=NULL)
	{
		printf("\t|data=%d|[add=%u]|[next=%u]| ",p->data,p,p->next);
		p=p->next;
	}
}
void count()
{
	int cn=0;
	snode *p;
	p=HEAD;
	while(p!=NULL)
	{
		cn=cn+1;
		p=p->next;
	}
	printf("\n\t Number of Nodes in linked list is %d",cn);
}
void search()
{
	snode *p;
	int se;
	int flag=0;
	p=HEAD;
	printf("\n\t Enter element to search:");
	scanf("%d",&se);
	while(p!=NULL)
	{
		if(p->data==se)
		{
			printf("\n\t %d found at %u",se,p);
			flag=1;
			break;
		}
		p=p->next;
	}
	if(flag==0)
	{
		printf("\n\t %d element not found in LL",se);
	}
}
void concat()
{
	snode *h1;
	snode *h2;
	printf("\n\t Create LL1:");
	create();
	h1=HEAD;
	printf("\n\t LL1 created");
	printf("\n\t Create LL2:");
	create();
	h2=HEAD;
	printf("\n\t LL2 created");
	if(h1==NULL)
	{
		printf("\n\t New head after concat = %u",h2);
	}
	else if(h2==NULL)
	{
		printf("\n\t New head after concat = %u",h1);
	}
	else
	{
		snode *p;
		p=h1;
		while(p->next!=NULL)
		{
			p=p->next;
		}
		p->next=h2;
		printf("\n\t LL1 and LL2 concatinated");
		HEAD=h1;
		print();
	}
}

void insert_beg()
{
	snode *p;
	p=(snode *)malloc(sizeof(snode));
	printf("\n\t Enter data to insert at new node:");
	scanf("%d",&(p->data));
	p->next=HEAD;
	HEAD=p;
	printf("\n\t New node inserted sucessfully.. HEAD also updated");
}

void insert_end()
{
	snode *p; // to reserve new node 
	snode *q; // traversing the existing ll
	p=(snode *)malloc(sizeof(snode));
	printf("\n\t Enter the data for new node:");
	scanf("%d",&(p->data));
	p->next=NULL;
	
	q=HEAD;
	while(q->next!=NULL)
	{
		q=q->next;
	}
	q->next=p;
	printf("\n\t New node inserted sucessfully at end...");
}

void insert_sp()
{
	snode *p,*q;
	int loc;
	printf("\n\t Enter location where you want to insert new node:");
	scanf("%d",&loc);
	p=(snode *)malloc(sizeof(snode));
	printf("\n\t Enter data for new node:");
	scanf("%d",&(p->data));
	p->next = NULL;
	q=HEAD;
	for(int i=1;i<(loc-1);i++)
	{
		q=q->next;
	}
	p->next=q->next;
	q->next=p;
	printf("\n\t Success");
}

void delete_beg()
{
	snode *p;
	p=HEAD;
	HEAD=HEAD->next;
	printf("\n\t Node %d from %u location is deleted",p->data,p);
	free(p);
}

void delete_end()
{
	snode *p,*q;
	p=HEAD;
	q=HEAD;
	while(p->next!=NULL)
	{
		q=p;
		p=p->next;
	}
	q->next=NULL;
	printf("\n\t Node %d from %u location is deleted",p->data,p);
	free(p);
}

void delete_sp()
{
	
}
