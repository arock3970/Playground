#include<stdio.h>
int main()
{
 int num,a,b;
  scanf("%d",&num);
  a=num/100;
  b=num%10;
  printf("%d",a+b);
  return 0;
}