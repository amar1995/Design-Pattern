package animals;

public class Pegasus extends TypicalAnimal {
	
	public Pegasus() {
		// TODO Auto-generated constructor stub
		setAnimal(new Animal());
		setBird(new Bird());
		setHorse(new Horse());
	}
	
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am Pegasus!");
	}

}
