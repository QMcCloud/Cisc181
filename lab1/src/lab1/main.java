package lab1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) 
	{
		String[] filingStatus = {"SINGLE","HEAD","JOINT","SEPARATELY"};     //Sets up an array of possible filing statuses to be printed later.
		double[] rates = {0.37, 0.35, 0.32, 0.24, 0.22, 0.12, 0.10};     //Sets up an array of income rates based on each of the brackets provided.
		double[] incomeList = null;     //Initializes the array variable incomeList but sets no values to it yet (done in a later step). The null value is used to initiate and exit the later while loop.
		double tax = 0;     //Declares and initializes the amount of tax to be paid as zero because the amount is going to be added later.
		Scanner sc = new Scanner(System.in);     //Initializes a scanner reference variable to use later to get user input on filing status
		
		while(incomeList == null) {
			System.out.println("Are you Filing as");
			for (String statuses : filingStatus) System.out.println("<" + statuses +"> ");     //Prints each of the filing statuses in the array filingStatus on its own line surrounded by <>.
			System.out.println("Please enter an option without the <>");
			String Status = sc.nextLine();     //Gathers user input about filing status.
			
			switch(Status)     //Based on the entered filing status the incomeList is assigned a list of incomes associated with each tax bracket.
			{
				case "SINGLE":
					incomeList = new double[]{510300,204100,160725,84200,39475,9700,0};     //The 0 is included for when the user's income is lower than the lowest nonzero tax bracket.
					break;
				case "HEAD":
					incomeList = new double[]{510300,204100,160700,84200,52850,13850,0};
					break;
				case "JOINT":
					incomeList = new double[]{612350,408200,321450,168400,78950,19400,0};
					break;
				case "SEPARATELY":
					incomeList = new double[]{306175,204100,160725,84200,39475,9700,0};
					break;
				default:
					System.out.println("INVALID INPUT. TRY AGAIN.");     //In the event that there was a typo or something it says the input didn't work and asks the user to try again.
					break;
			}
		}
		System.out.println("Please enter your income");
		double userIncome = sc.nextDouble();     //Sets the income to whatever the user enters.
		
		for(int i = 0; i< rates.length; i++) {     //Sets up a for loop to go through each of the indices in the array incomeList.
			if (userIncome >= incomeList[i]) {
				tax += (userIncome - incomeList[i]) * rates[i];
				/*
				 * If the income of the user is greater than the value indicated by the number at index i of incomeList (which is organized from highest to lowest)
				 * It takes the difference of the given income and the value at i in incomeList and multiplies it by the corresponding tax rate from the array rates.
				 * It then adds that value to the total taxes the user needs to pay.
				 * If it isn't, it goes to the next highest value in incomeList and compares the two values again.
				 */
				userIncome = incomeList[i];     //Because of the subtraction in line 41, the remainder will always be one of the given tax brackets.
			}
		}
		System.out.println("Your income tax should be: $" + tax);     //Displays the appropriate amount of taxes the user must pay to the screen.
		sc.close();
	}
	
}


