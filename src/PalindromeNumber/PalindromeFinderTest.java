package PalindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PalindromeFinderTest {
    private final PalindromeFinder finder = new PalindromeFinder();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int input, boolean expected) {
        boolean result = finder.isPalindrome(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        121, true
                ),
                Arguments.of(
                        -121, false
                ),
                Arguments.of(
                        10, false
                )
        );
    }
}
