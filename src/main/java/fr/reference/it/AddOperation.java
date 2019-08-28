package fr.reference.it;

import java.math.BigDecimal;

public class AddOperation implements Operation {

    public void apply(OperandStack values) {
        BigDecimal val1 = values.peek();
        values.pop();

        BigDecimal val2 = values.peek();
        values.replaceTOP(val1.add(val2));
    }
}
