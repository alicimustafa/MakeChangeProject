import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		runRegister(keyboard);
	}
	
	public static void runRegister(Scanner keyboard) {
		System.out.println("Please enter the price of item: ");
		int priceInpennies = getInputFromUser(keyboard);
		System.out.println((priceInpennies / 100.0));
	}
	
	public static int getInputFromUser(Scanner keyboard) {
		double input = keyboard.nextDouble();
		return (int)(input * 100);
	}
	
	public static int figureHowMuchOfEach(int total, int dem) {
		
		return 0;
	}
	
	

}
