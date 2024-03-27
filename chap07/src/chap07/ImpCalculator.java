package chap07;

public class ImpCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long result = 1L;
		for (long i = 1; i <= num; i++) {  // 4! = 4*3*2*1
			result *= i;
		}
		return result;
	}

}
