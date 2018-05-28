
public class Prices {
	private double CheapoMaxPrice;
	private double AverageJoesPrice;
	private double DuluxourousPaintsPrice;
	
	public void setCheapo(double PriceC) {
		CheapoMaxPrice = PriceC;
	}
	
	public void setAverage(double PriceA) {
		this.AverageJoesPrice = PriceA;
	}
	
	public void setDuluxourous(double PriceD) {
		DuluxourousPaintsPrice = PriceD;
	}
	
	public double getCheapo() {
		return CheapoMaxPrice;
	}
	public double getAverage() {
		return AverageJoesPrice;
	}
	public double getDuluxourous() {
		return DuluxourousPaintsPrice;
	}
}
