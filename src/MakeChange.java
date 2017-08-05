import java.util.Scanner;

/**
 * @author mustafaalici
 *
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		runRegister(keyboard);
	}
	
	/**
	 * @param keyboard
	 */
	public static void runRegister(Scanner keyboard) {

		System.out.print("Please enter the price of item: ");
		int priceInPennies = getInputFromUser(keyboard);
		//System.out.println((priceInPennies / 100.0));
		System.out.print("How much money do want to give me: ");
		int moneyInPennies = getInputFromUser(keyboard);
		//System.out.println(moneyInPennies / 100.0);
		while(priceInPennies > moneyInPennies) {
			System.out.println("Hey budy this aint a cherity you need enuf money to pay for it");
			System.out.print("Give me the correct amount: ");
			moneyInPennies = getInputFromUser(keyboard);
		}
		int changeInPennies = moneyInPennies - priceInPennies;
		//System.out.println("money: " + moneyInPennies + " price: " + priceInPennies + " change : " + changeInPennies);
		if(changeInPennies == 0) {
			System.out.println("You have don't have any change");
		} else {
			displayChange(changeInPennies);
		}
		System.out.println("Thank you for shopping at S mart");
	}
	
	/**
	 * @param keyboard
	 * @return
	 */
	public static int getInputFromUser(Scanner keyboard) {
		double input = keyboard.nextDouble();
		return (int)(input * 100);
	}
	
	public static void displayChange(int change) {
		System.out.println("your change " + (change/100.0));
	}
	
	public static int figureHowMuchOfEach(int total, int dem) {
		
		return 0;
	}
	
	

}
