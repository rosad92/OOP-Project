import java.util.Scanner;

public class Start{
	public static void main(String[] args) {
		boolean alive = true;
		System.out.println("Mission Home");
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name= input.next();
		Adventure adventure= new Adventure(name);
		
		

		System.out.println("*CRASH* You're an astronaut on the Akash Space Station (AK.S.S)"
				+ "and It has crashed on an unknown planet. Your ship is "
				+ "damaged. Your new mission, collect the items around the"
				+ "ship and planet to fix the AK.S.S and get back home.");
		System.out.println("Hello Commander, " + " "+ name +" "+ " Let's go home");
		String newLine = System.getProperty("line.separator");
		System.out.println("---------------------------------------------------------------" +newLine);
		System.out.println("Welcome to the AK.S.S Commander. Upon impact we have lost multiple items vital"
				+ newLine
				+" to our ship such as, tools, fuel"
				+ "food, spacesuit parts, ship parts and flashlights."
				+ newLine	+"Your mission is to gather the missing parts from the ship"+ newLine
				+ "and the planet and return them to the AK.S.S to use to get us home.");
		

		//print about starting room
		adventure.printStart();
		
		do{
			String command = input.next();
			switch(command){
			case("pickup"):
				//pickup for the items in the room
				adventure.pickup();
				break;
			case("north"):
				adventure.move(1);
				//go north
				break;
			case("south"):
				if( adventure.getLocation()==5){
					if( adventure.getPlayer().getItem(2).getHas()==false || adventure.getPlayer().getItem(3).getHas()==false ||
							adventure.getPlayer().getItem(8).getHas()==false){
						System.out.println("You have entered the planet without a space suit or flashlight! The AK.S.S. remains stuck on the planet for" + newLine
		   + "the next brave astronaut to try again.");
					   alive=false;
					}
					else{
						adventure.move(3);
					}
				} else{
				adventure.move(3);
				//south
				}
				break;
			case("east"):
				adventure.move(2);
				//east
				break;
			case("west"):
				adventure.move(4);
				//west
			case ("look"):
				// look
				break;
			case ("blastoff"):
				//leave
				if(adventure.getPlayer().getItem(9).getHas()==true &&adventure.getPlayer().getItem(5).getHas()== true&&adventure.getPlayer().getItem(12).getHas()== true&&adventure.getPlayer().getItem(13).getHas() == true ){
					System.out.println("Congrats you've saved us all. Now go home and tell your story." + newLine
							   + "See you soon Commander.");
						alive= false;
				}
				else{
					System.out.println("You haven't repaired your ship yet, you can't leave!");
				}
				
				break;
			default:
				System.out.print("That is not a valid command");
			}
				
			
			
			}while (alive == true);
			
		input.close();	
		}
}
	

