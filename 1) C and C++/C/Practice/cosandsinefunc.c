#include <stdio.h>
#define n 20    // Number of iterations of each series

int main() {

    double x;           // Angle value
    double sum;         // Sum of the series
    double fact;   // Factorial from the denominator of the series' formula
    double pow;       // Angle value raised to the nth power

    // Enter the angle in degrees
    printf("Enter the angle in degrees: ");
    scanf("%lf", &x);
    // checking the condition for value of x
    if (x>0 && x<1)
    {
    // Convert the angle value to radians
    x = (3.1415926535897931*x)/180.0;
    printf("\n\nAngle in radians: %f\n\n", x);

    // Calculate sin(x) with its Taylor series
    sum = 0.0;
    for(int i = 0; i <= n; i++) {
        fact = 1.0;
        pow = 1.0;
        for(int j = 1; j <= 2*i+1; j++) {
            fact *= j;
            pow *= x;
        }
        sum += ((i%2?-1.0:1.0)/fact)*pow;
    }
    printf("sin(%f) = %f\n\n", x, sum);

    // Calculate cos(x) with its Taylor series
    sum = 0.0;
    for(int i = 0; i <= n; i++) {
        fact = 1.0;
        pow = 1.0;
        for(int j = 1; j <= 2*i; j++) {
            fact *= j;
            pow *= x;
        }
        sum += ((i%2?-1.0:1.0)/fact)*pow;
    }
    printf("cos(%f) = %f\n\n", x, sum);
    }
    else
    {
      printf("wrong input");
    }
    return 0;
}
