package lt.swedbank.homework;

public class LettersCounter {

    public int countCharacter(char character, String word) {
        int occurrences = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                occurrences++;
            }
        }
        return occurrences;
    }
}
