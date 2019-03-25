package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))) return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        if (hasVowels(word)) {
            for (int i = 0; i < word.length(); i++) {
                if(isVowel(word.charAt(i))) return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if(word.length() > 0) {
            return isVowel(word.charAt(0));
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (char c:
                vowels) {
            if(character.equals(c)) return true;
        }
        return false;
    }
}
