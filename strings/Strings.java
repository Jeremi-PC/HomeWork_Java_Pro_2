package org.example.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Strings {

    private Strings() {

    }

    public static String generateWord(int lengthStringChars) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String string = "";
        char randomChar;
        for (int i = 0; i < lengthStringChars; i++) {
            int randomSymbolNum = random.nextInt(26);
            randomChar = (char) ('a' + randomSymbolNum);
            stringBuilder.append(randomChar);

        }
        System.out.println("String length " + lengthStringChars + " chars: " + stringBuilder);
        return stringBuilder.toString();
    }

    public static String generateNumeric(int lengthStringNumeric) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String string = "";
        for (int i = 0; i < lengthStringNumeric; i++) {
            int randomSymbolNum = random.nextInt(10);
            stringBuilder.append(randomSymbolNum);
        }
        System.out.println("String length " + lengthStringNumeric + " numerics: " + stringBuilder);
        return stringBuilder.toString();
    }


    public static String splitByFirst(String stringForSplit) {
        String[] stringOutput = stringForSplit.split("[^\\p{L}\\p{N}]+");
        //  String[] stringOutput = stringForSplit.split("[!\\s ]");
        System.out.println("Splited string: " + Arrays.toString(stringOutput));
        return stringOutput.toString();
    }

    public static boolean isNumeric(String stringForCheckForNumeric) {
        char[] chars = stringForCheckForNumeric.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                System.out.print("This string isn't Numeric");
                return false;
            }
        }
        System.out.print("This string is Numeric");
        return true;
    }
}

