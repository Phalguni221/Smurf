package Smurf;

public class Smurf {

	public String name;
	private boolean correctName;
    
Smurf (String name, boolean correctName) {
	this.name = name;
	this.correctName = correctName;
}
	public static void createSmurf(String name, boolean correctName) {
		System.out.println("Creating " + name + " Smurf");
		System.out.println( correctName);
	}

	void setTrue(boolean correctName) {
		this.correctName = correctName;
	}

	public static void printName(String name) {
		System.out.println("My name is " + name + " Smurf.");
	}

	public static void eat(String berries) {
		System.out.println(berries + "" + "Smurfberries.");
	}

	// public void setcorrectName(boolean correctName) {
	// 	this.correctName= correctName;
	// }
}