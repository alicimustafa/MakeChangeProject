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
		System.out.print("How much money do want to give me: ");
		int moneyInPennies = getInputFromUser(keyboard);
		while(priceInPennies > moneyInPennies) {
			System.out.println("Hey budy this aint a cherity you need enuf money to pay for it");
			System.out.print("Give me the correct amount: ");
			moneyInPennies = getInputFromUser(keyboard);
		}
		int changeInPennies = moneyInPennies - priceInPennies;
		if(changeInPennies == 0) {
			System.out.print("You have don't have any change");
		} else {
			displayChange(changeInPennies);
		}
		System.out.println("\nThank you for shopping at S mart");
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
		int howMany;
		double[] money = {20_00.0, 10_00.0, 5_00.0, 1_00.0, 25.0, 10.0, 5.0, 1.0};
		System.out.println("Your change is :");
		for(double dem: money) {
			howMany = change / (int)dem;
			change = change % (int)dem;
			if( howMany == 0) {
				continue;
			}
			System.out.print((dem/100) + ": " + howMany + " ");
			if(change == 0) {
				break;
			}
		}
	    howMany = change / 20_00;
	}
	
	

}
