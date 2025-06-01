# O(n) time | O(n) space - Where n is the length of the input array
def array_of_products(array):
  products = [1 for _ in range(len(array))]
  product = 1
  for i in reversed(range(len(array))):
    products[i] = product
    product *= array[i]
  product = 1
  for i in range(len(array)):
    products[i] = product * products[i]
    product *= array[i]
  return products

print(array_of_products([5, 1, 4, 2]))
