public class fuel extends item{
	private String name;
	private boolean hasFuel;
	private boolean hasUsed;
	public fuel(String name){
		this.name = name;
		hasFuel = false;
		hasUsed =false;
	}
	public boolean use(){
		//similar to food
		//if it hasUsed is true, return false
		//if hasUsed is false, change to true, return false
		return true;
	}
	public void look(){
		System.out.println("Fuel can be used to get the ship off the ground");
	}
}
