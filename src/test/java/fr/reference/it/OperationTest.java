package fr.reference.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class OperationTest {

    Calculator calculator;
    @Before
    public void init()
    {
        calculator = new Calculator();
        calculator.setAccumulator(BigDecimal.valueOf(10));
        calculator.enter();
        calculator.setAccumulator(BigDecimal.valueOf(15));
    }

    @Test
    public void testAdd()
    {
        calculator.add();
        Assert.assertEquals(BigDecimal.valueOf(25),calculator.getAccumulator());
    }

    @Test
    public void testSubtract()
    {
        calculator.subtruct();
        Assert.assertEquals(BigDecimal.valueOf(5),calculator.getAccumulator());
    }
}
