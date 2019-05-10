public class ShipParts extends item{
	private String name;
	private boolean hasPart;
	private boolean hasUsed;
	ShipParts(String name){
		this.name = name;
		hasPart = false;
		hasUsed=false;
	}
	public String getname (){
		return name;
	}
	public boolean getHas() {
		return hasPart;
	}
	public boolean gethasUsed() {
		return hasUsed;
	}
	public void setname (String name){
		this.name = name;
	}
	public void sethasPart(boolean hasPart){
		this.hasPart = hasPart;
	}
	public void sethasUsed (boolean hasUsed){
		this.hasUsed = hasUsed;		
        }
	public boolean use(){
		//we've gotta edit this because abstraction
		// edit this so it takes an integer for the location
		if(hasUsed = false) {
			hasUsed = true;
			return true;
		}
		//if it is any of the locations on the ship, (as in the array in the adventure class) change hasUsed to true, and return true;
		else {
			//if it is not a location on the ship, or if hasUsed is already true, return false;
		return false;
		}
	}
	public void pickup(){
		if (hasPart == false){
			hasPart = true;
			System.out.println("You picked up a " + name);
		}
		else{
			System.out.println("There is nothing to pickup!");
		}
	}
	public void look(){
		System.out.println(name + "is a piece of the ship that broke off in the crash.");
	}
	
}
