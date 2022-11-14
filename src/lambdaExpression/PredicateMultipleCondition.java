package lambdaExpression;
import java.util.function.*;
class Employee{
	String name;
	int salary;
	float exp;
	
	Employee(String e_name, int e_salary, float e_exp )
	{
		name = e_name;
		salary = e_salary;
		exp = e_exp;
	}
		
}
public class PredicateMultipleCondition {
	public static void main(String args[]) {		
		Employee e = new Employee("ravi",100000,6);
		Predicate<Employee> pr = emp->(emp.salary>80000 && emp.exp>5);
		System.out.println( pr.test(e) );
	}	
}
