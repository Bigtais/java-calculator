package com.calculator.formula.constant;

import com.calculator.formula.Formula;

/**
 * Class representing a constant value (a number) in a formula.
 */
public class Constant implements Formula {
    private final long value;

    /**
     * Creates a constant value from the value in the parameters.
     * @param value The constant value.
     */
    public Constant(int value){
        this.value = value;
    }

    @Override
    public double evaluate(){
        return value;
    }
}
