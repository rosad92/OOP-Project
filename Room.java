

public class Room {
	
	String roomname;
	boolean hasitem;
	boolean visited;
	//this needs a constructor for name and to set defaults for the boolean
	public Room(String name){
		roomname = name;
		hasitem = false;
		visited = false; 
	}
	
	public String getroomname() {
		return roomname;
	}
	
	public boolean gethasitem() {
		return hasitem;
	}
	
	public boolean getvisited() {
		return visited; 
	}
	
	public void setroomname (String roomname){
		this.roomname = roomname;
	}
	public void sethasitem (boolean hasitem){
		this.hasitem = hasitem;
	}
	public void setvisited (boolean visited){
		this.visited = visited;		
	}
}
