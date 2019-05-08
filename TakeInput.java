import java.util.Scanner;

public class TakeInput {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mission Home");
		System.out.println("Please enter your name");
		String name= sc.nextLine();
		System.out.println("Hello Commander" + name);
		sc.close();
		

		System.out.println("*CRASH* You're an astronaut on the Akash Space Station (A.S.S)"
				+ "and It has crashed on an unknown planet. Your ship is "
				+ "damaged. Your new mission, collect the items around the"
				+ "ship and planet to fix the A.S.S and get back home.");
		Scanner a= new Scanner(System.in);
		System.out.println("Hello Commander" + name+ "Let's get home"
				+"Enter 'Start' to begin the game");
		String StartGame= a.nextLine();
		if(StartGame=="Start") {
			System.out.println("Gald to have your help Commander");
			a.close();
		}
	}
}
