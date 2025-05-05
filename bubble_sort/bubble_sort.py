# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space
def bubble_sort(array):
  is_sorted = False
  counter = 0
  while is_sorted is False:
    is_sorted = True
    for i in range(len(array) - 1 - counter):
      if array[i] > array[i + 1]:
        swap(i, i + 1, array)
        is_sorted = False
    counter += 1
  return array

def swap(i, j, array):
  array[i], array[j] = array[j], array[i]


print(bubble_sort([5, 1, 10, 20]))