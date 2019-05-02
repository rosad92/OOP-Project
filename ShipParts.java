public class ShipParts extends items{
	String name;
	ShipParts(String name){
		this.name = name;
	}
	public boolean use(){
		//if location is right to use them, use
		//else return can't use return false
		return false;
	}
	public void look(){
		System.out.println(name + "is a piece of the ship that broke off in the crash.");
	}
	
}
