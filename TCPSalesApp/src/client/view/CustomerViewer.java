package client.view;

import java.util.List;

import model.Customer;

public class CustomerViewer {

public void displayProducts(List<Customer> customers) {
		
		// Some information about the record
		System.out.println("\tNumber of record: " + customers.size());
		System.out.println("\tProduct Information\n");
		
		// Print all products on console
		for (Customer customer:customers) {
			
			System.out.println("\tCustomer Id: " + customer.getCustomerId());
			System.out.println("\tName: " + customer.getName() + "\n");
		}
		
	}

}
