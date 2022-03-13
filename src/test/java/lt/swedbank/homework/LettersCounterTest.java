package lt.swedbank.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LettersCounterTest {

    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("After all");
    }

    @Test
    public void testLetterCounting() {
        LettersCounter counter = new LettersCounter();
        int occurrences = counter.countCharacter('a', "Lithuania");

        Assertions.assertEquals(2, occurrences);
        Assertions.assertNotEquals(1, occurrences);
    }
}
