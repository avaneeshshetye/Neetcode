package Pointers;

public class palindrome {
    public boolean isPalindrome(String s) {
        String S = s.toLowerCase().replaceAll("[^a-z0-9]", "");
         StringBuffer sbf = new StringBuffer(S);
         sbf.reverse();
        return S.equals(sbf.toString()) ;

    }}

