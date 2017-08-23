#include<stdio.h>
int main(){
	int i,j,*k,*l,*m;
	int a[4][6];
	for(i=0;i<4;i++){
		for(j=0;j<6;j++)
			scanf("%d",&a[i][j]);	
	}
	for(i=0;i<4;i++){
		for(j=0;j<6;j++)
			printf("%d ",a[i][j]);
		printf("\n");	
	}
	printf("ilands are:");
	for(i=0;i<4;i++){
		k=*(a+i);
		l=*(a+i);
		m=*(a+i)+5;
		for(j=0;j<6;j++){
			if(*(*(a+i)+j)==1&&k!=*a&&k!=*(a+3)&&l!=*(a+i)+j&&m!=*(a+i)+j){
				if(*(*(a+(i-1))+j)==0&&*(*(a+(i+1))+j)==0&&*(*(a+(i))+(j-1))==0&&*(*(a+(i))+(j+1))==0)
					printf("a[%d][%d]\n",i+1,j+1);			
			}
		}	
	}
	return 0;
}
