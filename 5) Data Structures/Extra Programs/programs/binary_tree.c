#include<stdio.h>
#include<stdlib.h>

typedef struct btnode
{
	struct btnode *lc;
	int data;
	struct btnode *rc;
}btnode;

btnode *create();
void display_in();
void display_pre();
void display_post();
int count();
int leaf_count();
int cal_height();
void main()
{
	int ch,no_of_nodes,ln,h;
	btnode *R;
	while(1)
	{
		printf("----------Binary Tree --------");
		printf("\n1.create 2.display_IN 3.display_PRE 4. display_POST 5. count 6. leaf_count 7. cal_height 0.Exit");
		printf("\n Enter the choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 0: exit(0);
			case 1: R=create();
				printf("\n Tree Created Sucessfully.. and root node address is %u",R);
				break;
			case 2: display_in(R);break;
			case 3: display_pre(R);break;
			case 4: display_post(R); break;
			case 5: no_of_nodes=count(R);
				printf("\n\t Number of Nodes = %d",no_of_nodes);
				break;
			case 6: ln=leaf_count(R);
				printf("\n\t Leaf nodes=%d",ln);
				break;
			case 7: h=cal_height(R);
				printf("\n\t Height= %d",h);
				break;
			default:
				printf("\n Enter Correct Choice:");
		}
	}
}


btnode *create()
{
	btnode *p;
	int x;
	printf("\n Enter Data for Node(-1 for no data)");
	scanf("%d",&x);
	if(x==-1)
	{
		return NULL;
	}
	p=(btnode *)malloc(sizeof(btnode));
	p->data=x;
	printf("\nEnter the Left child of %d",x);
	p->lc=create();
	printf("\n Enter the Right Child of %d",x);
	p->rc=create();
	return p;
}

void display_in(btnode *p) // LVR
{
	if(p!=NULL)
	{
		display_in(p->lc); // left subttree
		printf("\t %d", p->data);  // v
		display_in(p->rc);   // right sub tree
	}
}

void display_pre(btnode *p)
{
	if(p!=NULL)
        {
		printf("\t %d", p->data);  // v 
                display_pre(p->lc); // left subttree
                display_pre(p->rc);   // right sub tree
        }

}

void display_post(btnode *p)
{
	if(p!=NULL)
        {
                display_post(p->lc); // left subttree
                display_post(p->rc);   // right sub tree
		printf("\t %d", p->data);  // v 
        }

}

int count(btnode *p)
{
	int i=0;
	if(p==NULL)
		return 0;
	i=1+count(p->lc)+count(p->rc);
	return i;
}

int leaf_count(btnode *p)
{
	int i=0;
	if(p==NULL)
		return 0;
	if(p->lc==NULL && p->rc==NULL)
		return 1;
	i=i+leaf_count(p->lc) + leaf_count(p->rc);
	return i;
}

int cal_height(btnode *p)
{
	int hl,hr;
	if(p==NULL)
		return 0;
	if(p->lc==NULL && p->rc==NULL)
		return 0;
	hl=cal_height(p->lc);
	hr=cal_height(p->rc);

	if(hl>hr)
	{
		return (hl+1);
	}
	else
	{
		return (hr+1);
	}
}
