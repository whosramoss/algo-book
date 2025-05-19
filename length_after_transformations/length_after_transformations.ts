class Solution {
  lengthAfterTransformations(s: string, t: number): number {
    const MOD = 1_000_000_007;
    let count = new Array(26).fill(0);
    for (let ch of s) {
      count[ch.charCodeAt(0) - 97]++;
    }

    for (let step = 0; step < t; step++) {
      const newCount = new Array(26).fill(0);
      for (let i = 0; i < 26; i++) {
        if (i === 25) {
          newCount[0] = (newCount[0] + count[i]) % MOD;
          newCount[1] = (newCount[1] + count[i]) % MOD;
        } else {
          newCount[i + 1] = (newCount[i + 1] + count[i]) % MOD;
        }
      }
      count = newCount;
    }

    return count.reduce((acc, val) => (acc + val) % MOD, 0);
  }
}

const s = new Solution();
console.log(s.lengthAfterTransformations("abcyy", 2)); // 7
console.log(s.lengthAfterTransformations("azbk", 1));  // 5
