 /**
  * @Author: Aayush Joshi SE4_14
  * @Date:   2020-09-10T14:11:10+05:30
  * @Email:  aayush.joshi_19@sakec.ac.in
  * @Project: Programming
  * @Filename: infix_to_postfix.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-16T15:34:11+05:30
  */
 #include<stdio.h>
 #include<string.h>
 #include<ctype.h>
 #define max_size 100
 char stack[max_size];
 int top = -1;


 void push(char x)
 {
    stack[++top] = x;
 }

 char pop()
 {
    if(top == -1)
    {
      return -1;
    }
    else
    {
      return stack[top--];
    }
 }

 int priority(char x)
 {
      if(x == '(')
      {
        return 0;
      }
      if(x == '+' || x == '-')
      {
        return 1;
      }
      if(x == '*' || x == '/')
      {
        return 1;
      }
      return 0;
 }

 int main()
 {
   char exp[max_size];
   char *e, x;
   int i;
   printf("Enter the expression : ");
   scanf("%s",exp);
   printf("\n");

   for(i=0;i<strlen(exp);i++)
   {
     pushchar(exp[i]);
   }
   for(i=0;i<strlen(exp);i++)
   {
     exp[i] = popchar();
   }

   e = exp;
   while(*e != '\0')
   {
     if(isalnum(*e))
     {
       printf("%c ",*e);
     }
     else if(*e == '(')
     {
       push(*e);
     }
     else if(*e == ')')
     {
       while((x = pop()) != '(')
       {
         printf("%c ", x);
       }
     }
     else
     {
       while(priority(stack[top]) >= priority(*e))
       {
         printf("%c ",pop());
       }
       push(*e);
     }
     e++;
   }

   while(top != -1)
   {
     printf("%c ",pop());
   }

 }
