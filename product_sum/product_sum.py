# O(n) time | O(d) space where n is the length of the array and d is the depth
def product_sum(array, depth = 1):
  sum = 0
  for item in array:
    if type(item) == list:
      sum += product_sum(item, depth + 1)
    else:
      sum += item
  return sum * depth

print(product_sum([1, [2, 1]]))