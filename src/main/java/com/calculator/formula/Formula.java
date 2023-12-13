package com.calculator.formula;

/**
 * General interface of an evaluable mathematical formula.
 * This represents a node inside the global formula tree.
 */
public interface Formula {

    /**
     * Evaluates the formula corresponding to the node in the global formula tree.
     * @return The result of the evaluation.
     */
    double evaluate();

}
