package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    public void whenCalcTotalCostIsZero_ThenReturnZero() {
        assertEquals(0, Main.calcTotal(0, 0.07));
    }

    /** Write another test for the same method
     *  That tests another scenario
     *  **/
    @Test
    public void whenCalcTotalTaxIsNegative_ThenReturnCostWithoutTax() {
        double cost = 25.78;
        assertEquals(cost, Main.calcTotal(cost, -0.07));
    }
}
