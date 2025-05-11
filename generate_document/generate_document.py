def generate_document(characters, document):
  characters_hash_map = {}
  for character in characters:
    if character in characters_hash_map:
      characters_hash_map[character] += 1
    else:
      characters_hash_map[character] = 1
  for character in document:
    if character not in characters_hash_map or characters_hash_map[character] == 0:
      return False
    characters_hash_map[character] -= 1
  return True

print(generate_document("abc", "cab"))
