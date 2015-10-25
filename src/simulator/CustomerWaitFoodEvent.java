package simulator;
import org.joda.time.DateTime;


public class CustomerWaitFoodEvent extends CustomerEvent{

	//int randomNum = rand.nextInt((max - min) + 1) + min;
	
	public CustomerWaitFoodEvent(DateTime dt , CustomerGroup cg) {
		super(dt, cg);
		
		
	}

	@Override
	void execute() {
		//cg.setState(new CustomerWaitingFood());
		System.out.println(super.executeTime.toString() + " a customer is waiting for food");
		
		EventScheduler es = EventScheduler.getInstance();
		int waitTime = RandomGenerator.getWaitFoodTime();
		DateTime dtEat = super.getExecuteTime().plusMinutes(waitTime);
		
		CustomerEatingEvent cee = new CustomerEatingEvent(dtEat , super.cg);
		es.addEvents(cee);
		
		int eatTime = RandomGenerator.getEatingTime();
		DateTime dtFinish = dtEat.plusMinutes(eatTime);
		CustomerFinishEvent cfe = new CustomerFinishEvent(dtFinish , cg);
		es.addEvents(cfe);
		
	}

}
