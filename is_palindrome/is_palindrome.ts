function isPalindrome(str: string): boolean {
  let firstIdx = 0;
  let lastIdx = str.length - 1;
  while (firstIdx <= lastIdx) {
    if (str[firstIdx] !== str[lastIdx]) {
      return false;
    }
    firstIdx++;
    lastIdx--;
  }
  return true;
}

console.log(isPalindrome("aba"));
