public class Player {
	private String name;
	private item [] inventory;

	public Player(String name) {
		this.name=name;
		inventory = new item [17];
		
		//command center item
		inventory [0] = new tool("hammer");
		//sleeping quarters items
		inventory [1] = new tool("flashlight");
		inventory[2] = new SuitPart("helmet");
		//communal area
		inventory[3] = new SuitPart("gloves");
		inventory[4] = new food("apple");
		//engine
		inventory[5] = new fuel();
		
	}
	public String getName() {
		return name;
	}
	
	


}
