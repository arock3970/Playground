#include <stdio.h>
 
void main()
{
    long num, temp, digit, arr[10];
    int i=0;
 
    scanf("%ld", &num);
    temp = num;
    while (num > 0)
    {
        digit = num % 10;
        arr[i]=digit;
        i++;
        num /= 10;
    }
    printf("%ld",  arr[i-1]+arr[0]);
}