package lambdaExpression;

import java.util.ArrayList;
import java.util.function.*;

class EmployeeDetails{
	String name;
	int salary;
	float exp;
	
	EmployeeDetails( String ename, int esalary, float e_exp ) {
		name = ename; 
		salary = esalary;
		exp = e_exp;		
	}
	
}
public class PredicatemultipleConditionTwo {

	public static void main( String args[] ) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("ravi",100000,6) );
		empList.add(new Employee("john",30000,6) );
		empList.add(new Employee("stephen",60000,6) );
		empList.add(new Employee("thomas",90000,6) );
		
		Predicate<Employee> pr = (emp)->( emp.salary > 50000 && emp.exp > 5.0 );
		
		for( Employee e : empList ) {
			if( pr.test(e) ) {
				System.out.println(e.name+" has salary "+e.salary);
			}
		}		
		
	}
}
