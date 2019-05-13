public class food extends item{
	private String name;
	private boolean hasFood;
	private boolean hasUsed;
	food(String name){
		this.name = name;
		hasFood = false;
		hasUsed= false;
	}
	public String getname (){
		return name;
	}
	public boolean getHas() {
		return hasFood;
	}
	public boolean gethasUsed() {
		return hasUsed;
	}
	public void setname (String name){
		this.name = name;
	}
	public void sethasFood (boolean hasPart){
		this.hasFood = hasPart;
	}
	public void sethasUsed (boolean hasUsed){
		this.hasUsed = hasUsed;	
	}
	public boolean use(){
		if(hasUsed == true) {
			return false;
		}
		else if(hasFood == true){
			hasUsed = true;
			return true;
		}
		else {
		return false;
		}
		//if hasUsed is true, return false
		//if hasUsed is false, change hasUsed to true, return true
	}
	public void pickup(){
		if(hasFood == false){
			hasFood=true;
			System.out.println("You picked up a " + name );
		}
		else{
			System.out.println("There is nothing to pickup.");
		}
	}
	public void look(){
		System.out.println(name + " can be used to gain energy.");
	}
	public String getName(){
		return name;
	}
}
