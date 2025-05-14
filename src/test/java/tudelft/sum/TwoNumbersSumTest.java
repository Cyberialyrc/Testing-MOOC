package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TwoNumbersSumTest {

    @Test
    public void testSameSizeNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 6));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testSameSizeWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5, 7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(6, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 2));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testDifferentSizeNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testDifferentSizeWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testSingleDigitCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 8));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testZeroAddition() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        assertEquals(expected, sum.addTwoNumbers(first, second));
    }
}
