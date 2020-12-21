#include<stdio.h>

void main()
{
	int i, low, high,n, mid, se, data[10];
	clrscr();
	printf("\n Enter Size of Array:");           // accept siez from user
	scanf("%d",&n);
	printf("\n Enter %d elements:",n);      // take array from user
	for(i=0;i<n;i++)
	{
		printf("\n Enter Element[%d]:",i);
		scanf("%d",&data[i]);
	}
	printf("\n Array stored successfully...");
	getch();
	printf("\n Enter Element to Search:");   // take SE from user
	scanf("%d",&se);

	// Binary search starts here
	low=0;
	high=n-1;
	mid=(low+high)/2;

	while(low<=high)
	{
		if(se<data[mid])
		{
			high=mid-1;
		}
		else if(se>data[mid])
		{
			low=mid+1;
		}
		else
		{
			printf("\n %d is found at %d",se,mid);
			break;
		}
		mid=(low+high)/2;
	}
	if(low>high)
	{
		printf("\n Element not found in array");
	}
	getch();
}






