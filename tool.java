public class tool extends item{
	private String name;
	private boolean hasTool;
	tool(String name){
		this.name = name;
		hasTool = false;
	}
	public boolean use(){
		//tools will have specific uses
		return true;
	}
	public void look(){
		System.out.println(name + " can be used to repair the ship.");
	}
}
