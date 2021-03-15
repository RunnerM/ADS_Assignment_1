public class CalculatorVisitor extends Operand implements Visitor, Calculator {

	private Token tokenStack;

	private MalformedExpressionException malformedExpressionException;

	private LinkedList linkedList;

	private LinkedStack linkedStack;

	private void pushOperand(Operand operand) {

	}

	private void performOperation(Operator operator) {

	}


	/**
	 * @see Visitor#visit(Operand)
	 */
	public void visit(Operand operand) {

	}


	/**
	 * @see Visitor#visit(Operator)
	 */
	public void visit(Operator operator) {

	}


	/**
	 * @see Calculator#getResult()
	 */
	public int getResult() {
		return 0;
	}

}
