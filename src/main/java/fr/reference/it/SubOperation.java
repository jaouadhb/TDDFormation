package fr.reference.it;

import java.math.BigDecimal;

public class SubOperation implements Operation {

    public void apply(OperandStack values) {
        BigDecimal val1 = values.peek();
        values.pop();

        BigDecimal val2 = values.peek();
        values.replaceTOP(val1.subtract(val2));
    }
}
