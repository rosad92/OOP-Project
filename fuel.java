public class fuel extends item{
	private boolean hasFuel;
	private boolean hasUsed;
	public fuel(){
		hasFuel = false;
		hasUsed =false;
	}
	public boolean getHas() {
		return hasFuel;
	}
	public boolean gethasUsed() {
		return hasUsed;
	}
	public void sethasUsed (boolean hasUsed){
		this.hasUsed = hasUsed;		
        }
	public void sethasFuel (boolean hasFuel){
		this.hasFuel = hasFuel;		
        }
	public boolean use(){
		if(hasUsed == true){
			return false;
		}
		else if (hasFuel == true){
		        hasUsed = true;
			return true;	
		}
		else {
			return false;
		}
		//similar to food
		//if it hasUsed is true, return false
		//if hasUsed is false, change to true, return false <----is this supposed to say true like in food? 
	}
	public void pickup(){
		if (hasFuel == false){
			hasFuel = true;
			System.out.println("You picked up fuel!");
		}
		else{
			System.out.println("There is nothing to pickup!");
		}
	}
	public void look(){
		System.out.println("Fuel can be used to get the ship off the ground");
	}
}
