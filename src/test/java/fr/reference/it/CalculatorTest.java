package fr.reference.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void init()
    {
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorAccumulatorOfZero(){
        Assert.assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
    }
    @Test
    public void testSetAccumulatorValue()
    {
        calculator.setAccumulator(BigDecimal.valueOf(12));
        Assert.assertEquals(BigDecimal.valueOf(12),calculator.getAccumulator());
    }


}
