package task01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		System.out.println("Output from file Employee1.txt");

		Employee employee = new Employee("Charlie", 19, 10000);
		File file = new File("Employee1.txt");

		try {
			Methods.serialize(file, employee);
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			System.out.println(Methods.deserialize(file));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println();

		/* Collection */

		System.out.println("Output from file Employee2.txt");

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Paul", 1, 8000));
		employees.add(new Employee("Dizzy", 2, 15000));
		employees.add(new Employee("Frank", 3, 12000));
		employees.add(new Employee("James", 4, 17000));
		employees.add(new Employee("Dave", 5, 14000));

		File fileA = new File("Employee2.txt");
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee emp = iterator.next();
			try {
				Methods.serialize(fileA, emp);
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				System.out.println(Methods.deserialize(fileA));
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println();

	}
}