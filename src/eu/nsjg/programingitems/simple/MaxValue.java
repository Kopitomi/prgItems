package eu.nsjg.programingitems.simple;

import java.util.List;

public class MaxValue implements SimpleProgramingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		int max = Integer.MIN_VALUE;
		for (Integer value : numbers) {
		if (value > max) {
			max = value;
		}
		}
		return max;
	}

}
