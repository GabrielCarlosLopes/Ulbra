#include<stdio.h>
#include<conio.h>
main()
{
   int x, num;

   printf("Digite um numero: ");
   scanf("%d",&num);

   for (x = 1; x <= 10; ++x)
   {
       printf("%d X %d = %d\n",num, x, num * x);
   }
}
