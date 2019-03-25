package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] parsed = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parsed.length; i++) {
            String string = parsed[i];
            if (VowelUtils.startsWithVowel(string)) {
                sb.append(string).append("way");
            }
            else {
                if (VowelUtils.hasVowels(string)){
                    Integer firstVowel = VowelUtils.getIndexOfFirstVowel(string);
                    sb.append(string.substring(firstVowel)).append(string.substring(0, firstVowel)).append("ay");
                }
                else {
                    sb.append(string).append("ay");
                }
            }
            if (i != parsed.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}
