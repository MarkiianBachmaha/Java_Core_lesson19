package task01;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private transient int salary;

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Id must be positive!");
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary must be positive!");
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}