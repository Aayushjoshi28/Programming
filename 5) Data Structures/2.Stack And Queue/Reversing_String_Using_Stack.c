/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-08-17T22:19:43+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Reversing_String_Using_Stack.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-16T15:32:15+05:30
 */



#include<stdio.h>
#include<string.h>
#define max_size 100 //create stack using array
int top = -1;
int item;
char stack_string[max_size];
//declare required functions
void pushchar(char item);
char popchar(void);

int isfull();
int isempty();
int main(void)
{
  char str[max_size];
  int i;
  printf("\n\tEnter the String to be Reversed:");
  scanf("%[^\n]",str); //read string with spaces

  for(i=0;i<strlen(str);i++)
  {
    pushchar(str[i]);
  }
  printf("\n\t--------------------String reversal started-------------------------------");
  for(i=0;i<strlen(str);i++)
  {
    str[i] = popchar();
  }
  printf("\n\t--------------------String reversal completed-------------------------------");
  printf("\n\tReversed String is %s\n",str);
  return 0;
}

void pushchar(char item)
{
  if(isfull())
  {
    printf("\n\tStack is already full.....Overflow\n");
  }
  else
  {
    top = top + 1;
    stack_string[top] = item;
    printf("\n\t%d is pushed successfully at index %d",item,top);
  }
}

char popchar()
{
  if(isempty())
  {
    printf("\n\tStack is already empty.....Underflow");
  }
  else
  {
    item = stack_string[top];
    printf("\n\t%c is poped successfully from index %d",stack_string[top],top);
    top = top - 1;
    return item;
  }
}
int isfull()
{
  if(top == max_size - 1)
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
