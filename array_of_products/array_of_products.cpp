#include <iostream>
#include <vector>

std::vector<int> arrayOfProducts(const std::vector<int>& array) {
    int length = array.size();
    std::vector<int> products(length, 1);

    int product = 1;

    for (int i = length - 1; i >= 0; --i) {
        products[i] = product;
        product *= array[i];
    }

    product = 1;
    for (int i = 0; i < length; ++i) {
        products[i] *= product;
        product *= array[i];
    }

    return products;
}

int main() {
    std::vector<int> input = {5, 1, 4, 2};
    std::vector<int> result = arrayOfProducts(input);

    for (int val : result) {
        std::cout << val << " ";
    }
    std::cout << std::endl;

    return 0;
}
