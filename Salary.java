
public class Salary {
	
	private double basicSalary;
	private double hra;
	private double da;
	private double gs;
	private double incomeTax;
	private double netSalary;
		
	public Salary(double basicSalary) {
	 this.basicSalary = basicSalary;
	}
		
	public double getBasicSalary() {
	 return basicSalary;
	}
		
	public void setBasicSalary(double basicSalary) {
	 this.basicSalary = basicSalary;
	}
	
	public double getHra() {
	 return hra;
	}
	
	public double getDa() {
	 return da;
	}
	
	public double getGs() {
	 return gs;
	}
	
	public double getIncomeTax() {
	 return incomeTax;
	}
	
	public double getNetSalary() {
	 return netSalary;
	}
	
	public void calculateSalary() {
	 hra = 0.1 * basicSalary;
	 da = 0.73 * basicSalary;
	 gs = basicSalary + da + hra;
	 incomeTax = 0.3 * gs;
	 netSalary = gs - incomeTax;
	}
	
}
		