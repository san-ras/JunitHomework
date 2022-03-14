package lt.swedbank.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LettersCounterTest {

    private LettersCounter lettersCounter = new LettersCounter();

    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }


    @AfterAll
    public static void teardown() {
        System.out.println("After all");
    }

    @Test
    public void Should_ReturnCharacterCountTwo_When_TextIsPresent() {
        int occurrences = lettersCounter.countCharacters('a', "Lithuania");

        Assertions.assertEquals(2, occurrences);
        Assertions.assertNotEquals(1, occurrences);
    }

    @Test
    public void Should_ThrowIlleagalArgumentException_When_TextIsNull() {
        char character = 'd';
        String text = null;
        String expected = String.format("Method input parameter character was = %s, text was = %s", character, text);

        Throwable actual = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            lettersCounter.countCharacters(character, text);
        });

        Assertions.assertEquals(expected, actual.getMessage());
    }
}
