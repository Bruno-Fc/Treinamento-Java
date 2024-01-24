package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Legal;
import entities.Person;
import entities.Physical;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> person = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i=0;i<N; i++){
			
			System.out.print("Tax payer #"+ (1+i) +"data: " );
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income:");
				double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble(); 
				Person p1 = new Physical(name,income, health); 
				person.add(p1);
			}else if(ch == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income:");
				double income = sc.nextDouble();
				System.out.print("Number od employees: ");
				int numEmployee = sc.nextInt();
				Person p2 = new Legal(name, income, numEmployee);
				person.add(p2);
				//person.add(p2 new Legal(name, income, numEmployee));
				
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Person p : person) {
			System.out.println(p);
			
		}
		
		System.out.print("TOTAL TAXES: ");
		double total =0.0;
		for(Person p : person) {
			total += p.tax();
			
		}
		System.out.printf(String.format("%.2f", total));
		
		
		
		
		
		
		
		
		
	}

}
