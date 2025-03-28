package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({
            "'abc', 3, 'def'",
            "'xyz', 3, 'abc'",
            "'hello world', 5, 'mjqqt btwqi'",
            "'abc', -3, 'xyz'",
            "'xyz', -3, 'uvw'",
            "'a b c', 1, 'b c d'",
            "'123', 2, 'invalid'",
            "'HELLO', 4, 'invalid'",
            "'', 2, ''"
    })
    public void testCaesarShiftCipher(String message, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}
