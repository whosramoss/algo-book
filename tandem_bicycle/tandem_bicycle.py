def tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, fastest):
  if fastest == True:
    red_shirt_speeds.sort(reverse=True)
    blue_shirt_speeds.sort()
  else:
    red_shirt_speeds.sort()
    blue_shirt_speeds.sort()
  
  total = 0

  for idx in range(len(blue_shirt_speeds)):
    blue_speed = blue_shirt_speeds[idx]
    red_speed = red_shirt_speeds[idx]
    total += max(blue_speed, red_speed)

  return total

red_shirt_speeds = [5, 5, 3, 9, 2]
blue_shirt_speeds = [3, 6, 7, 2, 1]

print(tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, True))
print(tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, False))