package com.calculator.formula.operators;

import com.calculator.formula.Formula;
import com.calculator.formula.constant.Constant;

/**
 * Formula representing the subtraction of an eventually empty left side sub-formula and a right side sub-formula.
 */
public class MinusFormula implements Formula {
    private final Formula leftSide, rightSide;

    /**
     * Creates a subtraction formula from the right side sub-formula only.
     * The left side is automatically considered a 0 constant.
     * @param rightSide The right side of the formula.
     */
    public MinusFormula(Formula rightSide) {
        this.leftSide = new Constant(0);
        this.rightSide = rightSide;
    }

    /**
     * Creates a subtraction formula from the left and right side sub-formulas in parameters.
     * @param leftSide The left side of the formula.
     * @param rightSide The right side of the formula.
     */
    public MinusFormula(Formula leftSide, Formula rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double evaluate() {
        return leftSide.evaluate() - rightSide.evaluate();
    }
}
