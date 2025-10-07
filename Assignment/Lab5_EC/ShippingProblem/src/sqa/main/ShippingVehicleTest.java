package sqa.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShippingVehicleTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> shippingTestCases() {
        return Stream.of(
        		// Valid boundaries
                arguments(0, 0, 0, Arrays.asList(0, 0, 0)),
                arguments(1, 0, 0, Arrays.asList(0, 0, 1)),
                arguments(499, 0, 0, Arrays.asList(0, 0, 499)),
                arguments(500, 0, 0, Arrays.asList(0, 0, 500)),
                arguments(0, 1, 0, Arrays.asList(0, 1, 0)),
                arguments(0, 199, 0, Arrays.asList(0, 199, 0)),
                arguments(0, 200, 0, Arrays.asList(0, 200, 0)),
                arguments(0, 0, 1, Arrays.asList(1, 0, 0)),
                arguments(0, 0, 99, Arrays.asList(99, 0, 0)),
                arguments(0, 0, 100, Arrays.asList(100, 0, 0)),
                // Invalid boundaries
                
                arguments(501, 0, 0, Arrays.asList(-1)),
                arguments(0, 201, 0, Arrays.asList(-1)),
                arguments(0, 0, 101, Arrays.asList(-1)),
                
                // Combinations at boundaries
                arguments(500, 200, 100, Arrays.asList(-1)), // All max, sum over
                arguments(499, 199, 99, Arrays.asList(-1)), // All just under max
                arguments(1, 1, 1, Arrays.asList(1, 1, 1)), // All just above min
                arguments(0, 200, 100, Arrays.asList(-1)), // Medium and Large at max, sum over
                arguments(500, 0, 100, Arrays.asList(-1)), // Small and Large at max, sum over
                arguments(500, 200, 0, Arrays.asList(-1)), // Small and Medium at max, sum over
                arguments(0, 199, 100, Arrays.asList(-1)), // Medium just under, Large at max
                arguments(499, 200, 0, Arrays.asList(-1)), // Small just under, Medium at max, sum over
                arguments(500, 199, 0, Arrays.asList(-1)), // Small at max, Medium just under, sum over
                arguments(0, 0, 100, Arrays.asList(100, 0, 0)), // Large at max
                arguments(0, 200, 0, Arrays.asList(0, 200, 0)), // Medium at max
                arguments(500, 0, 0, Arrays.asList(0, 0, 500)), // Small at max
                // Invalid combinations                          
                arguments(300, 100, 30, Arrays.asList(-1)), // All below min
                arguments(501, 201, 101, Arrays.asList(-1)) // All above max
        );
    }

    @ParameterizedTest
    @MethodSource("shippingTestCases")
    void testCalculate(int smallSize, int mediumSize, int largeSize, List<Integer> expected) {
        ShippingVehicle vehicle = new ShippingVehicle();
        List<Integer> result = vehicle.calculate(smallSize, mediumSize, largeSize);
        assertEquals(expected, result);
    }
}
