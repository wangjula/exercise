package main.java.chapter004;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {

	SOLID, LIQUID, GAS;
	
	public enum Transition {
		MELT(SOLID, LIQUID),
		FREEZE(LIQUID, SOLID),
		BOIL(LIQUID, GAS),
		CONDENSE(GAS, LIQUID),
		SUBLIME(SOLID, GAS),
		DEPOSIT(GAS, SOLID);
		
		private final Phase src;
		private final Phase dst;
		
		private Transition(Phase src, Phase dst) {
			this.src = src;
			this.dst = dst;
		}
		
		//Initialize the phase transition map
		private static final Map<Phase, Map<Phase, Transition>> map = new EnumMap<Phase, Map<Phase, Transition>>(
				Phase.class);
		static {
			//create map for each phase
			for (Phase phase : Phase.values()) {
				map.put(phase, new EnumMap<Phase, Transition>(Phase.class));
			}
			//bind transition for each phase
			for (Transition transition : Transition.values()) {
				map.get(transition.src).put(transition.dst, transition);
			}
		}
		public static Transition from (Phase src, Phase dst) {
			return map.get(src).get(dst);
		}
	}
}
