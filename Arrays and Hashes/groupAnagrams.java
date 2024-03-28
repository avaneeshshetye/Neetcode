import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class groupAnagrams {
    public List<List<String>> group_Anagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String word = strs[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(word);
                anagrams.put(sortedWord, newList);
            }
        }
        return new ArrayList<>(anagrams.values());
    }
    
}