package fr.reference.it;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

    private Stack<BigDecimal> values = new Stack<BigDecimal>();

    public BigDecimal peek()
    {
        if(values.isEmpty())
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void push(BigDecimal valueOf) {
        values.push(valueOf);
    }

    public void replaceTOP(BigDecimal valueOf) {
        if(!values.empty()){
            values.pop();
        }
        values.push(valueOf);
    }
    public void pop()
    {
        if(!values.empty()){
            values.pop();
        }
    }
}
