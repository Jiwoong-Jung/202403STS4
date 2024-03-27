package chap07;

public class Main {

	public static void main(String[] args) {
		ImpCalculator f1 = new ImpCalculator();
		System.out.println(f1.factorial(5));
		
		RecCalculator f2 = new RecCalculator();
		System.out.println(f2.factorial(5));

	}

}
