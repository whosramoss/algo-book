# O(n) time O(1) space
def is_valid_subsequence(array, sequence):
  if len(sequence) > len(array):
    return False
  
  seq_index = 0

  for i in range(len(array)):
    if seq_index == len(sequence):
      break
    if array[i] == sequence[seq_index]:
      seq_index += 1

  return seq_index == len(sequence)

array = [5, 1, 22, 15, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
print(is_valid_subsequence(array, sequence))
