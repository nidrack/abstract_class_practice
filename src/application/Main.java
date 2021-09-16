package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Business;
import entities.Person;
import entities.Private;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.print("Enter the amount of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char a = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual Income: ");
			double income = sc.nextDouble();
			if (a == 'i') {
				System.out.print("Health Expenditures: ");
				double health = sc.nextDouble();
				list.add(new Private(name, income, health));
			} else {
				System.out.print("Number of Employees: ");
				int emp = sc.nextInt();
				list.add(new Business(name, income, emp));
			}
		}
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (Person person : list) {
			System.out.printf("%s : $ %.2f%n", person.getName(), person.tax());
			sum += person.tax();
		}
		System.out.println("Total taxes: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
