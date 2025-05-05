def caesar_cipher_encryptor(string, key):
  new_letters = []
  alphabet = list('abcdefghijklmnopqrstuvwxyz')
  new_key = key % 26
  for letter in string:
    new_letter = get_new_letter(new_key, letter, alphabet)
    new_letters.append(new_letter)
  return "".join(new_letters)

def get_new_letter(key, letter, alphabet):
  new_key = alphabet.index(letter) + key
  return alphabet[new_key % 26]

print(caesar_cipher_encryptor('xyz', 2))