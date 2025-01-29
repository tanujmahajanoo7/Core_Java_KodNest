package Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		
		PloyCalculator p = new PloyCalculator();
		p.simplecalsi(new SimpleCalculator());
		p.simplecalsi(new AdvanceCalculator());
		p.simplecalsi(new ScientificCalculator());
	}

}
