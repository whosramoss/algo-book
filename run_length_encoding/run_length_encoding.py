def run_length_encoding(string):
  current_run_length = 1
  encoded_string_characteres = []
  for i in range(1, len(string)):
    previous_character = string[i - 1]
    current_character = string[i]
    if current_character != previous_character or current_run_length == 9:
      encoded_string_characteres.append(str(current_run_length))
      encoded_string_characteres.append(previous_character)
      current_run_length = 0
    current_run_length += 1
  encoded_string_characteres.append(str(current_run_length))
  encoded_string_characteres.append(string[len(string) - 1])
  return "".join(encoded_string_characteres)


print(run_length_encoding("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"))