package com.andreasekman;

public class Language {
    public static int vowelCount(String s) {

        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        else {
            int count = 0;
            String input = s.toLowerCase();

            for (char c : input.toCharArray()) {
                if (isVowel(c)) {
                    count++;
                }
            }
            return count;
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'u' || c == 'o' || c == 'e' || c == 'i';
    }
}