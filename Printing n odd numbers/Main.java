#include <stdio.h>
void main()
{
   
	int i,n,j;
	j=1;
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		printf("%d\n",j);
        j+=2;
	}
	
	return 0;
}