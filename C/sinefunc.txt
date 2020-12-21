/* Program to calculate sine of a value ranging from 0 to 1 (not inclusive) */
#include<stdio.h>
#include<conio.h>
#include<math.h>
int main(void)
{
  double value,sine;
  printf("Enter the value for finding sine:");
  scanf("%lf",&value);
  /* Checking the condition for value*/
  if (value>0 && value<1)
  {
    printf("The sine of the entered value is %lf \n",sine = sin(value));
  }
  else
  {
    printf("wrong input");
  }
  return 0;
}
