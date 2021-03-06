package eu.nsjg.programingitems.simple;

import java.util.List;

public class Calculate implements SimpleProgramingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		int sum = 0;
		for (Integer value : numbers) {
			sum += value;
		}
		return sum;
	}

}
