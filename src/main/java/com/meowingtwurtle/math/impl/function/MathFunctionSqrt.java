package com.meowingtwurtle.math.impl.function;

import com.meowingtwurtle.math.api.IMathGroup;

import java.math.BigDecimal;

public class MathFunctionSqrt implements IMathFunction {

    private final BigDecimal value;

    public MathFunctionSqrt(BigDecimal value) {
        this.value = value;
    }

    public MathFunctionSqrt(IMathGroup value) {
        this.value = value.eval();
    }

    @Override
    public BigDecimal eval() {
        return BigDecimal.valueOf(Math.sqrt(value.doubleValue()));
    }

    public String toString() {
        return this.getClass().getSimpleName() + "(" + value + ")";
    }

}
