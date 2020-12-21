#include<stdlib.h>
#include<stdio.h>
//Declaring required functions
void push();
void pop();
void peek();
int isfull();
int isempty();
void display();
//create stack using array
#define max_size 5
int stack[max_size];
int top = -1,ch,data;

//main function-execution starts from here
void main()
{
  while(1)
  {
    printf("\n\t----------------------Stack Using Array----------------------");
    printf("\n\t1.display\t2.push\t3.pop\t4.peek\t5.isfull\t6.isempty\t7.exit");
    printf("\n\t Enter the Choice:");
    scanf("%d",&ch);
    switch(ch)
    {
      case 1:display();break;
      case 2:push();break;
      case 3:pop();break;
      case 4:peek();break;
      case 5:isfull();break;
      case 6:isempty();break;
      case 7:exit(0);break;
      default:printf("\n\t Please enter correct choice(1-7).");
    }
  }
}
void push()
{
  printf("\n\tEnter data to push:");
  scanf("%d",&data);
  if(isfull())
  {
    printf("\n\tStack is already full.....Overflow");
  }
  else
  {
    top = top + 1;
    stack[top] = data;
    printf("\n\t%d is pushed successfully at index %d",data,top);
  }
}
void pop()
{
  if(isempty())
  {
    printf("\n\tStack is already empty.....underflow");
  }
  else
  {
    printf("\n\t%d is poped successfully from index %d",stack[top],top);
    top = top - 1;
  }
}
void peek()
{
  printf("\n\t peek value is %d at index %d",stack[top],top);
}
int isfull()
{
  if(top == max_size-1)
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
  if(top == -1)
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
  printf("\n\tCurrent stack is:");
  if(top == -1)
  {
    printf("\n\tStack is empty");
  }
  else
  {
    int i;
    for(i=top;i>=0;i--)
    {
      printf("\n\t%d",stack[i]);
    }
  }
}
