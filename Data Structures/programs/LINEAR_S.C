#include<stdio.h>
#include<conio.h>
void main()
{
	int data[10],se,n,i,flag=0;
	clrscr();
	printf("\n Enter the no of elements in array:");
	scanf("%d",&n);

	// Take n elements and store into array
	i=0;
	while(i<n)
	{
		printf("\n Enter Element[%d]:",i);
		scanf("%d",&data[i]);
		i++;
	}
	printf("\n Data stored");
	printf("\n\t Enter Element to Search:");
	scanf("%d",&se);
	for(i=0;i<n;i++)
	{
		if(se==data[i])
		{
			flag=1;
			break;
		}
	}

	if(flag==0)
	{
		printf("\n Element not found in the array");
	}

	if(flag==1)
	{
		printf("\n %d element found at %d",se,i);
	}
	getch();

}







