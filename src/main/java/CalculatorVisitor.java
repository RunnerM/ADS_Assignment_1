public class CalculatorVisitor extends Operand implements Visitor, Calculator {

	private MalformedExpressionException malformedExpressionException;

	private LinkedStack<Token> tokenStack;

	private void pushOperand(Operand operand) {

	}

	private void performOperation(Operator operator) {

	}


	/**
	 * @see Visitor#visit(Operand)
	 */
	public void visit(Operand operand) {

		operand.getValue();
	}


	/**
	 * @see Visitor#visit(Operator)
	 */
	public void visit(Operator operator) {
		operator.getOperation();

	}


	/**
	 * @see Calculator#getResult()
	 */
	public int getResult() {
		return 0;
	}

}
