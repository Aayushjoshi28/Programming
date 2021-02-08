/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-01T14:10:23+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Binary_Search_tree.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-01T14:46:08+05:30
 */
#include<stdio.h>
#include<stdlib.h>
typedef struct tnode
{
  int data;
  struct tnode *left;
  struct tnode *right;
}tnode;

tnode *create();
void display_preorder(tnode *p);
void display_inorder(tnode *p);
void display_postorder(tnode *p);

void main()
{
  printf("\n\tBinary Search Tree Program By:\n\tAayush Joshi\n\tSE-4\n\tRoll No-14\n");
  int value,choice;
  tnode *r;
  while(1)
  {
    printf("\n\t----------------------Binary Search Tree----------------------");
    printf("\n\t1.Create\t2.Display Preorder\t3.Display Inorder\t4.Display Postorder\t5.Exit");
    printf("\n\tEnter the choice:");
    scanf("%d",&choice);
    switch(choice)
    {
      case 1: r = create();
              printf("\n\t Root node at: %u",r);
              break;
      case 2: display_preorder(r);
              break;
      case 3: display_inorder(r);
              break;
      case 4: display_postorder(r);
              break;
      case 5: exit(0);
              break;
      default: printf("\n\t Invalid choice");
    }
  }
}

tnode *create()
{
  tnode *p;
  int x;
  printf("\n\t Enter Data(-1 for node with no data):");
  scanf("%d",&x);
  if(x==-1)
  {
    return  NULL;
  }
  p = (tnode*)malloc(sizeof(tnode));
  p->data = x;
  printf("\n\t Enter Left Child of %d",x);
  p->left = create();
  printf("\n\t Enter Right Child of %d",x);
  p->right = create();
  return p;
}

void display_preorder(tnode *p)
{
  if(p!=NULL)
  {
    printf("\t %d",p->data);
    display_preorder(p->left);
    display_preorder(p->right);
  }
}
void display_inorder(tnode *p)
{
  display_inorder(p->left);
  printf("\t %d",p->data);
  display_inorder(p->right);
}
void display_postorder(tnode *p)
{
  if(p!=NULL)
  {
    display_postorder(p->left);
    display_postorder(p->right);
    printf("\t %d",p->data);
  }
}
