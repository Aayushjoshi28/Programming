//Average weight for a population of elephant seals read into a array
#include<stdio.h>

int main(void)
{
  int i,n,weight[n],sum = 0;
  float average;
  printf("Enter the population of elephant seals: ");
  scanf("%d",&n);
  printf("\n Enter the weight of elephant seals: ");
  for(i = 0;i < n; i++)
  {
    scanf("%d",&weight[i]);
  }
  for(i = 0;i < n; i++)
  {
    sum += weight[i];
  }
  average = sum/n;
  printf("\n Average weight is %d",average);
  return 0;
}
