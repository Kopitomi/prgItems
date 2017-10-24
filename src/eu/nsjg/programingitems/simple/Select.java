package eu.nsjg.programingitems.simple;

import java.util.List;

public class Select implements SimpleProgramingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0 ) {
			throw new IllegalArgumentException("Null�val ne ossz k�cs�g");
		}
		int i = 0;
		while (numbers.get(i) % divider != 0)
			i++;
		return i;
	}

}
