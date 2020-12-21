#include<stdio.h>
#include<stdlib.h>

typedef struct csnode
{
	int data;
	struct csnode *next;
}csnode;

csnode *HEAD=NULL;
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
		printf("\n\t ---------- Circular Singly Linked List----------");
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
	csnode *p;
	p=HEAD;
	while(p!=HEAD)
	{
		p=p->next;
	}
	printf("\n\t Traverse of CSLL done sucessfully...");
}
void create()
{
	int n;
	csnode *p;
	printf("\n\t Enter Number of nodes in CSLL:");
	scanf("%d",&n);		// 4
	if(n>0)
	{
		// for first node
		HEAD=(csnode *)malloc(sizeof(csnode));
		HEAD->next=HEAD;
		printf("\n\t Enter data to store at head node:");
		scanf("%d",&(HEAD->data));  // 45
		printf("\n\t Head created sucessfully...");
		p=HEAD;

		// for remaining n-1 nodes use loop
		for(int i=1;i<n;i++)
		{
			p->next=(csnode *)malloc(sizeof(csnode));
			p=p->next;
			p->next=HEAD;
			printf("\n\t Enter data to store at Node[%d]:",i+1);
			scanf("%d",&(p->data));		//55 // 65
			printf("\n\t %d inserted successfully at node[%d][%u]",(p->data),i+1,p);
		}
	}
}
void print()
{
	csnode *p;
	p=HEAD; /// head = 1000, p= 1000
	if(HEAD==NULL)
	{
		printf("\n\t Linked list is empty...");
	}
	printf("\n");
	while(p->next!=HEAD) // 1000 !=1000 
	{
		printf("\t|data=%d|[add=%u]|[next=%u]| ",p->data,p,p->next);
		p=p->next;
	}
	printf("\t|data=%d|[add=%u]|[next=%u]| ",p->data,p,p->next);
}
void count()
{
	int cn=0;
	csnode *p;
	p=HEAD;
	while(p->next!=HEAD)
	{
		cn=cn+1;
		p=p->next;
	}
	cn=cn+1;
	printf("\n\t Number of Nodes in linked list is %d",cn);
}
void search()
{
	csnode *p;
	int se;
	int flag=0;
	p=HEAD;
	printf("\n\t Enter element to search:");
	scanf("%d",&se);
	while(p->next!=HEAD)
	{
		if(p->data==se)
		{
			printf("\n\t %d found at %u",se,p);
			flag=1;
			break;
		}
		p=p->next;
	}
	if(p->data==se)
	{
		printf("\n\t %d found at %u",se,p);
		flag=1;
	}
	if(flag==0)
	{
		printf("\n\t %d element not found in LL",se);
	}
}
void concat()
{
	csnode *h1;
	csnode *h2;
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
		csnode *p;
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
	csnode *p;
	p=(csnode *)malloc(sizeof(csnode));
	printf("\n\t Enter data to insert at new node:");
	scanf("%d",&(p->data));
	p->next=HEAD;
	HEAD=p;
	printf("\n\t New node inserted sucessfully.. HEAD also updated");
}

void insert_end()
{
	csnode *p; // to reserve new node 
	csnode *q; // traversing the existing ll
	p=(csnode *)malloc(sizeof(csnode));
	printf("\n\t Enter the data for new node:");
	scanf("%d",&(p->data));
	p->next=HEAD;
	q=HEAD;
	while(q->next!=HEAD)
	{
		q=q->next;
	}
	q->next=p;
	q=q->next;
	printf("\n\t New node inserted sucessfully at end...");
}

void insert_sp()
{
	csnode *p,*q;
	int loc;
	printf("\n\t Enter location where you want to insert new node:");
	scanf("%d",&loc);
	p=(csnode *)malloc(sizeof(csnode));
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
	csnode *p;
	p=HEAD;
	HEAD=HEAD->next;
	printf("\n\t Node %d from %u location is deleted",p->data,p);
	free(p);
}

void delete_end()
{
	csnode *p,*q;
	p=HEAD;
	q=HEAD;
	while(p->next!=HEAD)
	{
		q=p;
		p=p->next;
	}
	q->next=HEAD;
	printf("\n\t Node %d from %u location is deleted",p->data,p);
	free(p);
}

void delete_sp()
{
	
}
