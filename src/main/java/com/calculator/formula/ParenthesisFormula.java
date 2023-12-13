package com.calculator.formula;

/**
 * Representation of a formula in between parentheses.
 */
public class ParenthesisFormula implements Formula{
    private final Formula formula;

    /**
     * Creates a formula located between parentheses from the formula in parameters.
     * @param formula The formula to put between parentheses.
     */
    public ParenthesisFormula(Formula formula){
        this.formula = formula;
    }
    @Override
    public double evaluate() {
        return formula.evaluate();
    }
}
