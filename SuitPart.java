public class SuitPart extends item{
	private String name;
	private boolean hasPart;
	SuitPart(String name){
		this.name = name;
		hasPart = false;
	}
	public boolean use(){
		//this will add to a total count of suitparts on
		return true;
	}
	public void look(){
		System.out.println(name + "will keep you breathing outside the ship.");
	}
}
