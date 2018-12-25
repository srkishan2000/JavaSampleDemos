package com.shan.sample.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
	
	public static class Developer{
		
		private String name;
		private int age;
		private double salary;
		
		public Developer(String name, double salary, int age) {
			this.name = name;
			this.salary = salary;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public double getSalary() {
			return salary;
		}
		
	}
	

	public static void main(String[] args) {
		List<Developer> listDevs;
		
		listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}
		
		// Sort by Name		
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("=== After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}
		
		
		System.out.println("**********");
		
		
		listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}
		
		// Sort by Age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
	
		System.out.println("=== After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}
		
		
		System.out.println("**********");
		
		
		listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}
		
		// Sort by Name and Age
		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				
				int flag = o1.getName().compareTo(o2.getName());
				
				if(flag==0) flag = o1.getAge() - o2.getAge();
		        
				return flag;
			}
			
		});
		
		
		System.out.println("=== After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.name + " ," + developer.age);
		}

	}
	
	

	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("shan", 70000d, 33));
		result.add(new Developer("alvin", 60000d, 33));
		result.add(new Developer("jason", 120000d, 10));
		result.add(new Developer("shan", 70000d, 23));
		result.add(new Developer("iris", 67000d, 55));
		result.add(new Developer("alvin", 60000d, 36));
		
		return result;

	}

}
