public class food extends item{
	private String name;
	private boolean hasFood;
	food(String name){
		this.name = name;
		hasFood = false;
	}
	public boolean use(){
		//change health meter?
		return true;
	}
	public void look(){
		System.out.println(name + " can be used to gain energy.");
	}
}
