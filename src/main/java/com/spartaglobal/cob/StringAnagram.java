package com.spartaglobal.cob;

public class StringAnagram {


    public static void checkStringAnagram(String anagram1, String anagram2) {
        if (anagram1.length() == anagram2.length()) {
            char[] a1 = anagram1.toLowerCase().toCharArray();
            char[] a2 = anagram2.toLowerCase().toCharArray();
            int matchCounter = 0;
            for (char c : a1) {
                for (char c1 : a2) {
                    if (c == c1) {
                        matchCounter++;
                    }
                }
            }

            if (matchCounter == anagram1.length()) {
                System.out.println(anagram1 + " is an anagram of " + anagram2);
            } else {
                System.out.println(anagram1 + " is not an anagram of " + anagram2);
            }
        } else {
            System.out.println(anagram1 + "is not an anagram of " + anagram2);
        }
    }
}
