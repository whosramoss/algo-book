# Time complexity O(n^2) - Space complexity O(1)
def two_number_sum1(array, target_sum):
  for i in range(len(array)):
    for j in range(i, len(array)):
      if j != i:
        if (array[i] + array[j]) == target_sum:
          return [array[i], array[j]]
  return []

# Time complexity O(log(n)) - Space complexity O(1)
def two_number_sum2(array, target_number):
  array.sort()
  left = 0
  right = len(array) - 1
  while left < right:
    current_sum = array[left] + array[right]
    if current_sum > target_number:
      right -= 1
    elif current_sum < target_number:
      left += 1
    else:
      return [array[left], array[right]]
  return []

# Time complexity O(n) - Space complexity O(n)
def two_number_sum3(array, target_sum):
  hash_table = {}
  for i in range(len(array)):
    needed_number = target_sum - array[i]
    if hash_table.get(needed_number) != None:
      return [needed_number, array[i]]
    else:
      hash_table[array[i]] = array[i]
  return []

# Time complexity O(n^2) - Space complexity O(1)
def two_number_sum4(array, target_sum):
  for i in range(len(array)):
    needed_number = target_sum - array[i] # target_sum = needed_number + array[i]
    for j in range(i, len(array)):
      if i != j:
        if array[j] == needed_number:
          return [needed_number, array[i]]
  return []

print(two_number_sum1([1, 2, 3, 4], 5))
print(two_number_sum2([1, 2, 3, 4], 5))
print(two_number_sum3([1, 2, 3, 4], 3))
print(two_number_sum4([1, 2, 3, 4], 3))

