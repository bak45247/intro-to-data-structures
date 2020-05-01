
public class Driver {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];
		TaxInformation tax = new TaxInformation(2);
		
		staff[0] = new ProductionWorker("worker1",100,2,10);
		staff[1] = new ProductionWorker("worker2",200,1,20);
		staff[2] = new TeamLeader("leader",200,1,30,100);
		
		for (int i=0; i < staff.length; i++) {
			
			if (staff[i] instanceof ProductionWorker)
				((ProductionWorker)staff[i]).addHours(20);
			
			System.out.println(staff[i].getMonthlySalary());
			double empTax = tax.calculateTax(staff[i]);
			System.out.println(empTax);
		}
		
		System.out.println(equalSalary(staff[1],staff[2]));

	}
	
	public static boolean equalSalary(Employee e1, Employee e2){
		
		return e1.getMonthlySalary() == e2.getMonthlySalary();
}

}
