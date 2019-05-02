public class food extends item{
	String name;
	food(String name){
		this.name = name;
	}
	public boolean use(){
		//change health meter
		return true;
	}
	public void look(){
		System.out.print(name + " can be used to gain energy.");
	}
}
