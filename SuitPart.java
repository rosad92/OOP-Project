public class SuitPart extends item{
	private String name;
	private boolean hasPart;
	SuitPart(String name){
		this.name = name;
		hasPart = false;
	}
	public String getname (){
		return name;
	}
	public boolean getHas() {
		return hasPart;
	}
	
	public void setname (String name){
		this.name = name;
	}
	public void sethasPart(boolean hasPart){
		this.hasPart = hasPart;
	}
		
	public boolean use(){
		//todo
		return true;
	}
	public void pickup(){
		if (hasPart == false){
			hasPart = true;
		}
	}
	public void look(){
		System.out.println(name + "will keep you breathing outside the ship.");
	}
}
