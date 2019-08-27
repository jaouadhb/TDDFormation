package fr.reference.it;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {

    private Stack<BigDecimal> values = new Stack<BigDecimal>();

    public BigDecimal getAccumulator() {
        if(values.empty())
        {
            return BigDecimal.ZERO;
        }
        return values.peek();
    }

    public void setAccumulator(BigDecimal valueOf) {
        if(!values.empty()){
            values.pop();
        }
        values.push(valueOf);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }
}
