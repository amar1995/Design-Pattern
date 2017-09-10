package movie;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {

	List<IObserver> customer = new ArrayList<>();
	
	@Override
	public void addSeat(IObserver customer) {
		// TODO Auto-generated method stub
		this.customer.add(customer);
	}	

	@Override
	public void removeSeat(IObserver customer) {
		// TODO Auto-generated method stub
		this.customer.remove(customer);
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for(IObserver customer : this.customer){
			customer.update();
		}

	}
	
	public void getAvailableSeats(){
		
	}

}
