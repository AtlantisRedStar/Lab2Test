package com.example.lab2;

public class WordCharacterCounter {

    public static int getCount(String inputText, String selectedOption) {
        if (selectedOption.equals("Words")) {
            return countWords(inputText);
        } else if (selectedOption.equals("Characters")) {
            return countCharacters(inputText);
        } else if (selectedOption.equals("Numbers")) {
            return countNumbers(inputText);
        }
        return 0;
    }

    private static int countWords(String inputText) {
        String[] words = inputText.trim().split("[\\s,\\.]+");
        return words.length;
    }

    private static int countCharacters(String inputText) {
        return inputText.length();
    }

    public static int countNumbers(String inputText) {
        int count = 0;
        for (char c : inputText.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static String changeChar(String inputString, char newChar, char oldChar) {
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }
        return new String(charArray);
    }
}