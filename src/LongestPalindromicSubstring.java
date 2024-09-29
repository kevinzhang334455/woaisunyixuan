public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = s.length();
        String result = "";
        int currMaxLen = 0;
        int[][] dp = new int[length][length + 1];
        for (int i = 0; i < length; i++) {
            dp[i][0] = 1;
        }

        for (int l = 1; l <= length; l++) {
            for (int i = 0; i + l - 1 < length; i++) {
                if (l == 1) {
                    dp[i][l] = 1;
                } else if (s.charAt(i) == s.charAt(i + l - 1) && dp[i + 1][l - 2] == 1) {
                    dp[i][l] = 1;
                }

                if (dp[i][l] == 1 && l > currMaxLen) {
                    currMaxLen = l;
                    result = s.substring(i, i + l);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("babab"));
        System.out.println(solution.longestPalindrome("cbabababqwerrt"));
    }
}
