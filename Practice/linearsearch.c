#include<stdio.h>
void input(int a[], int n)
int linear_search(int a[],int n,int key)

int main()
{
  int a,n,i,key;
  printf("Enter the size:\n");
  scanf("%d",&n);
  input(a,n);
  pos = linear_search(a,n,key);
  if(pos == -1)
  {
    printf("unsuccessfull story");
  }
  else
  {
    printf("Element found at %d",pos);
  }
  return 0;
}

void input(int a[], int n)
{
  int i;

  printf("Enter Elements \n");
  for(i=o;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
}

int linear_search(int a[],int n,int key)
{
  int i;
  for(i=0;i<n;i++)
  {
    if(key==a[i])
    {
      return i;
    }
  }
  return -1;
}
