package kreaturen;

import kreaturen.model.Creature;
import kreaturen.model.CreatureType;
import kreaturen.model.Stable;

public class AppKreaturen {

	public static void main(String[] args) {
		// Hallo, das ist eine Zeile die du erst laden musst!
		// 4 f)
		Stable s = new Stable(4);
		
		// 4g)
		s.addCreature(new Creature(CreatureType.HEADY));
		s.addCreature(new Creature(CreatureType.FOOTY));
		s.printStable();
		trenner();
		
		// 4h)
		s.feedCreatures(1);
		s.printStable();
		trenner();
		
		
		// 4i)
		s.addCreature(new Creature(CreatureType.HEADY));
		s.addCreature(new Creature(CreatureType.TRUNKY));
		s.printStable();
		trenner();
		
		// 4j)
		s.feedCreatures(2);
		s.printStable();
		trenner();
		
		// 4k)
		s.feedCreatures(3);
		s.printStable();
	}
	
	private static void trenner() {
		System.out.println();
		System.out.println("#########################################");
		System.out.println("#########################################");
		System.out.println("#########################################");
		System.out.println();
	}

}
