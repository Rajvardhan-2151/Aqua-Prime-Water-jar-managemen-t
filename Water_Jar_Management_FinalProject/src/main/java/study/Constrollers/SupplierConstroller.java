package study.Constrollers;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.Dao.BillingDao;
import study.Dao.CaregoryDao;
import study.Dao.CustomerDao;
import study.Dao.ExtraOrderDao;
import study.Dao.NondeliveryDao;
import study.Dao.SubscriptionDao;
import study.Dao.SupplierDao;
import study.Repository.CustomerRepository;
import study.Repository.ExtraOrderRepository;
import study.Repository.NonDeliveryRepository;
import study.Repository.SubscriptionRepository;
import study.Repository.SupplierRepository;
import study.entity.Customer;
import study.entity.ExtraOrder;
import study.entity.JarCategory;
import study.entity.NonDelivery;
import study.entity.Subscription;
import study.entity.Supplier;
import study.extraLogic.BillGeneration;
import study.extraLogic.Validation;
import study.extraLogic.BillGeneration;

@Controller
public class SupplierConstroller {

	@Autowired
	Validation val_obj;
	
	@Autowired
	SubscriptionDao subscription_dao;
	
	@Autowired
	BillingDao bill_dao;
	
    @Autowired
	BillGeneration genarateBill;
	
	@Autowired
	BillingDao bill;
	
	@Autowired
	CustomerDao cust_dao;
	
	@Autowired
	ExtraOrderDao extraOrder_dao;
	
	@Autowired
	SupplierRepository sup_repo;
	
	
	

	@GetMapping("/checkSupplierLogin")
	public String checkSupplier(HttpSession session ,Model model , @RequestParam String username , @RequestParam String password)
	{
		try {
			Supplier supplier = val_obj.validateSupplier(username, password);
			   
		    if(supplier!=null)
		    {
		    	session.setAttribute("supplier", supplier);
		       return "/SupplierViews/AfterSupplierLogin";
			}
		    else	
			return "/SupplierViews/SupplierLogin";
		}
		catch(Exception e)
		{
			return "/SupplierViews/SupplierLogin";
		}
	    
	}
	
	
	
	@GetMapping("/addSupplier")
	public String addSupplier(@RequestParam String supplier_fname,@RequestParam String supplier_lname,@RequestParam String supplier_address,@RequestParam String supplier_mobile_no,@RequestParam String supplier_email, @RequestParam String supplier_username, @RequestParam String supplier_password,@RequestParam String  supplier_working_area, @RequestParam Integer suppler_working_area_pincode)
	{
		Supplier newSupplier = new Supplier( supplier_fname,  supplier_lname,  supplier_address , supplier_mobile_no,  supplier_email,  supplier_username,  supplier_password , supplier_working_area,  suppler_working_area_pincode);
		sup_repo.save(newSupplier);
		return "/SupplierViews/SupplierLogin";
	}
	
	
	
	@GetMapping("/GenerateBill")
	public String GenerateBill(String start_Date , String end_Date , int cust_id)
	{
		try {
			List<Subscription> list = subscription_dao.validSubscription(cust_id);
			
	        int TotalNoDays = 0;
	        int total_extra_order =0 ;
			if(list.isEmpty())
			{//Non Subscripted
				List<ExtraOrder> extra_order_list =  bill_dao.GenerateBillFromExtraOrder(start_Date, end_Date, cust_id); 
				for(ExtraOrder single_order : extra_order_list) {total_extra_order++;};
				if(total_extra_order != 0)
				{
					bill.addCustomerBill(cust_id, total_extra_order , (total_extra_order*10) , (total_extra_order*150));
				}
			}
			else
			{   //subscripted
				int customer_id = 0;
				for(Subscription sub : list)
				{
				  customer_id = sub.getCustomerInfoTable().getCustomerId();
		          TotalNoDays = TotalNoDays+genarateBill.findBill(sub);
				}
				bill.addCustomerBill(customer_id, TotalNoDays , (TotalNoDays*10) , (TotalNoDays*150));
			}
			return "/SupplierViews/AfterSupplierLogin";
		}
		catch(Exception e)
		{
			return "/SupplierViews/AfterSupplierLogin";
		}
        
		
	}
	
	
	
	
	@GetMapping("/redirectGenerateBill")
	public String GenerateBill(Model model)
	{
		List<Customer> customer =  cust_dao.getAllCustomer();
		model.addAttribute("customer", customer);
		return "/SupplierViews/GenerateBill";
	}
	
	
	
	@GetMapping("/OrdersListForSupplier")
	public String OrdersListForSupplier(Model model ,  @RequestParam int supplier_id)
	{
		try {
			List<ExtraOrder> extraOrder_list = extraOrder_dao.getExtraForGivenSupplier(supplier_id);
			List<Subscription> subscripted_NonDeliveryList = extraOrder_dao.getSubscriptedNonDeliveryOrder(supplier_id);
			
			model.addAttribute("extraOrders", extraOrder_list);
			model.addAttribute("subscriptedOrders", subscripted_NonDeliveryList);
			return "/SupplierViews/SupplierOrders";
		}
		catch(Exception e)
		{
			return "/SupplierViews/AfterSupplierLogin";
		}
	
	}
	
	
	@GetMapping("/DeleteCustomer")
	public String DeleteCustomer(Model model)
	{
		model.addAttribute("allCustomers", cust_dao.getAllCustomer());
		return "/SupplierViews/DeleteCustomer";
	}
	
	
	@GetMapping("/DeleteSingleCustomer")
	public String DeleteCustomer(@RequestParam int cust_id)
	{
		return "/SupplierViews/AfterSupplierLogin";
	}
	
	
}




