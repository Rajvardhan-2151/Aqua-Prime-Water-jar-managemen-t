package study.Dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.CustomerBillRepository;
import study.Repository.CustomerRepository;
import study.Repository.OrderRepository;
import study.entity.Customer;
import study.entity.CustomerBill;
import study.entity.ExtraOrder;
import study.extraLogic.AddOrders;

@Service
public class CustomerDao {

	@Autowired
	CustomerRepository customer_repo;
	
	@Autowired
	OrderRepository order_repo;
	
	@Autowired
	CustomerBillRepository bill_repo;
	
	
	public List<Customer> getAllCustomer()
	{
	   return customer_repo.findAll();
	}
	
	
	public Customer getSingleCustomer(int id )
	{
		System.out.println("Inside it");
		Customer newCustomer = customer_repo.findById(id).get();
		return newCustomer;
	}
	
	
	public void getCustomerData(int id)
	{
		List<Customer> list =  customer_repo.findAll();
		for(Customer cust : list)
		{
			System.out.println(cust.getCustomerFname());
		}
	}
	
	
	//Sign-up Complete
	public void addCustomer(Customer customer)
	{
		System.out.println("Inside The ID  ,,");
		customer_repo.save(customer);
	}
	
	
	//Bill Data
	public CustomerBill viewBill(int id)
	{
		return bill_repo.findById(id).get(); 
	}   
	
	
	//Orders
	public void ViewOrders(int id)
	{
		List<ExtraOrder> ord =  order_repo.getExtraOrders(id);
		
		AddOrders.addOrders(ord);
	}
}

