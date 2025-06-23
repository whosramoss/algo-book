fn array_of_products(array: &[i32]) -> Vec<i32> {
    let length = array.len();
    let mut products = vec![1; length];

    let mut product = 1;
    for i in (0..length).rev() {
        products[i] = product;
        product *= array[i];
    }

    product = 1;
    for i in 0..length {
        products[i] *= product;
        product *= array[i];
    }

    products
}

fn main() {
    let array = vec![5, 1, 4, 2];
    let result = array_of_products(&array);
    println!("{:?}", result);
}
