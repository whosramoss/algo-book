def is_monotonic(array): 
  non_increasing = True
  non_decreasing = True

  for i in range(1, len(array)):
    if non_increasing and array[i - 1] < array[i]:
      non_increasing = False
    elif non_decreasing and array[i - 1] > array[i]:
      non_decreasing = False

  return non_increasing or non_decreasing

print(is_monotonic([1, 2, 3, 4, 5]))  # True
print(is_monotonic([5, 5, 5, 4, 3, 2, 1]))  # True
print(is_monotonic([5, 4, 6, 7, 3]))  # False
