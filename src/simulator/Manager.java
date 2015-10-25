package simulator;
import org.joda.time.DateTime;


public class Manager {
	
	private EventScheduler es;
	
	public Manager()
	{
		//es = EventScheduler.getInstance();
	};
	
	public void add( DateTime dt , CustomerGroup cg)
	{
		es = EventScheduler.getInstance();
		DateTime dtNew = dt.plusMinutes(5);
		System.out.println(dtNew.toString() +  " , "  + " , " + cg.toString());
		es.addEvents(new CustomerWaitFoodEvent(dtNew , cg));
	}
}
