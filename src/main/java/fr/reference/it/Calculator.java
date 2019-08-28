package fr.reference.it;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {

    private OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {
        return values.peek();
    }

    public void setAccumulator(BigDecimal valueOf) {

        values.replaceTOP(valueOf);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }
}
