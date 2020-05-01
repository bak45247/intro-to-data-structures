public class ShiftSupervisor extends Employee{
	private double annualSalary;
	private double annualBonus;
	
	public  ShiftSupervisor(String name, int empID, double annualSalary){
		
		super(name,empID);
		this.annualSalary = annualSalary;
	}
	
	public void addAnnualBonus(double bonus){
		
		this.annualBonus+= bonus;
	}
	
	public void setAnnualBonus(double bonus){
		
		this.annualBonus= bonus;
	}

	@Override
	public double getMonthlySalary(){
		
		double salary = 0;
		
		salary = (this.annualBonus + this.annualSalary)/12;
		
		return salary;
	}
	
	@Override
	public String toString(){
		
		String outputStr = "";

		outputStr += super.toString();
		outputStr += "\t"+this.annualSalary;
		outputStr += "\t"+this.annualBonus;
		
		
		
		return outputStr;
	}
}
