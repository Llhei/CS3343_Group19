package simulator;
import java.util.Map;


public class Main {

	Map<Integer , Integer> hourCoeff;
	
	public static void main(String[] args) {
		EventScheduler es = EventScheduler.getInstance();
		//To do : read coeff from text file.
		es.generateArriveEvents();
		es.executeEvents();
		
	}
	

}
