#include<stdio.h>
#define max 5
char stack[max];
int top=-1;

void push(char x)
{
	top=top+1;
	stack[top]=x;
}
char pop()
{
	if(top==-1)
		return -1;
	else
		return stack[top--];
}
int priority(char x)
{
	if(x=='(')
		return 0;
	if(x=='+' || x=='-')
		return 1;
	if(x=='*'||x=='/')
		return 2;
}

void main()
{
	char exp[20];
	char *p,x;
	printf("\n\t Enter the expression:");
	scanf("%s",exp);
	p=exp;
	while(*p!='\0')
	{
		if(isalnum(*p))
		{
			printf("%c",*p);
		}
		else if(*p=='(')
		{
			push(*p);
		}
		else if(*p==')')
		{
			while((x=pop())!='(')
			{
				printf("%c",x);
			}
		}
		else
		{
			while(priority(stack[top])>=priority(*p))
			{
				printf("%c",pop());
			}
			push(*p);
		}
		p++;
	}
	while(top!=-1)
	{
		printf("%c",pop());
	}
}

