import java.util.Scanner;

public class Start{
	public static void main(String[] args) {
		boolean alive = true;
		System.out.println("Mission Home");
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name= input.next();
	
		

		System.out.println("*CRASH* You're an astronaut on the Akash Space Station (A.S.S)"
				+ "and It has crashed on an unknown planet. Your ship is "
				+ "damaged. Your new mission, collect the items around the"
				+ "ship and planet to fix the A.S.S and get back home.");
		System.out.println("Hello Commander, " + " "+ name +" "+ " Let's go home");
		String newLine = System.getProperty("line.separator");
		System.out.println("---------------------------------------------------------------" +newLine);
		System.out.println("Welcome to the A.S.S Commander. Upon impact we have lost multiple items vital"
				+ newLine
				+" to our ship such as, tools, fuel"
				+ "food, spacesuit parts, ship parts and flashlights."
				+ newLine	+"Your mission is to gather the missing parts from the ship"+ newLine
				+ "and the planet and return them to the A.S.S to use to get us home.");
		

		//print about starting room
		
		do{
			String command = input.next();
			switch(command){
			case("pickup"):
				//pickup for the items in the room
				break;
			case("north"):
				//go north
				break;
			case("south"):
				//south
				break;
			case("east"):
				//east
				break;
			case("west"):
				//west
				break;
			case("use"):
				//use
				break;
			case ("look"):
				// look
				break;
			case ("blast off"):
				//leave
				break;
			default:
				System.out.print("That is not a valid command");
			}
				
			
			
			}while (alive == true);
			
		input.close();	
		}
}
	

