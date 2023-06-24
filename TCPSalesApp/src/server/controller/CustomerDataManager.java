package server.controller;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDataManager {

	private List<Customer> customers;
	
	/**
	 * Method 1
	 * This method loads a list of product into a list
	 */
	private void loadCustomers() {
		
		// Sample data
		int ids[] = {10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010};
		String names[] = {"Ali", "Abu", "Ahmad", "Siti", "Amira","Teoh", "Ng", "Lau", "Lee", "Lim"};
		
		// Load data into list
		for (int index=0; index < ids.length; index++) {
			
			// Create product
			Customer customer = new Customer();
			customer.setCustomerId(ids[index]);
			customer.setName(names[index]);
			
			// Add to list
			customers.add(customer);
			
		}
	}
	
	/**
	 * Method 2
	 * This method finds a customer from a list based on the customer name
	 * and return a customer
	 * @param name
	 * @return a customer
	 */
	public Customer getCustomerName(String name) {
		
		// Find a customer
		for (Customer customer:customers) {
			// TODO Auto-generated method stub
			boolean found = name.equals(customer.getName());
			if (found == true)
				return customer;
		}
		
		// Return customer not found
		Customer unFoundCustomer = new Customer();
		unFoundCustomer.setName("Customer not found");
		
		return unFoundCustomer;
		
	}
	
	/*private int stringCompare(String name, String name2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	/**
	 * Method 3
	 * This method finds a customer from a list based on the customer id
	 * and return a customer
	 * @param id
	 * @return a customer
	 */
	public Customer getCustomer(int id) {
		
		// Find a product
		for (Customer customer:customers) {
			
			if (customer.getCustomerId() == id)
				return customer;
		}
		
		// Return product not found
		Customer unFoundCustomer = new Customer();
		unFoundCustomer.setName("Customer not found");
		
		return unFoundCustomer;
		
	}
	
	/*Method 4*/
	public List<Customer> getCustomers() {
		
		return customers;
	}
	
	/**
	 * Constructor1
	 */
	public CustomerDataManager() {
		
		// Load products
		this.customers = new ArrayList<Customer>();
		this.loadCustomers();
		
	}
}
