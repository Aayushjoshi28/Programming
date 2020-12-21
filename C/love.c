/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-07-21T22:20:51+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: love.c
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-09-10T14:05:42+05:30
 */



// love u so much

#include<stdio.h>

void wrt_very(int count)
{
  while(count>0)
  {
    printf("\n Very");
    count--;
  };
  printf(" Much.\n\n");
}

int main(void)
{
  int repeat = 10;
  printf("How strong is your love 1-10 ? : ");
  scanf("%d",&repeat);
  printf("\n I Love You Very");
  wrt_very(repeat);
  return 0;
};
