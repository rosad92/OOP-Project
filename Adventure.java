
public class Adventure {
	private Room [] map;
	private int currentLocation;
	String nextLine= "\n";
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
					currentLocation=1;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(1).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(1).getName() + " and a " + spaceMan.getItem(2).getName());
					}

				}
				else if (m==2){
					currentLocation=3;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(5).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(5).getName() + " and a " + spaceMan.getItem(6).getName());
					}
				
				}
				else{
					currentLocation=0;
					System.out.println("You've entered an invalid entry, please try again. ");
				}
			}
					
			else if (currentLocation==1){ //Sleeping Quarters
				if(m==1){
					currentLocation=1;
					System.out.println("You've entered an invalid entry, please try again.");
				}
				else if (m==2){
					currentLocation=2;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(3).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(3).getName() + " and a " + spaceMan.getItem(4).getName());
					}
				
				}
				else if (m==3){
					currentLocation=0;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(0).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(0).getName() );
					}
							
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
					currentLocation=4;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(7).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(7).getName());
					}
				
				}
				else if (m==3){
					currentLocation=3;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(1).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(5).getName() + " and a " + spaceMan.getItem(6).getName());
					}
				
				}
				else if (m==4){
					currentLocation=1;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(5).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(5).getName() + " and a " + spaceMan.getItem(6).getName());
					}
				
				}
			}
			else if (currentLocation==3){ // Cargo Bay
				if(m==1){
					currentLocation=2;
					System.out.println("You've entered the " + map[currentLocation].getroomname());
					if(spaceMan.getItem(3).getHas()==false){
						System.out.println("There is a " + spaceMan.getItem(3).getName() + " and a " + spaceMan.getItem(4).getName());
					}
					
				}
				else if (m==2){
				currentLocation=5;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(8).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(8).getName());
				}
			
				}
			else if (m==4){
				currentLocation=0;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(0).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(0).getName());
				}
			
				}
			else if (m==3){
				System.out.println("You've entered an invalid entry, please try again.");
				currentLocation=3;
				}
			}
				
			else if (currentLocation==4){ // Engine Room
				if(m==1){
				System.out.println("You've entered an invalid command, try again.");
				currentLocation=4;}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.");
				currentLocation=4;}
			else if (m==3){		
				currentLocation=5;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(8).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(8).getName());
				}
			
				}
			else if (m==4){
				currentLocation=2;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(3).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(3).getName() + " and a " + spaceMan.getItem(4).getName());
				}
				
			}
			}
					
			else if (currentLocation==5){ // Air-Lock
				if(m==1){
				currentLocation=4;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(8).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(8).getName() );
				}
			}
			else if (m==2){
				System.out.println("You've entered an invalid command, try again.");
				currentLocation=5;}
			else if (m==3){
				System.out.println("Leaving Space Ship");
				currentLocation=6;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(9).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(9).getName() + " and a " + spaceMan.getItem(10).getName());
				}
			}
			else if (m==4){
				currentLocation=3;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(5).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(5).getName() + " and a " + spaceMan.getItem(6).getName());
				}
				
			}
			}
					
			else if (currentLocation==6){ // Crater
				if(m==1){
				currentLocation=7;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(11).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(11).getName() + " and a " + spaceMan.getItem(12).getName());
				}
			
				}		
			else if(m==2){
				currentLocation=9;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(15).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(15).getName() + " and a " + spaceMan.getItem(16).getName());
				}
				
			}
			else if(m==3){
				currentLocation=5;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(8).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(8).getName());
				}
				
			}
			else if(m==4){
				System.out.println("Invalid entry, please try again.");
				currentLocation=6;}
		}
		else if (currentLocation==7){ // Dunes
				if(m==1){
				System.out.println("Invalid entry, please try again");
				currentLocation=7;}
			else if(m==2){
				currentLocation=8;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(13).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(13).getName() + " and a " + spaceMan.getItem(14).getName());
				}
			}
			else if(m==4){
				System.out.println("Invalid entry, please try again.");
				currentLocation=7;
				}
			else if(m==3){
				currentLocation=6;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(9).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(9).getName() + " and a " + spaceMan.getItem(10).getName());
				}
				
			}
		}

		else if (currentLocation==8){ // Cave
				if(m==1){
				System.out.println("Invalid entry, please try again");
				currentLocation=8;}
			else if(m==2){
				System.out.println("Invalid entry, please try again");
				currentLocation=8;}
			else if(m==3){
				currentLocation=9;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(15).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(15).getName() + " and a " + spaceMan.getItem(16).getName());
				}
				
			}
			else if(m==4){
				currentLocation=7;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(11).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(11).getName() + " and a " + spaceMan.getItem(12).getName());
				}
				
			}
		}
		else if (currentLocation==9){ // Shelter
				if(m==1){
				currentLocation=8;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(13).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(13).getName() + " and a " + spaceMan.getItem(14).getName());
				}
			
				}
			else if(m==2){
				System.out.println("Invalid entry, please try again.");
				currentLocation=9;}
			else if(m==3){
				System.out.println("Invalid entry, please try again.");
				currentLocation=8;}
			else if(m==4){
				currentLocation=6;
				System.out.println("You've entered the " + map[currentLocation].getroomname());
				if(spaceMan.getItem(9).getHas()==false){
					System.out.println("There is a " + spaceMan.getItem(9).getName() + " and a " + spaceMan.getItem(10).getName());
				}
				
			}
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
	public void printStart(){
		System.out.println("You've entered the " + map[0].getroomname());
		if(spaceMan.getItem(0).getHas()==false){
			System.out.println("There is a " + spaceMan.getItem(0).getName());
		}
	}

}
