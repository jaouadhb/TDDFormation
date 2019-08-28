package fr.reference.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class OperandStackTest {

    OperandStack operandStack;
    @Before
    public void init()
    {
        operandStack = new OperandStack();
    }
    @Test
    public void testNewOperandStackPeekReturnZero()
    {
        Assert.assertEquals(BigDecimal.ZERO,operandStack.peek());
    }

    @Test
    public void pushNewValueToTheStack()
    {
        operandStack.push(BigDecimal.valueOf(12));
        Assert.assertEquals(BigDecimal.valueOf(12),operandStack.peek());
    }
    @Test
    public void replaceValueOnTOP()
    {
        operandStack.replaceTOP(BigDecimal.valueOf(15));
        Assert.assertEquals(BigDecimal.valueOf(15),operandStack.peek());
    }
}
