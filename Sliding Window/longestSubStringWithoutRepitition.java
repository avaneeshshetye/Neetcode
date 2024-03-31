import java.util.HashSet;

class longestSubStringWithoutRepition {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                // If the character is already in the set, it means it's a repeated character,
                // so we need to update the length and the set to remove characters until no repeats.
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(i - length)); // Remove characters from the beginning of the substring
                    length--;
                }
            }

            // Add the current character to the set and update the length
            set.add(s.charAt(i));
            length++;

            // Update the maxLength
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
