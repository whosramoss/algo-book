public class ArrayOfProducts {

    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        for (int i = 0; i < products.length; i++) {
            products[i] = 1;
        }

        int product = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            products[i] = product;
            product *= array[i];
        }

        product = 1;
        for (int i = 0; i < array.length; i++) {
            products[i] *= product;
            product *= array[i];
        }

        return products;
    }

    public static void main(String[] args) {
        int[] result = arrayOfProducts(new int[] {5, 1, 4, 2});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
