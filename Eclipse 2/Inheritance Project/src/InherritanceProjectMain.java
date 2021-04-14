//Project Name: Inherritancer project main
//Project Description: shows off every single method in the employeee, manager, and executive classes
//Date: Apr 14, 2021
//Written By: Ari Steinfeld
import java.util.Scanner;
public class InherritanceProjectMain {

	public static void main(String[] args) {
		//creating the variables
		Scanner s = new Scanner(System.in);
		Employeee em = new Employeee();
		Manager ma = new Manager();
		Executive ex = new Executive();
		boolean condition = false;


		System.out.println("Do you want to create employee with 'packed' or 'default' ");
		String choice = s.next();
		if(choice.equals("packed")) {
			System.out.println("enter a name");
			String name = s.next();
			System.out.println("enter a salary");
			double salary = s.nextDouble();
			em = new Employeee(name, salary);
		} 
		System.out.println("Do you want to create manager with 'packed' or 'default' ");
		choice = s.next();
		if(choice.equals("packed")) {
			System.out.println("enter a name");
			String name = s.next();
			System.out.println("enter a salary");
			double salary = s.nextDouble();
			System.out.println("enter a department");
			String department = s.next();
			ma = new Manager(name, salary, department);
		}

		System.out.println("Do you want to create executive with 'packed' or 'default' ");
		choice = s.next();
		if(choice.equals("packed")) {
			System.out.println("enter a name");
			String name = s.next();
			System.out.println("enter a salary");
			double salary = s.nextDouble();
			System.out.println("enter a department");
			String department = s.next();
			System.out.println("enter a tile");
			String title = s.next();
			ex = new Executive(name, salary, department, title);
		} 


		condition = true;
		while (condition) {
			System.out.println("Enter em to do things to employee, enter ma to do things to manager, enter ex to do things to executive, and enter stop to stop");
			choice = s.next();
			if (choice.equals("em")) {
				System.out.println("do you want to 'get' everything or 'set; everything?");
				choice = s.next();
				if (choice.equals("get")) {
					System.out.println("name: "+ em.getName());
					System.out.println("salary: " + em.getSalary());
					System.out.println(em.toString());
				}else if (choice.equals("set")){
					System.out.println("enter a name");
					String name = s.next();
					System.out.println("enter a salary");
					double salary = s.nextDouble();
					em = new Employeee(name, salary);
				}
			} else if (choice.equals("ma")) {
				System.out.println("do you want to 'get' everything or 'set; everything?");
				choice = s.next();
				if (choice.equals("get")) {
					System.out.println("name: "+ ma.getName());
					System.out.println("salary: " + ma.getSalary());
					System.out.println("department: " + ma.getDepartment());
					System.out.println(ma.toString());
				}else if (choice.equals("set")){
					System.out.println("enter a name");
					String name = s.next();
					System.out.println("enter a salary");
					double salary = s.nextDouble();
					System.out.println("enter a department");
					String department = s.next();
					ma = new Manager(name, salary, department);
				}
			} else if (choice.equals("ex")) {
				System.out.println("do you want to 'get' everything or 'set; everything?");
				choice = s.next();
				if (choice.equals("get")) {
					System.out.println("name: "+ ex.getName());
					System.out.println("salary: " + ex.getSalary());
					System.out.println("department: " + ex.getDepartment());
					System.out.println("title: " + ex.getTitle());
					System.out.println(ex.toString());
				}else if (choice.equals("set")){
					System.out.println("enter a name");
					String name = s.next();
					System.out.println("enter a salary");
					double salary = s.nextDouble();
					System.out.println("enter a department");
					String department = s.next();
					System.out.println("enter a tile");
					String title = s.next();
					ex = new Executive(name, salary, department, title);
				}
			}else if(choice.equals("stop")) {
				condition = false;
			}
		}

	}}
