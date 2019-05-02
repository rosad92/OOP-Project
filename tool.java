public class tool{
	String name;
	tool(String name){
		this.name = name;
	}
	public boolean use(){
		//tools will have specific uses
	}
	public void look(){
		System.out.println(name + " can be used to repair the ship.");
	}
}
