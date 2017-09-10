import java.util.*;

class Facing {
	private char face;
	Facing(char face)
	{
		this.face = face;
	}
	public Direction directed(){
		Direction fn = null;
		if(face == 'N')
		{
			fn = new FacingNorth();
		}
		else if(face == 'S')
		{
			fn = new FacingSouth();
		}
		else if(face == 'E')
		{
			fn = new FacingEast();
		}
		else if(face == 'W')
		{
			fn = new FacingWest();
		}
		return fn;
	}
	public char getface()
	{
		return face;
	}
}
class FacingEast implements Direction {

	@Override
	public char leftMovement() {
		return 'N';
	}
	@Override
	public char rightMovement() {
		return 'S';
	}
	
}

interface Direction {
	public char leftMovement();
	public char rightMovement();
}

class FacingWest implements Direction {

	@Override
	public char leftMovement() {
		
		return 'S';
	}

	@Override
	public char rightMovement() {
		return 'N';
	}
	
}

interface Movement {
	public void MovePositiveXAxis();
	public void MoveNegativeXAxis();
	public void MovePositiveYAxis();
	public void MoveNegativeYAxis();
	public int getXAxis();
	public int getYAxis();
}

class FacingNorth implements Direction {

	@Override
	public char leftMovement() {
		
		return 'W';
	}

	@Override
	public char rightMovement() {
		return 'E';
	}
	
}
class FacingSouth implements Direction {

	@Override
	public char leftMovement() {
		
		return 'E';
	}

	@Override
	public char rightMovement() {
		return 'W';
	}
	
}

class Rover implements Movement{
	private int x,y;
	Rover(){
		this.x=0;
		this.y=0;
	}
	Rover(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public int getXAxis() {
		// TODO Auto-generated method stub
		return x;
	}
	@Override
	public int getYAxis() {
		// TODO Auto-generated method stub
		return y;
	}
	@Override
	public void MovePositiveXAxis() {
		x++;
		return;
	}

	@Override
	public void MoveNegativeXAxis() {
		x--;
		return;
	}

	@Override
	public void MovePositiveYAxis() {
		y++;
		return;
	}

	@Override
	public void MoveNegativeYAxis() {
		y--;
	}
}


class CurrentPosition {
	private  int initialX,initialY;
	private char initialDirection;
	public static char movement;
	CurrentPosition(){
		this.initialX=0;
		this.initialY=0;
		this.initialDirection = ' ';
	}
	CurrentPosition(int initialX,int initialY,char initialDirection){
		this.initialX=initialX;
		this.initialY=initialY;
		this.initialDirection = initialDirection;
	}
	public void moveRobot()
	{
		Rover rover =  new Rover(initialX,initialY);
		Facing facing = new Facing(initialDirection);
		Direction fn = facing.directed();
		if(CurrentPosition.movement == 'L')
		{
			initialDirection = fn.leftMovement();
		}
		else if(CurrentPosition.movement == 'R')
		{
			initialDirection = fn.rightMovement();
		}
		else
		{
			if(facing.getface() == 'N')
				rover.MovePositiveYAxis();
			else if(facing.getface() == 'S')
				rover.MoveNegativeYAxis();
			else if(facing.getface() == 'E')
				rover.MovePositiveXAxis();
			else if(facing.getface() == 'W')
				rover.MoveNegativeXAxis();
			initialX=rover.getXAxis();
			initialY = rover.getYAxis();
		}
	}
	
	public int getInitialX()
	{
		return initialX;
	}
	public int getInitialY()
	{
		return initialY;
	}
	public char getInitialDirection()
	{
		return initialDirection;
	}
}

class FinalPosition {
	private int maxX,maxY,X,Y;
	private char move;
	private String str;
	public static void main(String arg[])
	{
	    FinalPosition obj = new FinalPosition();
		Scanner sc = new Scanner(System.in);
		obj.maxX = sc.nextInt();
		obj.maxY = sc.nextInt();
		sc.nextLine();
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
		    obj.move = s.charAt(s.length()-1);
		    Scanner sn = new Scanner(s);
		    obj.X=sn.nextInt();
		    obj.Y=sn.nextInt();
			obj.str = sc.nextLine();
			for(int i=0;i<obj.str.length();i++)
			{
				CurrentPosition current =  new CurrentPosition(obj.X,obj.Y,obj.move);
				CurrentPosition.movement=obj.str.charAt(i);
				current.moveRobot();
				obj.X=current.getInitialX();
				obj.Y=current.getInitialY();
				if(obj.X < 0 && obj.X > obj.maxX)
				{
				    System.out.println("Errorrr!!!!!");
				    System.exit(0);
				}
				if(obj.Y < 0 && obj.Y > obj.maxY)
				{
				    System.out.println("Errorrr!!!!!");
				    System.exit(0);
				}
				obj.move=current.getInitialDirection();
			}
			System.out.println(obj.X + " " + obj.Y + " " + obj.move);
			
		}
		System.out.println("==========");
	}
}