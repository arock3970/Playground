#include <stdio.h>
int main()
{
    int n, i;
    unsigned long long factorial = 1;


    scanf("%d",&n);

   
    if (n < 0)
        printf("Error! Factorial of a negative number doesn't exist.");

    else
    {
        for(i=1; i<=n; ++i)
        {
            factorial *= i;              // factorial = factorial*i;
        }
        printf("%llu",  factorial);
    }

    return 0;
}