package fr.reference.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class NewCalculatorTest {
    Calculator calculator;
    BigDecimal val1 = BigDecimal.valueOf(12);
    BigDecimal val2 = BigDecimal.valueOf(20);
    BigDecimal val3 = BigDecimal.valueOf(30);
    @Before
    public void init()
    {
        calculator = new Calculator();

        calculator.setAccumulator(val1);
        calculator.enter();
        calculator.setAccumulator(val2);
        calculator.enter();
        calculator.setAccumulator(val3);
    }

    @Test
    public void testAccumulatorAfterPushTreeValues()
    {
        Assert.assertEquals(val3,calculator.getAccumulator());
    }
    @Test
    public void testAccumulatorAfterDropOnes()
    {
        calculator.drop();
        Assert.assertEquals(val2,calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterDropingTwice()
    {
        calculator.drop();
        calculator.drop();
        Assert.assertEquals(val1,calculator.getAccumulator());

    }
}
