package study.extraLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.CustomerRepository;
import study.Repository.SupplierRepository;
import study.entity.Customer;
import study.entity.Supplier;

@Service
public class Validation {
	
	@Autowired
	CustomerRepository repo;
	
	@Autowired
	SupplierRepository sup_repo;

	public Customer validateCustomer(String uname , String pass)
	{
		Customer cust =  repo.getcustomerByUsername(uname);
		if(cust != null)
		{
			if(cust.getCustomerPassword().equals(pass))
				return cust;
		}
	   return null;
	}
	
	public Supplier validateSupplier(String uname , String pass)
	{
		Supplier supplier =  sup_repo.getSupplierByUsername(uname);
		if(supplier != null)
		{
			if(supplier.getSupplierPassword().equals(pass))
				return supplier;
		}
	   return null;
	}
	
}
