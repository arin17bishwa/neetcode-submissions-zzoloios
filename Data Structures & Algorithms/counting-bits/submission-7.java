    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];

            if (n == 0)
                return ans;

            int highestPower = 1;

            for (int i = 1; i <= n; i++) {
                if ((highestPower << 1) <= i)
                    highestPower <<= 1;
                ans[i] = ans[i - highestPower] + 1;
            }
            return ans;
        }

    }
