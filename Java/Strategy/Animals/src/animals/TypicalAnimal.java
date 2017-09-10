package animals;

public abstract class TypicalAnimal {
	IAnimal animal;
	IBird bird;
	IHorse horse;
	
	public void setAnimal(IAnimal animal1){
		this.animal = animal1;
	}
	
	public void setBird(IBird b){
		this.bird = b;
	}
	
	public void setHorse(IHorse h){
		this.horse = h;
	}
	
	public abstract void Display();
	
	public void performWalk(){
		animal.walk();
	}
	
	public void performFly(){
		bird.fly();
	}
	
	public void performRun(){
		horse.RunLikeHorse();
	}
	
}
