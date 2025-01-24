#include <stdio.h>

int main() {
	int n,j,i,temp;
	printf("Enter the number of elemnets:");
	scanf("%d" , &n);
	
	int arr[n];
	printf("Enter %d intergers: \n", n);
	
	for(i = 0; i<n; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	for (i = 0; i<n; i++){
		for(j=0; j<n-1; j++){
			if (arr[j]> arr[j+1]){
				temp = arr[j];
				arr[j]=arr [j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	printf("Element in the sorted array :\n");
	for( i =0;i<n;i++){
		printf("%d",arr[i]);
	}
	printf("\n");
	
	return 0;
}

	


 
	




