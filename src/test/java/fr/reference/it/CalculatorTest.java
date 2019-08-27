package fr.reference.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

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

    @Test
    public void testEnterAndDropAccumulator()
    {
        BigDecimal val1 = BigDecimal.valueOf(12);
        BigDecimal val2 = BigDecimal.valueOf(20);
        BigDecimal val3 = BigDecimal.valueOf(30);

        calculator.setAccumulator(val1);
        calculator.enter();
        calculator.setAccumulator(val2);
        calculator.enter();
        calculator.setAccumulator(val3);
        Assert.assertEquals(val3,calculator.getAccumulator());
        calculator.drop();
        Assert.assertEquals(val2,calculator.getAccumulator());
        calculator.drop();
        Assert.assertEquals(val1,calculator.getAccumulator());

    }
}
