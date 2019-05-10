
public class Adventure {
	private Room [] map;
	private int currentLocation;
	String nextLine= "/n";
	private Player spaceMan;
	public Adventure(String name){
		currentLocation=0;
		map = new Room[10];
		map[0]= new Room("Command Center");
		map[1]= new Room ("Sleeping Quarters");
		map[2]= new Room ("Communal Area");
		map[3]= new Room ("Cargo Bay");
		map[4]= new Room ("Engine Room");
		map[5]= new Room("Air-Lock");
		map[6]= new Room("Crater");
		map[7]= new Room("Dunes");
		map[8]= new Room("Cave");
		map[9]= new Room("Shelter");
		
		spaceMan = new Player(name);
		}
		
// 1 is north, 2 is east		
// 3 is south, 4 is west		

		public void printLocation()
		{
			for(int i=0; i<10; i++);
			{
				System.out.println("----------------------------------------------------------------------");
			}
		}
		
		
		public void move (int m){
			if (currentLocation==0){ // Command Center
				if(m==1){
					System.out.println("You've entered the Sleeping Quarters." +nextLine
					+ "I think I see a space helmet and flashlight in the distance.");
					currentLocation=1;
				}
				else if (m==2){
					System.out.println("You've entered the Cargo Bay." +nextLine
					+ "I see food and the shuttle's wing! Pick it up!");
					currentLocation=3;
				}
				else{
					System.out.println("You've entered an invalid entry, please try again. 1");
					currentLocation=0;
				}
			}
					
			else if (currentLocation==1){ //Sleeping Quarters
				if(m==1){
					System.out.println("You've entered an invalid entry, please try again.2");
				currentLocation=1;
				}
				else if (m==2){
					System.out.println("You've entered the Communal Area." +nextLine + "I see a chest piece and more food, let's go get it.");
					currentLocation=2;
				}
				else if (m==3){
					System.out.println("You've entered the Command Center." +nextLine + "All items collected, explore around more.");
				currentLocation=3;
				}		
				else if (m==4){
					System.out.println("You've entered an invalid entry, please try again.3");
					currentLocation=1;
				}
			}
			else if (currentLocation==2){ // Communal Area
				if(m==1){
					System.out.println("You've entered an invalid entry, please try again.4");
					currentLocation=2;	
				}
				else if (m==2){
					System.out.println("You've entered the Engine Room. Look there over there, fuel!");
					currentLocation=4;
				}
				else if (m==3){
					System.out.println("You've entered the Sleeping Quarters. All items found, go explore elsewhere.");
					currentLocation=1;
				}
				else if (m==4){
					System.out.println("You've entered the cargo bay."+nextLine +
					"I see food and the shuttle's wing! Pick it up!");
					currentLocation=3;
				}
			}
			else if (currentLocation==3){ // Cargo Bay
				if(m==1){
					System.out.println("You've entered the Communal Area." +nextLine + "I see a chest piece and more food, let's go get it.");
					currentLocation=2;}
				else if (m==2){
					System.out.println("You've entered the Air-Lock."+nextLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentLocation=5;
				}
			else if (m==3){
				System.out.println("You've entered the Command Center."+nextLine
					+ "you've already been here! Explore elsewhere!");
				currentLocation=0;
				}
			else if (m==4){
				System.out.println("You've entered an invalid entry, please try again.5");
				currentLocation=3;
				}
			}
				
			else if (currentLocation==4){ // Engine Room
				if(m==1){
				System.out.println("You've entered an invalid command, try again.6");
				currentLocation=4;}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.7");
				currentLocation=4;}
			else if (m==3){		
				System.out.println("You've entered the Air-Lock."+nextLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentLocation=5;}
			else if (m==4){
				System.out.println("You've entered the Communal Area." +nextLine +"I see a chest piece and more food, let's go get it.");
				currentLocation=2;}
			}
					
			else if (currentLocation==5){ // Air-Lock
				if(m==1){
				System.out.println("You've entered the Engine Room. Look there over there, fuel!");
				currentLocation=4;}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.8");
				currentLocation=5;}
			else if (m==3){
				System.out.println("Leaving Space Ship" +nextLine
						  +"Welcome to the Crater, I see a landing gear and tools!");
				currentLocation=6;}
			else if (m==4){
				System.out.println("You've entered the cargo bay."+nextLine
					+ "I see food and the shuttle's wing! Pick it up!");
				currentLocation=3;}
			}
					
			else if (currentLocation==6){ // Crater
				if(m==1){
				System.out.println("You've entered the Dunes, I see a tool and the landing gear!");
				currentLocation=7;}		
			else if(m==2){
				System.out.println("You've entered the shelter, I see fuel and food!");
				currentLocation=9;}
			else if(m==3){
				System.out.println("You've entered the Air-Lock."+nextLine
					+ "I see the rest of the space suit, suit up before you suffocate.");
				currentLocation=5;}
			else if(m==4){
				System.out.println("Invalid entry, please try again.9");
				currentLocation=6;}
		}
		else if (currentLocation==7){ // Dunes
				if(m==1){
				System.out.println("Invalid entry, please try again10");
				currentLocation=7;}
			else if(m==2){
				System.out.println("You've entered the Cave, I spot a Tool and the Wheel!");
				currentLocation=8;}
			else if(m==3){
				System.out.println("Invalid entry, please try again.11");
				currentLocation=7;}
			else if(m==4){
				System.out.println("Welcome to the Crater, I see a landing gear and tools!");
				currentLocation=6;}
		}

		else if (currentLocation==8){ // Cave
				if(m==1){
				System.out.println("Invalid entry, please try again");
				currentLocation=8;}
			else if(m==2){
				System.out.println("Invalid entry, please try again");
				currentLocation=8;}
			else if(m==3){
				System.out.println("You've enther the Shelter, I see fuel and food in the distance!");
				currentLocation=9;}
			else if(m==4){
				System.out.println("You've entered the Dunes, I see a tool and the landing gear!");
				currentLocation=7;}
		}
		else if (currentLocation==9){ // Shelter
				if(m==1){
				System.out.println("You've entered the Cave, I spot a Tool and the Wheel!");
				currentLocation=8;}
			else if(m==2){
				System.out.println("Invalid entry, please try again.");
				currentLocation=9;}
			else if(m==3){
				System.out.println("Invalid entry, please try again.");
				currentLocation=8;}
			else if(m==4){
				System.out.println("Welcome to the Crater, I see a landing gear and tools!");
				currentLocation=6;}
		}
	}
	public void pickup(){
		if (currentLocation == 0){
			spaceMan.getItem(0).pickup();
		}
		else if (currentLocation ==1){
			spaceMan.getItem(1).pickup();
			spaceMan.getItem(2).pickup();
		}
		else if(currentLocation ==2){
			spaceMan.getItem(3).pickup();
			spaceMan.getItem(4).pickup();
		}
		else if(currentLocation ==3){
			spaceMan.getItem(5).pickup();
			spaceMan.getItem(6).pickup();
		}
		else if(currentLocation ==4){
			spaceMan.getItem(7).pickup();
		}
		else if(currentLocation ==5){
			spaceMan.getItem(8).pickup();
		}
		else if(currentLocation ==6){
			spaceMan.getItem(9).pickup();
			spaceMan.getItem(10).pickup();
		}
		else if(currentLocation ==7){
			spaceMan.getItem(11).pickup();
			spaceMan.getItem(12).pickup();
		}
		else if(currentLocation ==8){
			spaceMan.getItem(13).pickup();
			spaceMan.getItem(14).pickup();
		}
		else if(currentLocation ==9){
			spaceMan.getItem(15).pickup();
			spaceMan.getItem(16).pickup();
		}
	}
	public int getLocation(){
		return currentLocation;
	}
	public Player getPlayer(){
		return spaceMan;
	}
}
