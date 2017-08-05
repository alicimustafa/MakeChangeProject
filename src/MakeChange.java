import java.util.Scanner;

/**
 * this class take cost and amount Tendered
 * and return proper change
 * @author mustafaalici
 *
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		runRegister(keyboard);
	}
	
	/**
	 * this method runs the register. 
	 * @param keyboard
	 */
	public static void runRegister(Scanner keyboard) {

		System.out.print("Amount: ");// ask for price
		int priceInPennies = getInputFromUser(keyboard);
		System.out.print("Tendered: ");// ask for amount Tendered
		int moneyInPennies = getInputFromUser(keyboard);
		if(priceInPennies > moneyInPennies) { // checks to see if amount Tendered is less then cost
			System.out.println("Hey budy you need enough money to pay for it");
		} else {
			int changeInPennies = moneyInPennies - priceInPennies;
			if(changeInPennies == 0) { // checks to see if there no change left
				System.out.print("You have don't have any change");
			} else {
				figureOutChange(changeInPennies); // runs the method that figures change and displays them 
			}
		}
	}
	
	/**
	 * get input from user as a double and formats it to int in pennies
	 * 
	 * @param keyboard
	 * @return
	 */
	public static int getInputFromUser(Scanner keyboard) {
		double input = keyboard.nextDouble(); //takes in a double
		return (int)(input * 100);  // converts doller to pennies cast it to int and returns it
	}
	
	/**
	 * @param change
	 */
	public static void figureOutChange(int change) {
		int howMany;
		int[] money = {20_00, 10_00, 5_00, 1_00, 25, 10, 5, 1}; // array of denomination
		System.out.println("Your change is :");
		for(double dem: money) { // iterates through money array 
			howMany = change / (int)dem; // checks to see how much of ech denomination there is
			change = change % (int)dem; // figures out the left over change
			if( howMany == 0) { //if there is 0 of this denomination it skips it
				continue;
			}
			System.out.print((dem/100) + ": " + howMany + " "); // displays change amount for each denomination
			if(change == 0) { // check to see if it runs out of change if so leaves the loop
				break;
			}
		}
	}
	
	public static void displayChange(int index, int amount) {
		// 2d array with outer array denomination and inner single or plural
		String[][] moneyNames = {{" twenty dollar bill", " twenty dollar bills"}, 
								{" ten dollar bill", " ten dollar bills"},
								{" five dollar bill", " five dollar bills"},
								{" one dollar bill", " one dollar bills"},
								{" quarter", " quarters"},
								{" dime", " dimes"},
								{" nickel", " nickels"},
								{" penny", " pennies"}};
		int s = amount > 1 ? 1 : 0; //determines if displaying single or plural name
		System.out.println(amount + moneyNames[index][s]);
		
	}

}
