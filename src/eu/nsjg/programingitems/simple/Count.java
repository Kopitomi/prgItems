package eu.nsjg.programingitems.simple;

import java.util.List;

public class Count implements SimpleProgramingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0 ) {
			throw new IllegalArgumentException("Nullával ne ossz köcsög");
		}
		int count = 0;
		for (Integer value : numbers) {
			if(value % divider == 0) {
				count++;
			}
		}
		return count;
	}

}
