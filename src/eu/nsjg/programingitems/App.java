package eu.nsjg.programingitems;

import java.util.List;
import java.util.Random;

import eu.nsjg.programingitems.complex.BubbleSort;
import eu.nsjg.programingitems.complex.ComplexPogramingItemStrategy;
import eu.nsjg.programingitems.complex.SimpleShuffleShort;
import eu.nsjg.programingitems.generate.ListPopulate;
import eu.nsjg.programingitems.simple.Calculate;
import eu.nsjg.programingitems.simple.Decide;
import eu.nsjg.programingitems.simple.SimpleItemResult;
import eu.nsjg.programingitems.simple.SimpleProgramingItemStrategy;

public class App {

	private final List<Integer> numbers;
	private final SimpleItemResult item; 

	public App() {
		ListPopulate list = new ListPopulate(new Random());
		numbers = list.getNumbers(100, 1, 100);
		item = new SimpleItemResult();
	}

	public static void main(String[] args) {
		App app = new App();
		app.print();
	}

	private void print() {
		System.out.println("A lista jelenleg " + numbers.size() + " elemû.");
		System.out.println("A lista tartalma: " + numbers);
		System.out.println(item.getResult(numbers, 10));
		System.out.println("-------");
		ComplexPogramingItemStrategy complex = new SimpleShuffleShort(numbers);
		System.out.println("A lista tartalma: " + numbers);
		System.out.println("A lista rendezve: " + complex.sort());
		System.out.println("-------");
		complex = new BubbleSort(numbers);
		System.out.println("A lista tartalma: " + numbers);
		System.out.println("A lista rendezve: " + complex.sort());
	}
}