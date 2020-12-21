#include<stdlib.h>
#include<stdio.h>
// Declare required Functions
void push();
void pop();
void peek();
int isfull();
int isempty();
void display();

// create stack using array
#define max_size 5
int stack[max_size];
int top = -1,ch,data;
// Main function - Execution starts from here
void main()
{
	while(1)
	{
		printf("\n\t ----------- Stack Using Array---------");
		printf("\n\t 1. Display\t2.Push\t3.Pop\t4.Peek\t5.isfull\t6.isempty\t7.Exit");
		printf("\n\t Enter the Choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:display();break;
			case 2: push();break;
			case 3:pop();break;
			case 4:peek();break;
			case 5:isfull();break;
			case 6:isempty();break;
			case 7:exit(0);
			default:printf("\n\t Please enter correct choie (1-7).");
		}
	}
}

// Define required fuctions
void push()
{
	printf("\n\t Enter data to push:");
	scanf("%d",&data);
	if(isfull())
	{
		printf("\n\tOverflow... data is not pushed ");
	}
	else
	{
		top=top+1;
		stack[top]=data;
		printf("\n\t %d id pushed sucessfully at index %d",data,top);
	}
}
void pop()
{
	if(isempty())
	{
		printf("\n\t Stack is Already empty.. underflow");
	}
	else
	{
		printf("\n\t %d is popped sucessfully from index %d.. ",stack[top],top);
		top=top -1;
	}
}
void peek()
{
	printf("\n\t Peek value is %d at index %d",stack[top],top);
}
int isfull()
{
	if(top==max_size-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int isempty()
{
	if(top==-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
void display()
{
	printf("\n\t Current stack is -- - \n");
	if(top ==-1)
	{
		printf("Stack is empty");
	}
	else
	{
		for(int i=top;i>=0;i--)
		{
			printf("\n %d",stack[i]);
		}
	}
}
