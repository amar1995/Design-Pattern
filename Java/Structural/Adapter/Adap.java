import java.io.*;
import java.util.*;
import java.lang.*;

interface Bird
{
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird
{
    public void fly(){
        System.out.println("Sparrow can fly");
    }
    public void makeSound(){
        System.out.println("Chrip Chrip");
    }
}
interface ToyDuck
{
    public void squeak();
}
class ImplementToyDuck implements ToyDuck
{
    public void squeak(){
        System.out.println("Squeak Squeak");
    }
}

class BirdAdapter implements ToyDuck
{
	Bird  bird;
	public BirdAdapter(Bird bird)
	{
		this.bird = bird;
	}
	public void squeak()
	{
		bird.makeSound();
	}
}
class Adap
{
	public static void main(String args[])
	{
		Sparrow sparrow = new Sparrow();
        ImplementToyDuck toyDuck = new ImplementToyDuck();
        //Implementing sparrow into toyduck interface 
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
 
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
 
        System.out.println("ToyDuck...");
        toyDuck.squeak();
        //using adpater betwwen toyduck and Sparrow 
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}