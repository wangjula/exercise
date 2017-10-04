package main.java.chapter002;

public class FinalizerGuardianTest {

	
}

class Outter {
	
	@SuppressWarnings("unused")
	private final Object finalizerGuardian = new Object() {
		
		@Override
		public void finalize() {
			//finalize otter
		}
	};
}

class BaseOutter {
	
}
