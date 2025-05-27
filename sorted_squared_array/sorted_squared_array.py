# O(n log(n)) time O(n) space
def sorted_squared_array(array):
  squared_array = []

  for value in array:
    squared_array = squared_array + [value ** 2]

  squared_array.sort()
  return squared_array

print(sorted_squared_array([-2, -1, 1, 2, 3]))
