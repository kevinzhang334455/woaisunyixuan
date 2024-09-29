import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int leftMost = 0;
        int result = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!hashMap.containsKey(curr)) {
                hashMap.put(curr, i);
            } else {
                result = Math.max(result, i - leftMost);
                leftMost = Math.max(leftMost, hashMap.get(curr) + 1);
                hashMap.put(curr, i);
            }
        }

        result = Math.max(result, s.length() - leftMost);
        return result;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));

        // this is why we need to exclude the second duplicate but to include first one, because
        // 1) get the result from including the first one 2) leftmost can be minimum.
        System.out.println(solution.lengthOfLongestSubstring("cdd"));
    }
}
