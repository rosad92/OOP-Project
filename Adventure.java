
public class Adventure {
	private Room [] map;
	Adventure(){
		int currentLocation=0;
		map = new Room[10];
		public void Rooms(){
		map[0]= "Command Center";
		map[1]= "Sleeping Quarters";
		map[2]= "Communal Area";
		map[3]= "Cargo Bay"
		map[4]= "Engine Room";
		map[5]= "Air-Lock";
		map[6]= "Crater";
		map[7]= "Dunes";
		map[8]= "Cave";
		map[9]= "Shelter";
		}
		
// 1 is north, 2 is east		
// 3 is south, 4 is west		

		public void printLocation()
		{
			for(int i=0; i<10; i++);
			{
				System.out.println("----------------------------------------------------------------------");
			}
			String newLine = System.getProperty("line.separator");
			public void move (int m)
			{
				if (currentLocation==0) // Command Center
				{
					if(m==1){
					System.out.println("You've entered the Sleeping Quarters." +newLine
					+ "I think I see a space helmet and flashlight in the distance.");
				currentlocation=1;}
			else if (m==2)
			{
			System.out.println("You've entered the Cargo Bay." +newLine
					+ "I see food and the shuttle's wing! Pick it up!");
				currentlocation=3;
			}
			else if (m==3){
				System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=0;
			}
				else if (m==4){
				System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=0;
				}
					
			else if (currentLocation==1){ //Sleeping Quarters
				if(m==1){
					System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=1;}
				
			else if (m==2){
				System.out.println("You've entered the Communal Area." +nextLine "I see a chest piece and more food, let's go get it.");
				currentlocation=2;
				}
			else if (m==3){
				System.out.println("You've entered the Command Center." +nextLine "All items collected, explore around more.");
				currentlocation=3;
				}		
			else if (m==4){
				System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=1;
				}
			
			else if (currentLocation==2){ // Communal Area
				if(m==1)
				System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=2;
				}
			else if (m==2){
				System.out.println("You've entered the Engine Room. Look there over there, fuel!");
				currentlocation=4;
				}
			else if (m==3){
				System.out.println("You've entered the Sleeping Quarters. All items found, go explore elsewhere.");
				currentlocation=1;
				}
			else if (m==4){
				System.out.println("You've entered the cargo bay."+newLine
					+ "I see food and the shuttle's wing! Pick it up!");
				currentlocation=3;
				}
			else if (currentLocation==3){ // Cargo Bay
				if(m==1)
				System.out.println("You've entered the Communal Area." +nextLine "I see a chest piece and more food, let's go get it.");
				currentlocation=2;}
			else if (m==2){
				System.out.println("You've entered the Air-Lock."+newLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentlocation=5;
				}
			else if (m==3){
				System.out.println("You've entered the Command Center."+newLine
					+ "you've already been here! Explore elsewhere!");
				currentlocation=0;
				}
			else if (m==4){
				System.out.println("You've entered an invalid entry, please try again.");
				currentlocation=3;
				}
				
			else if (currentLocation==4){ // Engine Room
				if(m==1)
				System.out.println("You've entered an invalid command, try again.");
				currentlocation=4;}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.");
				currentlocation=4;}
				}
			else if (m==3){		
				System.out.println("You've entered the Air-Lock."+newLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentlocation=5;}
			else if (m==4){
				System.out.println("You've entered the Communal Area." +nextLine "I see a chest piece and more food, let's go get it.");
				currentlocation=2;}
					
			else if (currentLocation==5){ // Air-Lock
				if(m==1)
				System.out.println("You've entered the Engine Room. Look there over there, fuel!");
				currentlocation=4;}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.");
				currentlocation=5;}
			else if (m==3){
				System.out.println("Leaving Space Ship" +nextLine
						  +"Welcome to the Crater, I see a landing gear and tools!");
				currentlocation=6;}
			else if (m==4){
				System.out.println("You've entered the cargo bay."+newLine
					+ "I see food and the shuttle's wing! Pick it up!");
				currentlocation=3;}
					
			else if (currentLocation==6){ // Crater
				if(m==1)
				System.out.println("You've entered the Dunes, I see a tool and the landing gear!");
				currentlocation=7;}		
			else if(m==2)
				System.out.println("You've entered the shelter, I see fuel and food!");
				currentlocation=9;}
			else if(m==3)
				System.out.println("You've entered the Air-Lock."+newLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentlocation=5;}
			else if(m==4)
				System.out.println("Invalid entry, please try again.");
				currentlocation=6;}
		
		else if (currentLocation==7){ // Dunes
				if(m==1)
				System.out.println("Invalid entry, please try again");
				currentlocation=7;}
			else if(m==2)
				System.out.println("You've entered the Cave, I spot a Tool and the Wheel!");
				currentlocation=8;}
			else if(m==3)
				System.out.println("Invalid entry, please try again.");
				currentlocation=7;}
			else if(m==4)
				System.out.println("Welcome to the Crater, I see a landing gear and tools!");
				currentlocation=6;}

		else if (currentLocation==8){ // Cave
				if(m==1)
				System.out.println("Invalid entry, please try again");
				currentlocation=8;}
			else if(m==2)
				System.out.println("Invalid entry, please try again");
				currentlocation=8;}
			else if(m==3)
				System.out.println("You've enther the Shelter, I see fuel and food in the distance!");
				currentlocation=9;}
			else if(m==4)
				System.out.println("You've entered the Dunes, I see a tool and the landing gear!");
				currentlocation=7;}

		else if (currentLocation==7){ // Shelter
				if(m==1)
				System.out.println("You've entered the Cave, I spot a Tool and the Wheel!");
				currentlocation=8;}
			else if(m==2)
				System.out.println("Invalid entry, please try again.");
				currentlocation=9;}
			else if(m==3)
				System.out.println("Invalid entry, please try again.");
				currentlocation=8;}
			else if(m==4)
				System.out.println("Welcome to the Crater, I see a landing gear and tools!");
				currentlocation=6;}

		//the rest of this constructor will fill out the specifics of all of the rooms in the array
	}
	public Room getLocation(int location){
		return map[location];
		// this should return the specific room so you can call methods from the Room class
	}
	
}
