# O(n^2) time | O(n) space where n is the length of the array
def three_number_sum(array, target):
  array.sort()
  triple_sums = []
  for i in range(len(array) - 2):
    left = i + 1
    right = len(array) - 1
    while left < right:
      current_sum = array[i] + array[left] + array[right]
      if current_sum == target:
        triple_sums.append([array[i], array[left], array[right]])
        left += 1
        right -= 1
      elif current_sum < target:
        left += 1
      else:
        right -= 1
  return triple_sums

print(three_number_sum([1, 2, 3, 4, 5, 6, -9, -10, 12], 12))
