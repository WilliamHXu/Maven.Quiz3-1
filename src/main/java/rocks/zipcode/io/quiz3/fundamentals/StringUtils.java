package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String start = str.substring(0, indexToCapitalize);
        String character = str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase();
        String end = str.substring(indexToCapitalize + 1);
        return start + character + end;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (characterToCheckFor.equals(baseString.charAt(indexOfString))) return true;
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        LinkedHashSet<String> substrings = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));
            }
        }
        return substrings.toArray(new String[1]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
