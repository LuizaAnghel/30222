package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {
	
	
	@Override
	public Employee getEmployee(String type) throws Exception {
		if (Constants.Employees.CARETAKER.equals(type)) {
			return new Caretaker();
		} else {
			throw new Exception("Invalid employee specification");
		}
	}
}
	 

