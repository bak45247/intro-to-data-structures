
public class TaxInformation {
	
	private int baseDeduction;
	
	public TaxInformation(int base) {
		
		this.baseDeduction = base;
	}
	
	public double calculateTax(Employee e) {
		
		double output = 0;
		
		double salary = e.getMonthlySalary();
		
		if (salary < 300)
			output = salary*this.baseDeduction*1.0/100;
		else if (salary < 500)
			output = 2.0*salary*this.baseDeduction/100;
		else
				output = 4.0*salary*this.baseDeduction/100;
		
		
		return output;
	}

}
