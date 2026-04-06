class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length())
                return false;

            var sArr = s.toCharArray();
            var tArr = t.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(tArr);
            return Arrays.equals(sArr, tArr);
    }
}
