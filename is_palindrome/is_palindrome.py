def is_palindrome(string):
  first_letter_idx = 0
  last_letter_idx = len(string) - 1
  while first_letter_idx <= last_letter_idx:
    if string[first_letter_idx] != string[last_letter_idx]:
      return False
    first_letter_idx += 1
    last_letter_idx -= 1
  return True

print(is_palindrome('aba'))
