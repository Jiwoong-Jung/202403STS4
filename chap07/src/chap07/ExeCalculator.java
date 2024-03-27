package chap07;

public class ExeCalculator implements Calculator {

	private Calculator delegate;
	
	public ExeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.fac(%d) 실행시간 = %d\n",
				        delegate.getClass().getSimpleName()
				        ,num, (end-start));
		return result;
	}

}
