#include <stdio.h>
#include <stdlib.h>

void findmax(int x [], int n){
	int max = x[0];


	for(int i = 1; i < n; i++){
		if(x[i] > max)
			max = x[i];

	}
	printf("max is %d",max);
}

main(){
	int arr [] = {5,7,85,4,9};
	int size = (sizeof(arr) / sizeof(arr[0]));
	findmax(arr, size);
}
