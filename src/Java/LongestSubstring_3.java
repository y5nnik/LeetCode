package Java;

import java.util.*;

public class LongestSubstring_3 {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;

        Set<Character> hash = new HashSet<>();

        while (i < s.length()) {
            if (!hash.contains(s.charAt(i))) {
                hash.add(s.charAt(i++));
                max = Math.max(max, hash.size());
            }
            else {
                hash.remove(s.charAt(j++));
            }
        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}


/*
Given a string s, find the length of the longest
substring without repeating characters.
 */