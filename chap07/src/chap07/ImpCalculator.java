package chap07;

public class ImpCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = 1L;
		for (long i = 1; i <= num; i++) {  // 4! = 4*3*2*1
			result *= i;
		}
		long end = System.nanoTime();
		System.out.printf("ImpCalculator.fac(%d) 실행시간 = %d\n"
				                                ,num, (end-start));
		return result;
	}

}
