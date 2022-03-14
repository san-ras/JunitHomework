package lt.swedbank.homework;

public class LettersCounter {

/*    //pirmas metodas - be null reiksmes
    public int countCharacter(char character, String word) {
        int occurrences = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                occurrences++;
            }
        }
        return occurrences;
    }*/

    // antras metodas - pilnas
    public int countCharacters(char character, String text) {
        if (character == '\0' || text == null) {
            throw new IllegalArgumentException(String.format("Method input parameter character was = %s, text was = %s", character, text));
        }
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}