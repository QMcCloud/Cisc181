package lab1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) 
	{
		String[] filingStatus = {"SINGLE","HEAD","JOINT"};
		double[] rates = {0.37, 0.35, 0.32, 0.24, 0.22, 0.12, 0.10};
		double[] incomeList = null;
		double tax = 0;
		boolean statusNotEntered = true;
		Scanner sc = new Scanner(System.in);
		
		while(statusNotEntered) {
			System.out.println("Are you Filing as");
			for (String statuses : filingStatus) System.out.println("<" + statuses +"> ");
			System.out.println("Please enter an option without the <>");
			String Status = sc.nextLine();
			
			switch(Status) 
			{
				case "SINGLE":
					incomeList = new double[]{510300,204100,160725,84200,39475,9700,0};
					statusNotEntered = false;
					break;
				case "HEAD":
					incomeList = new double[]{510300,204100,160725,84200,52850,13850,0};
					statusNotEntered = false;
					break;
				case "JOINT":
					incomeList = new double[]{612350,408200,321450,168400,78950,19400,0};
					statusNotEntered = false;
					break;
				default:
					break;
			}
		}
		System.out.println("Please enter your income");
		double userIncome = sc.nextDouble();
		
		for(int i = 0; i< rates.length; i++) {
			if (userIncome >= incomeList[i]) {
				tax += (userIncome - incomeList[i]) * rates[i];
				userIncome = incomeList[i];
			}
		}
		System.out.println("Your income tax should be: " + tax);
	}
}
