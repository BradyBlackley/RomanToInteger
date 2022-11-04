import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "DCCXXXIV,734",
            "DLXXVII,577",
            "CCCXVI,316",
            "CDLII,452",
            "DCCCXXXII,832",
            "CXXXIV,134",
            "DL,550",
            "DXCVI,596",
            "DLV,555",
            "CCCLXVIII,368"
    })
    void romanToInt(String input, Integer expected) {
        assertEquals(expected, solution.romanToInt(input));
    }
}