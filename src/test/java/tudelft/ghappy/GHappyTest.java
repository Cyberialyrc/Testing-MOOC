package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource({
            "'xxggxx', true",
            "'xxgxx', false",
            "'xxggyygxx', false",
            "'gg', true",
            "'g', false",
            "'', true",
            "'gggg', true",
            "'ggxgg', true",
            "'ggxg', false"
    })
    public void testGHappy(String input, boolean expected) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expected, result);
    }

}
