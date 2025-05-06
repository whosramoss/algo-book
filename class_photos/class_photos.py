def class_photos(red_shirt_heights, blue_shirt_heights):
  red_shirt_heights.sort(reverse=True)
  blue_shirt_heights.sort(reverse=True)

  first_row_color = "BLUE" if blue_shirt_heights[0] < red_shirt_heights[0] else "RED"

  for idx, red_Shirt_height in enumerate(red_shirt_heights):
    blue_shirt_height = blue_shirt_heights[idx]
    if first_row_color == "RED":
      if red_Shirt_height >= blue_shirt_height:
        return False
    if first_row_color == "BLUE":
      if red_Shirt_height <= blue_shirt_height:
        return False

  return True

red_shirt_heights = [5, 8, 1, 3, 4]
blue_shirt_heights = [6, 9, 2, 4, 5]
print(class_photos(red_shirt_heights, blue_shirt_heights))