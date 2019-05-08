
public class Adventure {
	private Room [] map;
	Adventure(){
		map = new Room[10];
		//the rest of this constructor will fill out the specifics of all of the rooms in the array
	}
	public Room getLocation(int location){
		return map[location];
		// this should return the specific room so you can call methods from the Room class
	}
	
}
