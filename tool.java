public class tool extends item{
	private String name;
	private boolean hasTool;
	private boolean hasUsed;
	tool(String name){
		this.name = name;
		hasTool = false;
		hasUsed= false;
	}
	public boolean use(){
		//tools will have specific uses
		if(hasUsed == true){
			return false;
		}
		else if(hasTool==true){
			return true;
		}
		else{
			return false;
		}
	}
	public void pickup(){
		if (hasTool == false){
			hasTool = true;
			System.out.println("You picked up a " + name);
		}
		else{
			System.out.println("There is nothing to pickup!");
		}
	}
	public boolean getHas(){
		return hasTool;
	}
	public void look(){
		System.out.println(name + " can be used to repair the ship.");
	}
}
