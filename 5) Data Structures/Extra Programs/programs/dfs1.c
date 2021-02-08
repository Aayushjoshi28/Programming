#include<stdio.h>
void DFS(int);
int G[10][10],visited[10]={0},n;
void main()
{
	int i,j;
	printf("Enter number of vertices:");
	scanf("%d",&n);
	printf("\nEnteradjecency matrix of the graph:\n");
	for(i=0;i<n;i++) 
	{
		for(j=0;j<n;j++) 
			scanf("%d",&G[i][j]);
	}
	DFS(0);
}
void DFS(int i)  
{ 
	int j;
	printf("\n%d",i); 
	visited[i]=1; 
	for(j=0;j<n;j++) 
	if(visited[j]==0&&G[i][j]==1)
	DFS(j); 
}
