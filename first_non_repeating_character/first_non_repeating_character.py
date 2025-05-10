def first_non_repeating_character(string):
  characters = {}
  for character in string:
    if character in characters:
      characters[character] = False
    else:
      characters[character] = True
  for idx, character in enumerate(string):
    if character in characters and characters[character] == True:
      return idx
  return -1

print(first_non_repeating_character("abcdcaf"))