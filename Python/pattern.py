


#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a,int b,int c,int d)
{
    int temp = 0;
    if (a > b)
    {
        if (a > c)
        {
           if (a > d)
           {
               temp = a;
           }
        }
    }
    else if (b > c)
    {
        if (b > d)
        {
            temp = b;
        }
    }
    else if (b < c)
    {
        if (c > d)
        {
            temp = c;
        }
        else
        {
            temp = d;
        }
    }
    return temp;
}
int main()
{
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);

    return 0;
}
