function firstNonRepeatingCharacter(str: string): number {
  const characters: { [key: string]: boolean } = {};
  for (const c of str) {
      characters[c] = characters[c] === undefined;
  }
  for (let i = 0; i < str.length; i++) {
    if (characters[str[i]]) {
      return i;
    }
  }
  return -1;
}

console.log(firstNonRepeatingCharacter("abcdcaf"));
