# Best O(n^2) time | O(1) space
# Avarage O(n^2) time | O(1) space
# Worst O(n^2) time | O(1) space
def selection_sort(array):
  for i in range(len(array)):
    j = i
    smallest_number_idx = i
    while j < len(array):
      if array[smallest_number_idx] > array[j]:
        smallest_number_idx = j
      j += 1
    swap(smallest_number_idx, i, array)
  return array


def swap(i, j, array):
  array[i], array[j] = array[j], array[i]

print(selection_sort([10, 9, 8, 7]))
