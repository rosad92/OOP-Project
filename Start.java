import java.util.Scanner;

public class Start{
	public static void main(String[] args) {
		System.out.println("Mission Home");
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name= input.next();
		input.close();
		

		System.out.println("*CRASH* You're an astronaut on the Akash Space Station (A.S.S)"
				+ "and It has crashed on an unknown planet. Your ship is "
				+ "damaged. Your new mission, collect the items around the"
				+ "ship and planet to fix the A.S.S and get back home.");
		System.out.println("Hello Commander, " + " "+ name +" "+ " Let's go home");
		}
	}

