package chap07;

public class MainProxy {

	public static void main(String[] args) {
		ExeCalculator cal1 = new ExeCalculator(new ImpCalculator());
		System.out.println(cal1.factorial(20));
		
		ExeCalculator cal2 = new ExeCalculator(new RecCalculator());
		System.out.println(cal2.factorial(20));

	}

}
