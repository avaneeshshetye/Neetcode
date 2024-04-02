import java.util.HashMap;
import java.util.Map;

class minimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) return "";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0, count = map.size();
        int left = 0, right = s.length() - 1, min = s.length(); // Initialize min to maximum possible length

        boolean found = false;

        while (j < s.length()) {
            char endChar = s.charAt(j++);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) count--;
            }
            if (count > 0) continue;

            while (count == 0) {
                char startChar = s.charAt(i++);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1) count++;
                }
            }
            if ((j - i) < min) {
                left = i - 1;
                right = j;
                min = j - i; // Update min with the length of the current window
                found = true;
            }

        }
        return !found ? "" : s.substring(left, right); // Adjusted substring indices
    }
}
