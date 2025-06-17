# O(n * m) time | O(1) space
def smallest_difference(array_one, array_two):
  closest_pair = [array_one[0] - array_two[0]]
  closest_to_zero = abs(array_one[0] - array_two[0])
  for i in range(len(array_one)):
    for j in range(len(array_two)):
      current_value = abs(array_one[i] - array_two[j])
      if current_value < closest_to_zero:
        closest_to_zero = current_value
        closest_pair = [array_one[i], array_two[j]]
  return closest_pair

print(smallest_difference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]))
