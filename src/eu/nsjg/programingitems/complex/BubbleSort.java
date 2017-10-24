package eu.nsjg.programingitems.complex;

import java.util.Arrays;
import java.util.List;

public class BubbleSort extends ComplexPogramingItemStrategy {

	public BubbleSort(List<Integer> numbers) {
		super(numbers);
	}

	@Override
	public List<Integer> sort() {
		for (int i = numbers.length; i > 1; i--) {
			for (int j = i +1; j < numbers.length; j++) {
				if(greater(j, j+1)) {
					swap(i, j);
				}
			}
		}
		return Arrays.asList(numbers);
	}

}
