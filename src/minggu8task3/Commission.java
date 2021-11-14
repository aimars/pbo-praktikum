package minggu8task3;

public class Commission extends Hourly {
	double totalSales;
	double comRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		comRate = commRate;
	}
	
	public void addSales(double sale) {
		totalSales = sale;
	}
	
	public double pay() {
		double payment = super.pay() + (super.pay() + comRate);
		totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nTotal Sales: " + totalSales;
		
		return result;
	}
}