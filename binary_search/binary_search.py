def binary_search(array, target):
  left = 0
  right = len(array) - 1
  while left <= right:
    mid = (right + left) // 2
    potential_match = array[mid]
    if target > potential_match:
      left = mid + 1
    elif target < potential_match:
      right = mid - 1
    elif target == potential_match:
      return mid
  return -1

print(binary_search([1, 2, 3, 4, 5, 6], 6))
