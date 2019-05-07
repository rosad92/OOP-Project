import java.util.ArrayList;
import java.util.List;
public class player {
	private final String name;
	private Room currRoom;
	private List<Item> inventory;

	public Player(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public List<Item> getInventory(){
		return inventory;
	}
	public Room getCurrRoom() {
		return currRoom;
	}
	public void setCurrRoom(Room room) {
		currRoom= room;
	}
	}
