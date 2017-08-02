import java.io.*;
import java.util.*;
import java.lang.*;

interface Menu
{
    public void makeList();
	public String[] getMenu();
}

class VegMenu implements Menu
{
	private String menuList[] = new String[100];
	public void makeList(){
    	menuList[0] = "Aloo Dum";
    	menuList[1] = "Paneer Tikka";
    	menuList[2] = "Mix Veg";
    	menuList[3] = "Paneer Masala";
	}
	public String[] getMenu()
	{
		return menuList;
	}

}
class NonVegMenu implements Menu
{
	private String menuList[] = new String[100];
	public void makeList(){
    	menuList[0] = "Chicken Masala";
    	menuList[1] = "Dish Fry";
    	menuList[2] = "Cheese Chicken";
    	menuList[3] = "Mutton Masala";
	}
    public String[] getMenu()
	{
		return menuList;
	}

}
class BothMenu implements Menu
{
	private String menuList[] = new String[100];
	public void makeList(){
    	menuList[0] = "Aloo Dum";
    	menuList[1] = "Paneer Tikka";
    	menuList[2] = "Mix Veg";
    	menuList[3] = "Paneer Masala";
    	menuList[4] = "Chicken Masala";
    	menuList[5] = "Dish Fry";
    	menuList[6] = "Cheese Chicken";
    	menuList[7] = "Mutton Masala";
	}
    public String[] getMenu()
	{
		return menuList;
	}
}
interface HotelTypes
{
	public VegMenu getVegMenu();
	public NonVegMenu getNonVegMenu();
	public BothMenu getBothMenu();
}
class Hotel implements HotelTypes
{
	public VegMenu getVegMenu()
	{
		VegMenu v = new VegMenu();
		v.makeList();
		return v;
	}
	public NonVegMenu getNonVegMenu()
	{
		NonVegMenu nv = new NonVegMenu();
		nv.makeList();
		return nv;
	}
	public BothMenu getBothMenu()
	{
		BothMenu b = new BothMenu();
		b.makeList();
		return b;
	}
}
public class Facade
{
	public static void main(String[] args) 
	{
		Hotel h = new Hotel();
		VegMenu v = h.getVegMenu();
		NonVegMenu nv = h.getNonVegMenu();
		BothMenu b = h.getBothMenu();
		String s[] = v.getMenu();
		for(int i=0;i<s.length;i++)
		if(s[i]!=null)
		System.out.println(s[i]);
		else break;
		System.out.println("-------------");
		String s1[] = nv.getMenu();
		for(int i=0;i<s1.length;i++)
		if(s1[i]!=null)
		System.out.println(s1[i]);
		else break;
		System.out.println("-------------");
		String s2[] = b.getMenu();
		for(int i=0;i<s2.length;i++)
		if(s2[i]!=null)
		System.out.println(s2[i]);
		else break;
	}
}