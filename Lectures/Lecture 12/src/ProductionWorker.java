
public class ProductionWorker extends Employee {
	
	private int shift;
	private double hourlyRate;
	private int hoursWorked;
	
	public ProductionWorker(String name, int empId, int shift, double rate) {
		
		super(name,empId);
		this.shift = shift;
		this.hourlyRate = rate;
		this.hoursWorked = 0;
	}
	
	public double getMonthlySalary() {
		
		double output = this.hourlyRate*hoursWorked;
		
		return output;
	}

	public void addHours(int hours) {
		
		this.hoursWorked += hours;
	}
	
	@Override
	public String toString(){
		
		String outputStr = "";

		outputStr += super.toString();
		outputStr += "\t"+this.shift;
		outputStr += "\t"+this.hourlyRate;
		outputStr += "\t"+this.hoursWorked;
		outputStr += "\t"+this.getMonthlySalary();
		
				return outputStr;
	}
}
