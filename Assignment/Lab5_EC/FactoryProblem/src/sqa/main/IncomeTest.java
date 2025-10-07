package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IncomeTest {

    @ParameterizedTest
    @CsvSource({
        // Valid cases
        "1000, 300, 500, 16000",      // min all
        "5000, 800, 3000, 164000",    // max all
        "3000, 500, 2000, 91000",     // typical all
        "1001, 300, 500, 16010",      // impeller just above min
        "4999, 300, 500, 49990",      // impeller just below max
        "1000, 301, 500, 16030",      // motor just above min
        "1000, 799, 500, 24770",      // motor just below max
        "1000, 300, 501, 16020",      // cover just above min
        "1000, 300, 2999, 78980",     // cover just below max
        "5000, 300, 500, 66500",      // impeller max, others min
        "1000, 800, 500, 33000",      // motor max, others min
        "1000, 300, 3000, 61000",     // cover max, others min

        // Invalid cases: impeller
        "999, 300, 500, INVALID",     // impeller below min
        "5001, 300, 500, INVALID",    // impeller above max
        "0, 300, 500, INVALID",       // impeller zero
        "-1, 300, 500, INVALID",      // impeller negative

        // Invalid cases: motor
        "1000, 299, 500, INVALID",    // motor below min
        "1000, 801, 500, INVALID",    // motor above max
        "1000, 0, 500, INVALID",      // motor zero
        "1000, -1, 500, INVALID",     // motor negative

        // Invalid cases: cover
        "1000, 300, 499, INVALID",    // cover below min
        "1000, 300, 3001, INVALID",   // cover above max
        "1000, 300, 0, INVALID",      // cover zero
        "1000, 300, -1, INVALID",     // cover negative

        // Multiple invalids
        "999, 299, 499, INVALID",     // all below min
        "5001, 801, 3001, INVALID",   // all above max
        "0, 0, 0, INVALID"           // all zero
    })
    void testCalculateIncome(int num_impeller, int num_motor, int num_cover, String expectedResult) {
        Income income = new Income();
        Double result = income.calculateIncome(num_impeller, num_motor, num_cover);

        if ("INVALID".equals(expectedResult)) {
            assertEquals(-1.0, result);
        } else {
            assertEquals(Double.parseDouble(expectedResult), result);
        }
    }
}
