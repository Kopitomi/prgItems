package eu.nsjg.programingitems.simple;

public enum SimpleProgramingItem {

	CALCULATE("Sorozat sz�m�t�s: ", new Calculate()),
	DECIDE("Eld�nt�s: ", new Decide()),
	SELECT("Kiv�laszt�s: ", new Select()),
	FIND("Keres�s: ", new Find()),
	COUNT("Megsz�mol�s: ", new Count()),
	MAX_VALUE("Maximum �rt�k: ", new MaxValue());
	
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
