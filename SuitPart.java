public class SuitPart extends item{
	String name;
	SuitPart(String name){
		this.name = name;
	}
	public boolean use(){
		//this will add to a total count of suitparts on
		return true;
	}
	public void look(){
		System.out.println(name + "will keep you breathing outside the ship.");
	}
}
