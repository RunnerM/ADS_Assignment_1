public class CalculatorVisitor extends Operand implements Visitor, Calculator {

    private MalformedExpressionException malformedExpressionException;

    private LinkedStack<Token> tokenStack;
    private boolean malformedExpression = false;

    public CalculatorVisitor() {
        tokenStack = new LinkedStack<>();
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator) throws MalformedExpressionException {
        try {
            Operand operandRight = (Operand) tokenStack.pop();
            Operand operandLeft = (Operand) tokenStack.pop();
            int Result = 0;

            switch (operator.getOperation()) {

                case ADD:
                    Result = operandLeft.getValue() + operandRight.getValue();
                    break;
                case SUB:
                    Result = operandLeft.getValue() - operandRight.getValue();
                    break;
                case DIV:
                    Result = operandLeft.getValue() / operandRight.getValue();
                    break;
                case MUL:
                    Result = operandLeft.getValue() * operandRight.getValue();
                    break;
            }
            Operand resultOperand = new Operand();
            resultOperand.setValue(Result);
            tokenStack.push(resultOperand);
        } catch (EmptyStackException e) {
            throw new MalformedExpressionException();
        }


    }


    /**
     * @see Visitor#visit(Operand)
     */
    public void visit(Operand operand) {
        pushOperand(operand);
    }


    /**
     * @see Visitor#visit(Operator)
     */
    public void visit(Operator operator) {
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            malformedExpression= true;


        }
    }


    /**
     * @see Calculator#getResult()
     */
    public int getResult() throws MalformedExpressionException {
        if(malformedExpression){
            throw new MalformedExpressionException();
        }
        try {
            Operand result = (Operand)tokenStack.pop();
            return result.getValue();
        } catch (EmptyStackException e) {
            throw new MalformedExpressionException();
        }

    }

}
