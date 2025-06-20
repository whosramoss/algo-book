#include <stdio.h>
#include <stdlib.h>

int* arrayOfProducts(int* array, int length) {
    int* products = (int*)malloc(length * sizeof(int));

    for (int i = 0; i < length; i++) {
        products[i] = 1;
    }

    int product = 1;
    for (int i = length - 1; i >= 0; i--) {
        products[i] = product;
        product *= array[i];
    }

    product = 1;
    for (int i = 0; i < length; i++) {
        products[i] *= product;
        product *= array[i];
    }

    return products;
}

int main() {
    int array[] = {5, 1, 4, 2};
    int length = sizeof(array) / sizeof(array[0]);

    int* result = arrayOfProducts(array, length);

    for (int i = 0; i < length; i++) {
        printf("%d ", result[i]);
    }
    printf("\n");

    free(result);
    return 0;
}
