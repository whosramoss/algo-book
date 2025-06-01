function arrOfProducts(array: number[]): number[] {
    const products: number[] = new Array(array.length).fill(1);
    let product = 1;

    for (let i = array.length - 1; i >= 0; i--) {
        products[i] = product;
        product *= array[i];
    }

    product = 1;

    for (let i = 0; i < array.length; i++) {
        products[i] *= product;
        product *= array[i];
    }

    return products;
}

console.log(arrOfProducts([5, 1, 4, 2]));
