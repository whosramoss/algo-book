def move_element_to_end(array, to_move):
  left = 0
  right = len(array) - 1
  while left < right:
    while left < right and array[right] == to_move:
      right -= 1
    if array[left] == to_move:
      array[left], array[right] = array[right], array[left]
    left += 1
  return array

print(move_element_to_end([2,2,2,2,1,1,1,1], 2))