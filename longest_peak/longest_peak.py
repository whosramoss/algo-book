def longest_peak(array):
  i = 1
  longest_peak_length = 0
  while i < len(array) - 1:
    is_peak = array[i] > array[i - 1] and array[i] > array[i + 1]
    if not is_peak:
      i += 1
      continue
    left = i - 2
    while left >= 0 and array[left + 1] > array[left]:
      left -= 1
    right = i + 2
    while right < len(array) and array[right -  1] > array[right]:
      right += 1
    current_peak_length = right - left - 1
    longest_peak_length = max(longest_peak_length, current_peak_length)
    i = right
  return longest_peak_length


print(longest_peak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3])) # expect 6

