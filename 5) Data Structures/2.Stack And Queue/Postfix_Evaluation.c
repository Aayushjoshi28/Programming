/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-07-25T18:07:25+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Postfix_Evaluation.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-11-19T11:59:29+05:30
 */
#include<stdio.h>

int stack[10];
int top = -1;
//defining two function for push and pop
void push(int x);
int pop();

void main()
{
    char exp[20];                  //store expression
    char *p;                        //pointer to point symbols in the expression
    int n1,n2,n3,num;
    printf("\n\t Enter Postfix Expression to solve:"); // accepting the expression from the user and storing it
    scanf("%s",exp);
    p = exp;                       //assigning base address to the pointer
    while(*p != '\0')             // till symbols in exp is not null
    {
        if(isdigit(*p))           //checking condition for value or operator
        {
            num = *p - 48;       //ASCII value of '0' is 48 so after entering a number eg; 5 , we get 53-48 = 5
            push(num);           // if scanned symbol is value -> push into stack
        }
        else                     // if scanned symbol is operator, do 2 pops, perform operation and store
        {                        // result back to the stack
            n2 = pop();
            n1 = pop();
            switch(*p)           // 4 cases for 4 different operations
            {
                case '+': n3 = n1 + n2;break;
                case '-': n3 = n1 - n2;break;
                case '*': n3 = n1 * n2;break;
                case '/': n3 = n1 / n2;break;
            }
            push(n3);           // result stored back to stack
        }
        p++;                    // pointer incremented to point next symbol
    }

    printf("\n\t Result of Exp %s is %d.",exp,pop());
}

//pushing the value in the stack
void push(int x)
{
    top = top + 1;
    stack[top] = x;
}
// returns value which is at top of the stack
int pop()
{
    return stack[top--];
}
