package ducks;
public class RubberDuck extends DuckFamily{
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		setFlyBehaviour(new NoFly());
		setQuackBehaviour(new Squeak());
	}
	
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("I am a RubberDuck");		
	}
} 
