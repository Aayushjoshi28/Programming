#include<stdio.h>
#include<stdlib.h>
#define max_size 5
int queue[max_size];
int front = -1;
int rear = -1;

void enqueue();
void dequeue();
void display();

void main()
{
  int ch;
  printf("\n\t----------Queue Using Array Practice-----------")
  while(1)
  {
    printf("\n\t1.Enqueue\t2.Dequeue\t3.Display\t4.Exit");
    switch (ch)
    {
      case 1: enqueue(); break;
      case 2: dequeue(); break;
      case 3: display(); break;
      case 4: exit(0); break;
      default: printf("\n\tEnter Choice From the Given Options\n\t1.Enqueue\n\t2.Dequeue\n\t3.Display\n\t4.Exit"); break;
    }
  }
}

void enqueue()
{
  int val;
  printf("\n\tEnter the data to enqueue:");
}

void dequeue()
{

}

void display()
{
  if(front == -1 && rear == -1)
  {
    printf("\n\tQueue is Empty....!");
  }
  else
  {
    int i;
    i = front;
    while(i<rear)
    {
      printf("%d\t",queue[i]);
      i++;
    }
  }
}
