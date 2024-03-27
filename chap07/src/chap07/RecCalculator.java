package chap07;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1); // 재귀(recursive) 호출
	}

}
