public class food extends item{
	private String name;
	private boolean hasFood;
	private boolean hasUsed;
	food(String name){
		this.name = name;
		hasFood = false;
		hasUsed= false;
	}
	public boolean use(){
		//if hasUsed is true, return false
		//if hasUsed is false, change hasUsed to true, return true
		return true;
	}
	public void look(){
		System.out.println(name + " can be used to gain energy.");
	}
	public String getName(){
		return name;
	}
}
