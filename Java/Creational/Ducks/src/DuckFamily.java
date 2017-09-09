
public abstract class DuckFamily {
	public IFlyBehaviour FlyBehaviour;
	public IQuackBehaviour QuackBehaviour;
	
	public void setFlyBehaviour(IFlyBehaviour FBehave){
		this.FlyBehaviour = FBehave;
	}
	
	public void setQuackBehaviour(IQuackBehaviour QBehave){
		this.QuackBehaviour = QBehave;
	}
	
	public void performFly(){
		FlyBehaviour.Fly();
	}
	
	public void performQuack(){
		QuackBehaviour.quack();
	}
	
	public abstract void Display();
	
	public void Swim(){
		System.out.println("Every Fucking Duck can Swim! Be It dead");
	}
	
}
