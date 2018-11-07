#include <stdio.h> 
main()
{		
	int x, contd, contf, num;
	
	

	for(x=1; x<10; x++){
		
		printf("Digite os numeros :");
		scanf("%d", &num);
		
		if (num >= 10 and num <= 20){
		 
		 contd = contd +1;
		 
		}
		
		else
		{
		  
 		contf = contf +1;
				
		 	
		}
		
			
	}
	 	printf("\n%d Fora do intervalo", contf);
		printf("\n%d No intervalo de 10,20 ", contd);
}
