public class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int step = 0; step < t; step++) {
            int[] newCount = new int[26];
            for (int i = 0; i < 26; i++) {
                if (i == 25) {
                    newCount[0] = (newCount[0] + count[i]) % MOD;
                    newCount[1] = (newCount[1] + count[i]) % MOD;
                } else {
                    newCount[i + 1] = (newCount[i + 1] + count[i]) % MOD;
                }
            }
            count = newCount;
        }

        long sum = 0;
        for (int c : count) {
            sum = (sum + c) % MOD;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthAfterTransformations("abcyy", 2)); // 7
        System.out.println(s.lengthAfterTransformations("azbk", 1));  // 5
    }
}
