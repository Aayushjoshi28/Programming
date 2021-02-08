#include<stdio.h>
#include<string.h>
#define max 20
#define true 1
#define false 0

int stack[max];
int top=-1;

void push(char item)
{
  if(top == max-1)
  {
    printf("\n\t Stack is Already full.. char not pushed.. overflow ");
  }
  else
  {
    top = top + 1;
    stack[top] = item;
  }
}

char pop()
{
  if(top == -1)
  {
    printf("\n\t Stack Empty");
  }
  else
  {
    return stack[top--];
  }
}

void main()
{
  char exp[20],temp;
  int i,valid = true;
  printf("\n\t Enter the Algebraic Expression:");
  gets(exp);

  for(i = 0;i < strlen(exp);i++)
  {
    if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
    {
      push(exp[i]);
    }

    if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']')
    {
      if(top == -1)
      {
        valid = false;
      }
      else
      {
        temp = pop();
        if(exp[i]==')' && (temp == '{' || temp == '['))
        {
          valid = false;
        }
        if(exp[i]=='}' && (temp == '(' || temp == '['))
        {
          valid = false;
        }
        if(exp[i]==']' && (temp == '{' || temp == '('))
        {
          valid = false;
        }
      }
    }
  }
  if(top >= 0)
  {
    valid = false;
  }
  if(valid == true)
  {
    printf("\n\t Valid Expression");
  }
  else
  {
    printf("\n\t Invalid Expression");
  }
}
