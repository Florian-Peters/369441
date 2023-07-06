package kreaturen.model;

/***
 * 
 * ENUM für erlaubte Kreaturenarten
 * @author Dozent
 *
 */
public enum CreatureType {
	HEADY("Heady"),
	FOOTY("Footy"),
	TRUNKY("Trunky");
	
	private final String type;
	
	private CreatureType(String type) {
		this.type = type;
	}
	
	public String getCreatureType() {
		return this.type;
	}
}
