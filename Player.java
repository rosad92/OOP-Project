public class Player {
	private String name;
	private item [] inventory;

	public Player(String name) {
		this.name=name;
		inventory = new item [17];
		
		//command center item
		inventory [0] = new tool("flashlight");
		//sleeping quarters items
		inventory [1] = new tool("hammer");
		inventory[2] = new SuitPart("helmet");
		//communal area
		inventory[3] = new SuitPart("pants");
		inventory[4] = new food("apple");
		//cargo bay
		inventory[5] = new ShipParts("screws");
		inventory[6] = new food("bread");
		//engine
		inventory[7] = new fuel();
		//airlock
		inventory[8] = new SuitPart("jacket");
		//crater
		inventory[9] = new ShipParts("wing");
		inventory[10] = new tool("screwdriver");
		//dunes
		inventory[11] = new tool("wire");
		inventory[12] = new ShipParts("wheels");
		//cave
		inventory[13] = new ShipParts("rudder");
		inventory[14] = new tool("tape");
		//shelter
		inventory[15] = new fuel();
		inventory[16] = new food("preserved food");
		
	}
	public String getName() {
		return name;
	}
	
	


}
