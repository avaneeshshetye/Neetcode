import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        int maxCount = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            charCount.put(currChar, charCount.getOrDefault(currChar, 0) + 1);
            maxCount = Math.max(maxCount, charCount.get(currChar));

            // Check if the number of replacements needed for the current window exceeds k
            // If so, shrink the window from the start
            if (i - start + 1 - maxCount > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
