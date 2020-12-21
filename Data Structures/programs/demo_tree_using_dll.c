#include<stdio.h>
#include<stdlib.h>

typedef struct tnode
{
	struct tnode *left;
	int data;
	struct tnode *right;
}tnode;

void main()
{
	tnode *R; // Root node ( level 0)
	tnode *p;  // Child node (Level 1)
	tnode *q; // child node (level 2)

	// create root node
	R=(tnode *)malloc(sizeof(tnode));
	R->left=NULL;
	R->right=NULL;
	R->data='A';

	// create B as a left child for A node
	p=(tnode *)malloc(sizeof(tnode));
	p->left=NULL;
	p->right=NULL;
	p->data='B';
	R->left=p;

	// create C as a right child for A node
	p=(tnode *)malloc(sizeof(tnode));
	p->left=NULL;
	p->right=NULL;
	p->data='C';
	R->right=p;

	// create D as a left child for C node
	q=(tnode *)malloc(sizeof(tnode));
	q->left=NULL;
	q->right=NULL;
	q->data='D';
	p->left=q;
}









