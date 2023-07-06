package kreaturen.model;

/***
 * 
 * Klasse die die Kreatur darstellt
 * @author Dozent
 *
 */
public class Creature {
	private CreatureType creaturetype;
	private Boolean hungrig;
	
	/***
	 * Konstruktor für die Kreatur
	 * @param creatureType - Der Kreaturentyp, nur erlaubte Werte zulässig
	 */
	public Creature(CreatureType creatureType) {
		this.creaturetype = creatureType;
		this.hungrig = true;
	}

	public Boolean getHungrig() {
		return hungrig;
	}

	public void setHungrig(Boolean hungrig) {
		this.hungrig = hungrig;
	}

	public CreatureType getCreaturetype() {
		return creaturetype;
	}
	
	public String toString() {
		return "Creature : " + this.creaturetype;
	}
	
	/***
	 * Methode zum Füttern der Kreatur
	 */
	public void feedCreature() {
		this.hungrig = false;
	}
	
	/***
	 * Methode zum Ausgeben der Kreatur auf der Konsole
	 */
	public void printCreature() {
		switch(this.creaturetype) {
			case HEADY: {
				this.printHeady();
				break;
			}
			case FOOTY: {
				this.printFooty();
				break;
			}
			case TRUNKY: {
				this.printTrunky();
				break;
			}
		}
	}
	
	private void printHeady() {
		if (this.hungrig) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/           |");
		}
		else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /         |");
			System.out.println("|          \\______/          |");
		}
	}
	
	private void printFooty() {
		if (this.hungrig) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
		else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}
	
	private void printTrunky() {
		if (this.hungrig) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		}
		else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( °-°                  \\  |");
			System.out.println("|   \\                     /  |");		
			System.out.println("|    \\___________________/   |");
		}
	}
}
