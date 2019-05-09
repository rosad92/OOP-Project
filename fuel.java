public class fuel extends item{
	private String name;
	private boolean hasFuel;
	public fuel(String name){
		this.name = name;
		hasFuel = false;
	}
	public boolean use(){
		//if in the right spot, add to fuel meter
		return true;
	}
	public void look(){
		System.out.println("Fuel can be used to get the ship off the ground");
	}
}
