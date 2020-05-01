
public class TeamLeader extends ProductionWorker{
	private double montlyBonus;
	
	public TeamLeader(String name, int empID, int shift, double hourlyPayRate, double monthlyBonus){
		super(name,empID,shift,hourlyPayRate);
	
		this.montlyBonus = monthlyBonus;
		
	}
	
	public void addMonthlyBonus(double bonus){
		
		this.montlyBonus += bonus;
	}
	
	public void setMonthlyBonus(double bonus){
		
		this.montlyBonus = bonus;
	}
	@Override
	public double getMonthlySalary(){
		
		double salary = super.getMonthlySalary() + this.montlyBonus;
		return salary;
	}
	@Override
	public String toString(){
		
		String outputStr = "";

		outputStr += super.toString();
		outputStr += "\t"+this.montlyBonus;
		
		return outputStr;
	}



}

