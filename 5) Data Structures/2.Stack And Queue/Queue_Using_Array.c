/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-08-12T19:06:02+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Queue_Using_Array.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T14:16:15+05:30
 */



#include<stdlib.h>
#include<stdio.h>
#define max_size 5

int queue[max_size];
int front = -1;
int rear = -1;

void enqueue();
void dequeue();
void display();
void peek()
{
  printf("\n\t Peek : %d",queue[front]);
}
void isfull()
{
  if(rear == max_size-1)
  {
    printf("\n\t Queue is full");
  }
  else
  {
    printf("\n\t Queue is not full");
  }
}
void isempty()
{
  if(front == -1 && rear == -1)
  {
    printf("\n\t Queue is empty");
  }
  else
  {
    printf("\n\t Queue is not empty");
  }
}
void main()
{
  int ch;
  while(2)
  {
    printf("\n\t ------------------------------------ Queue using Array ------------------------------------");
    printf("\n\t1.Display\t2.Enqueue\t3.Dequeue\t4.peek\t5.Isfull\t6.Isempty\t7.Exit");
    printf("\n\t Enter Your choice:");
    scanf("%d",&ch);
    switch(ch)
    {
      case 1:display();break;
      case 2:enqueue();break;
      case 3:dequeue();break;
      case 4:peek();break;
      case 5:isfull();break;
      case 6:isempty();break;
      case 7:exit(0);
      default:
              printf("\n\t Enter correct choice (1-4)");
    }
  }
}

void enqueue()
{
  int data;
  printf("\n\t Enter data to enqueue: ");
  scanf("%d",&data);
  if(front == 0 && rear==max_size - 1)
  {
    printf("\n\t Queue is already full... Overflow");
  }
  else if(front == -1 && rear == -1)
  {
    front = front + 1;
    rear = rear + 1;
    queue[rear] = data;
    printf("\n\t %d data is enqueded at %d",data,rear);
  }
  else if(rear < max_size-1)
  {
    rear = rear + 1;
    queue[rear] = data;
    printf("\n\t %d data is enqueued at %d",data,rear);
  }
}

void dequeue()
{
  if(front == -1 && rear == -1)
  {
    printf("\n\t Queue is already empty ...Underflow");
  }
  else if(front == rear)
  {
    printf("\n\t %d data is dequeued from %d",queue[front],front);
    front = -1;
    rear = -1;
  }
  else
  {
    printf("\n\t %d data is dequeued from %d",queue[front],front);
    front++;
  }
}

void display()
{
  if(front == -1 && rear == -1)
  {
    printf("\n\t Queue is empty");
  }
  else
  {
    int i;
    i = front;
    while(i <= rear)
    {
      printf("\t%d\t",queue[i]);
      i++;
    }
  }
}
