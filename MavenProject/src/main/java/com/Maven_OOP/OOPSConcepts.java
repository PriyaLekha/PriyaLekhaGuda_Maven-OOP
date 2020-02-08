package com.Maven_OOP;

//OOP Implementation Example

interface A
{
	void num();
}

class One implements A
{
	public void num()
	{
		System.out.println("Numbers");
	}

	public void display() 
	{
		System.out.println("One");
	}
}

//implementation of inheritance
class Two extends One 
{
	@Override
	public void display()
	{
		System.out.println("Two");
	}
	public int add(int x, int y) 
	{
		return x+y;
	}
	
	//Overloading
	public double add(double x,double y) 
	{
		return x+y;
	}
}

//implemantation of encapsulation 
class EncapTest 
{
	private String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String newName) 
	{
		name = newName;
	}
}

//implemantation of abstraction
abstract class TwoWheeler 
{
	public abstract void run();
}
class Honda extends TwoWheeler
{
	public void run()
	{
		System.out.println("\nScooter is Running..");
	}
}

class OOPSConcepts 
{
	public static void main(String[] args) 
	{
		One a=new One();
		a.display();
		Two b=new Two();
		b.display();
		System.out.println(b.add(4,2));
		System.out.println(b.add(5.,2.)); 
		
		//Implemantation of polymorphism
		EncapTest encap = new EncapTest();
		encap.setName("Priya's");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new Honda();
		test.run();
	}
}