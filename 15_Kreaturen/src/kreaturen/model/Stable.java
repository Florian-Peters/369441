package kreaturen.model;

/***
 * 
 * @author Dozent
 * Klasse die den Stall für die Kreaturen darstellt.
 */
public class Stable {
	private Creature creature;
	private Stable nextStable;
	private String name;
	private static Integer stablecounter = 0;
	
	
	/***
	 * Konstruktor zum Erstellen des Stalles
	 * @param countStables - Anzahl der Stallboxen
	 */
	public Stable(Integer countStables) {
		this.creature = null;
		this.name = "Stall " + stablecounter;
		stablecounter++;
		for(int i=1; i<=countStables-1;) {
			this.nextStable = new Stable(countStables-i);
			break;
		}
	}

	@Override
	public String toString() {
		return "Stable [creature=" + creature +  ", name=" + name + ", nextStable=\n" + nextStable + "]";
	}
	
	/***
	 * Methode zum Hinzufügen von Kreaturen zum Stall
	 * @param creature - Die Kreatur die dem Stall hinzugefügt wird
	 */
	public void addCreature(Creature creature) {
		if(this.creature ==  null) {
			this.creature = creature;
			System.out.println("Creature added to " + this.name);
		} else if (this.nextStable.creature == null || this.nextStable != null){
			this.nextStable.addCreature(creature);
		} else {
			System.out.println("Stable is full, no room for new creature!");
		}
	}
	
	/***
	 * Methode um den gesamten Stall auf der Konsole auszugeben
	 */
	public void printStable() {
		if(this.creature == null) {
			PrintHelper.printLine();
			PrintHelper.printEmptyCell();
			PrintHelper.printLine();
		} else {
			PrintHelper.printLine();
			this.creature.printCreature();
			PrintHelper.printLine();
		}
		if(this.nextStable != null) {
			this.nextStable.printStable();
		}
	}
	
	/***
	 * Methode zum Füttern der Kreaturen im Stall
	 * @param foodCount - Anzahl der Futterkübel
	 */
	public void feedCreatures(Integer foodCount) {
		if(this.creature != null) {
			if(this.creature.getHungrig() && foodCount > 0){
				this.creature.feedCreature();
				foodCount--;
				if(this.nextStable != null) {
					this.nextStable.feedCreatures(foodCount);
				} else {
					this.checkFoodCount(foodCount);
				}
			} else if(this.nextStable != null && foodCount > 0) {
				this.nextStable.feedCreatures(foodCount);
			} else {
				this.checkFoodCount(-1);
			}
		} else {
			this.checkFoodCount(foodCount);
		}
	}
	
	/***
	 * Private Methode zum Checken der Futterkübel
	 * @param foodCount - Anzahl der übrigbleibenden Futterkübel
	 */
	private void checkFoodCount(Integer foodCount) {
		if(foodCount < 0) {
			System.out.println("Not enough food, some creatures go hungry!");
		}else if(foodCount == 0) {
			System.out.println("All creatures are fed, no food left!");
		} else {
			System.out.println("All creatures are fed, some food is left!");
		}
	}

}
