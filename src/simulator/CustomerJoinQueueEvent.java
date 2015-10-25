package simulator;
import java.util.Date;
import org.joda.time.DateTime;

public class CustomerJoinQueueEvent extends CustomerEvent{

	Manager manager;
	CustomerGroup cg;
	
	public CustomerJoinQueueEvent(DateTime dt , CustomerGroup cg , Manager m)
	{
		super(dt , cg);
		manager = m;
		System.out.println("a join quene event created to be executed at " + dt.toString());
		//QueueManager.appendCustomer
	}
	
	@Override
	void execute() {
		//queueManger.add(super.cg);
		manager.add(super.executeTime, super.cg);
		System.out.println(super.getExecuteTime() + " : jqe executed");
	}
}
