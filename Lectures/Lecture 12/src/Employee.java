
public abstract class Employee extends Object {
	
	private String name;
	private int empID;
	
	
	public Employee(String name, int empID){
		this.name = name;
		this.empID = empID;
	}
	@Override
	public String toString(){
		
		String outputStr = "";
		
		outputStr += this.name;
		outputStr +="\t"+this.empID;
		
		return outputStr;
	}
	
	abstract public double getMonthlySalary();


}
