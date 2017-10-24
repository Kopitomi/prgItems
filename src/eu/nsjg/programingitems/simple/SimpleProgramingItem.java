package eu.nsjg.programingitems.simple;

public enum SimpleProgramingItem {

	CALCULATE("Sorozat számítás: ", new Calculate()),
	DECIDE("Eldöntés: ", new Decide()),
	SELECT("Kiválasztás: ", new Select()),
	FIND("Keresés: ", new Find()),
	COUNT("Megszámolás: ", new Count()),
	MAX_VALUE("Maximum érték: ", new MaxValue());
	
	private final String description;
	private final SimpleProgramingItemStrategy item;
	
	private SimpleProgramingItem(String description, SimpleProgramingItemStrategy item) {
		this.description = description;
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public SimpleProgramingItemStrategy getItem() {
		return item;
	}
	
	
}
