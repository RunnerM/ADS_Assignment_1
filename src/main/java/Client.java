import java.util.ArrayList;

public class Client {

	private ArrayList<Token> tokens;

	private CalculatorVisitor calculatorVisitor;

	public int evaluateExpression(ArrayList<Token> tokenList) {
		calculatorVisitor = new CalculatorVisitor();
		for (Token t:tokenList) {
			t.accept(calculatorVisitor);
		}
		return calculatorVisitor.getResult();
	}

}
