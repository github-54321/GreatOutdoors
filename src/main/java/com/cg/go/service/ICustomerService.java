package com.cg.go.service;
import java.util.List;
import com.cg.go.entity.Customer;
import com.cg.go.entity.Userdata;
import com.cg.go.exception.IDNotFoundException;
import com.cg.go.exception.UserNotFoundException;

public interface ICustomerService {

	List<Customer> getAllCustomers();
	
	List<Customer> addCustomer(Customer customer);
	
	List<Customer> updateCustomer(Customer customer) ;
	
	List<Customer> removeCustomer(Integer customerId)throws UserNotFoundException;
	
	Customer viewCustomer(Integer customerId);
	
	//public Customer loginCustomer(Customer customer);

	Customer loginCustomer(String customerEmail, String customerPassword) throws IDNotFoundException;
}
