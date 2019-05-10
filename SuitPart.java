public class SuitPart extends item{
	private String name;
	private boolean hasPart;
	private boolean hasUsed;
	SuitPart(String name){
		this.name = name;
		hasUsed = false;
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
		if(hasUsed == true){
			return false;
		}
		else if(hasPart==true){
			return true;
		}
		else{
			return false;
		}
		
	}
	public void pickup(){
		if (hasPart == false){
			hasPart = true;
			System.out.println("You picked up your " + name);
		}
		else{
			System.out.println("There is nothing to pickup!");
		}
	}
	public void look(){
		System.out.println(name + "will keep you breathing outside the ship.");
	}
}
