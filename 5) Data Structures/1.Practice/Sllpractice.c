#include<stdio.h>
#include<stdlib.h>

typedef struct snode
{
  int data;
  struct node *next;
}snode;

snode *HEAD = NULL;

//declaring the required functions
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

//creating the main function to loop the commands in SLL
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
				printf("\n\tEnter correct choice from the given menu below:\n\t1.Create\n\t2.Traverse\n\t3.Print\n\t4.Count\n\t5.Search\n\t6.concate\n\t7.Insert_beg\n\t8.Insert_end\n\t9.Insert_sp\n\t10.Delete_beg\n\t11.Delete_end\n\t12.Delete_sp\n\t13.exit");
    }
  }
}

void create()
{

}

void traverse()
{

}

void print()
{

}

void count()
{

}

void search()
{

}

void concate()
{

}

void insert_beg()
{

}

void insert_end()
{

}

void insert_sp()
{

}

void delete_beg()
{

}

void delete_end()
{

}

void delete_sp()
{

}
