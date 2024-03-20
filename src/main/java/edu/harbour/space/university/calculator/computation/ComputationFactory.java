package edu.harbour.space.university.calculator.computation;

import edu.harbour.space.university.calculator.Operator;

public class ComputationFactory {


    public Computation resolveComputation(Operator operator) {
         if (operator.getSymbol()=='+'){
             return  new Sum();
         }else if (operator.getSymbol()=='/'){
             return new Division();
         }else if(operator.getSymbol()=='-'){
             return new Subtraction();
         }else {
             return new Multiplication();
         }
    }
}
