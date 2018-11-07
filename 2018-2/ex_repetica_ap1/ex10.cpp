#include<stdio.h>
#include<conio.h>
main()
{
	int x=1,soma,y=1;
	while (y <=5)
	{
		while(x <= 10)
		{
			soma=y*x;
			printf("\n%d x %d = %d",y,x,soma);
			x++;	
		}
	x=1;
	y++;
	}
}
