import java.util.Scanner;
import java.text.DecimalFormat;

public class PaintWizard {
	private static Scanner sc;

	public static void main(String[] args) {
		

		Prices obj = new Prices();

		obj.setCheapo(19.99);
		obj.setAverage(17.99);
		obj.setDuluxourous(25);
		
		// roomsize1 -> CheapoMax, roomsize2 -> AverageJoes, roomsize3 -> DuluxourousPaints
		int roomsize1 = 10;
		int roomsize2 = 11;
		int roomsize3 = 20;
		
		int CheapoMaxLitre = 20;
		int AverageJoesLitre = 15;
		int DuluxourousPaintsLitre = 10;
		
		String CheapoMax = "CheapoMax";
		String AverageJoes = "AverageJoes";
		String DuluxourousPaints = "DuluxourousPaints";
		
		// Decimal formats (dfm2 = two decimal places, dfm3 = three decimal places
		DecimalFormat dfm2 = new DecimalFormat(".##");
		DecimalFormat dfm3 = new DecimalFormat(".###");
		
		/* FINDING OUT HOW MANY LITRE IS 1 CAN **/
		// m2lC= m2 * millilitre value of CheapoMax
		double m2lC = roomsize1 * CheapoMaxLitre;
		// m2lC= m2 * millilitre value of AverageJoes
		double m2lA = roomsize2 * AverageJoesLitre;
		// m2lC= m2 * millilitre value of DuluxourousPaints
		double m2lD = roomsize3 * DuluxourousPaintsLitre;
		
		
		// Scanner (asks for user input)
		System.out.println("Enter a number the amount of area that needs to be painted (m2): ");	
		sc = new Scanner(System.in);
				
		double m2 = sc.nextInt();
		System.out.println("You entered: " + m2 + " m2\n"); // prints out user input in m2
		/* -------------------------------------------------------------------------- 
		 -------------------------------------------------------------------------- */
		// The total price of CheapoMax
		double buyC = m2/m2lC;
		double tinC = Math.ceil(buyC); // round up value
		int intTinC = (int) tinC;  // casting double to integer value
		int litreC = intTinC * CheapoMaxLitre;
		
		System.out.println("Litres: " + litreC + "L");
		
		
		double totalpriceC = tinC * obj.getCheapo();
		System.out.println("The total price of Cheapomax: " + "£" + dfm2.format(totalpriceC));
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		// Calculating the waste (CheapoMax)
		double wasteC = tinC - buyC; // Counts it in cans
		double litreWasteC = wasteC * CheapoMaxLitre; // Counts it in litres
		System.out.println("The Cheapomax waste would be: " + dfm3.format(litreWasteC) + "L" + "\n");
		
		
		/* -------------------------------------------------------------------------- 
		 -------------------------------------------------------------------------- */
		// The total price of AverageJoes
		double buyA = m2/m2lA;
		double tinA = Math.ceil(buyA);
		int intTinA = (int) tinA;
		int litreA = intTinA * AverageJoesLitre;
		System.out.println("Litres: " + litreA + "L");
		
		double totalpriceA = tinC * obj.getAverage();
		System.out.println("The total price of Average Joes: " + "£" + dfm2.format(totalpriceA));		
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		// Calculating the waste (AverageJoes)
		double wasteA = tinA - buyA;
		double litreWasteA = wasteA * CheapoMaxLitre;
		System.out.println("The AverageJoes waste would be: " + dfm3.format(litreWasteA ) + "L" + "\n");		
				
		
		/* -------------------------------------------------------------------------- 
		 -------------------------------------------------------------------------- */
		// The total price of DuluxourousPaints
		double buyD = m2/m2lD;
		double tinD = Math.ceil(buyD);
		int intTinD = (int) tinD;
		int litreD = intTinD * DuluxourousPaintsLitre;
		System.out.println("Litres: " + litreD + "L");
		
		double totalpriceD = tinD * obj.getDuluxourous();
		System.out.println("The total price of Duluxourous Paints: " + "£" + dfm2.format(totalpriceD));
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		// Calculating the waste (DuluxourousPaints)
		double wasteD = tinD - buyD;
		double litreWasteD = wasteD * CheapoMaxLitre;
		System.out.println("The DuluxourousPaints waste would be: " + dfm3.format(litreWasteD) + "L" + "\n");

		System.out.println("---------------------------------------------------------\n");
		
		
		if ((litreWasteC < litreWasteA) && (litreWasteC < litreWasteD)) {
			System.out.println("The one which wastes the least: " + CheapoMax);
		} else if ((litreWasteA < litreWasteC) && (litreWasteA < litreWasteD)) {
			System.out.println("The one which wastes the least: " + AverageJoes);
		} else if ((litreWasteD < litreWasteC) && (litreWasteD < litreWasteA)) {
			System.out.println("The one which wastes the least: " + DuluxourousPaints);
		} else {
			System.out.println("None of them waste the least. In other words, at least two of them waste the same amount.");
		}
		
		
		if ((totalpriceC < totalpriceA) && (totalpriceC) < (totalpriceD)) {
			System.out.println("The cheapest one to buy is: " + CheapoMax);
		} else if ((totalpriceA < totalpriceC) && (totalpriceA) < (totalpriceD)) {
			System.out.println("The cheapest one to buy is: " + AverageJoes);
		} else if ((totalpriceD < totalpriceC) && (totalpriceD) < (totalpriceA)) {
			System.out.println("The cheapest one to buy is: " + DuluxourousPaints);
		} else {
			System.out.println("No cheapest one. In other words, at least two of them have the same price.");
		}
	}
}
