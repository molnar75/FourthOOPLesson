
public class Main {

	public static void main(String[] args) {
		
		/*
		Employee employee = new Employee();
		//employee.employeeName = "Mindless Worker";
		//employee.salary = 120000;
		
		employee.setEmployeeName("Mindless Worker");
		employee.setSalary(120000);
		
		//employee.salary = employee.increaseSalary(50000, employee.salary);
		//System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
		
		Employee employee2 = new Employee();
		
		employee2.setEmployeeName("Pista");
		employee2.setSalary(80000);
		
		System.out.println(employee.displayInfo() + employee2.displayInfo());
		
		System.out.println("Employee: " + employee.isInSalaryRange(100000, 200000) + " Employee2:" + employee2.isInSalaryRange(100000, 200000));
		
		System.out.println("Employee: " +employee.getTax() + " Employee2: " + employee2.getTax());
		
		System.out.println("Employee1 has higher salary than Employee2: " + employee.hasHigherSalary(employee2));
		*/
		
		Employee[] employeeArray = new Employee[10];
		
		for(int i=0; i < employeeArray.length; i++){
		
			employeeArray[i] = new Employee();
			employeeArray[i].setSalary(i*1000+i*200+i*5);
			employeeArray[i].setEmployeeName("MindlessWorker" + i);
		}
		
		
		int max = 0;
		
		for(int i=1; i < employeeArray.length; i++){
			if(employeeArray[i].hasHigherSalary(employeeArray[max])){
				max = i;
			}
		}
		System.out.println(employeeArray[max].getEmployeeName() + " has the biggest salary: " + employeeArray[max].getSalary());
		
		
		
		int db = 0;
		
		for(int i=0; i < employeeArray.length; i++){
			if(employeeArray[i].isInSalaryRange(1000, 5000)){
				db++;
			}
		}
		
		System.out.println(db + " employees have their salary between 1000 and 5000.");
		
		
		long avg = 0;
		
		for(int i=0; i < employeeArray.length; i++){
			avg = avg + employeeArray[i].getSalary();
		}
		
		avg = avg/employeeArray.length;
		
		System.out.println("The employees avarage salary is: " + avg);
		
		
		long tax = 0;
		
		for(int i=0; i < employeeArray.length; i++){
			tax = tax + employeeArray[i].getTax();
		}
		
		System.out.println("The eyployees tax is: " + tax);
	}

}
