# O(n) time O(n) space
def spiral_traverse(array):
  output = []
  start_col = 0
  start_row = 0
  end_col = len(array[0]) - 1
  end_row = len(array) - 1

  while start_col <= end_col and start_row <= end_row:
    for col in range(start_col, end_col + 1):
      output.append(array[start_row][col])
    for row in range(start_row + 1, end_row + 1):
      output.append(array[row][end_col])
    for col in reversed(range(start_col, end_col)):
      if start_row == end_row:
        break
      output.append(array[end_row][col])
    for row in reversed(range(start_row + 1, end_row)):
      if start_col == end_col:
        break
      output.append(array[row][start_col])
    start_col += 1
    end_col -= 1
    start_row += 1
    end_row -= 1

  return output

# expect [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(spiral_traverse([
  [1, 2, 3],
  [8, 9, 4],
  [7, 6, 5]
]))
