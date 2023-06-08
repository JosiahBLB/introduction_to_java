package exercises;
import java.util.ArrayList;


public class Employee implements Comparable<Employee>{
	private String name;
	private Job job;
	
	public Employee(String name, Job job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return this.name+" ("+this.job+")";
	}

	@Override
	public int compareTo(Employee o) {
		return this.job.compareTo(o.job);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Bob", Job.Worker);
		Employee e2 = new Employee("Alice", Job.Chief);
		Employee e3 = new Employee("Greg", Job.Manager);
		Employee e4 = new Employee("Jim", Job.Foreman);
		Employee e5 = new Employee("Hugh", Job.Worker);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		System.out.println(employeeList);
		employeeList.sort(null);
		System.out.println(employeeList);
	}
}
