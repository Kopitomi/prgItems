package eu.nsjg.programingitems.complex;

import java.util.List;

public abstract class ComplexPogramingItemStrategy {

		protected final Integer[] numbers;

		public ComplexPogramingItemStrategy(List<Integer> numbers) {
			this.numbers = numbers.toArray(new Integer[numbers.size()]);
		}
		public abstract List<Integer>sort();
		
		protected boolean greater(int i, int j) {
			return numbers[i] > numbers[j];
		}
		protected void swap(int i, int j) {
			Integer p = numbers[i];
			numbers [i] = numbers [j];
			numbers [j] = p; 
			
		}
}
