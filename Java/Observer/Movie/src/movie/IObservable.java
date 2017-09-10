package movie;

public interface IObservable {
	public void addSeat(IObserver observer);
	public void removeSeat(IObserver observer);
	public void Notify();
}
