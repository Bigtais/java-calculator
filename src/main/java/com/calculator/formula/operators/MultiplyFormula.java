package com.calculator.formula.operators;

import com.calculator.formula.Formula;

/**
 * Formula representing the multiplication of a left side sub-formula and a right side sub-formula.
 */
public class MultiplyFormula implements Formula {
    private final Formula leftSide, rightSide;

    /**
     * Creates a multiplication formula from the left and right side sub-formulas in parameters.
     * @param leftSide The left side of the formula.
     * @param rightSide The right side of the formula.
     */
    public MultiplyFormula(Formula leftSide, Formula rightSide){
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }
    @Override
    public double evaluate() {
        return leftSide.evaluate() * rightSide.evaluate();
    }
}
