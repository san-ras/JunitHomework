package lt.swedbank.homework;

import org.junit.jupiter.api.*;

public class LettersCounterTest {

    private LettersCounter lettersCounter;

    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void initCounter() {
        lettersCounter = new LettersCounter();
    }

    @AfterAll
    public static void teardown() {
        System.out.println("After all");
    }

/*    @Test
    public void testLetterCounting() {
        int occurrences = lettersCounter.countCharacter('a', "Lithuania");

        Assertions.assertEquals(2, occurrences);
        Assertions.assertNotEquals(1, occurrences);
    }*/

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
