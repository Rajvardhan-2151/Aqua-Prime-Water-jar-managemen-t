package study.Constrollers;


import java.sql.Date;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import study.Dao.BillingDao;
import study.Dao.CaregoryDao;
import study.Dao.CustomerDao;
import study.Dao.NondeliveryDao;
import study.Dao.SubscriptionDao;
import study.Dao.SupplierDao;
import study.Repository.CustomerRepository;
import study.entity.Customer;
import study.entity.JarCategory;
import study.entity.Subscription;
import study.entity.Supplier;
import study.extraLogic.BillGeneration;

@Controller
public class SubscriptionController {

	@Autowired
	SubscriptionDao subscription_dao;
	
	@Autowired
	BillingDao bill_dao;
	
	@Autowired
	CustomerDao cust_dao;
	
	@Autowired
	SupplierDao sup_dao;
	
	@Autowired
	CaregoryDao cat_dao;
	
	@Autowired
	BillGeneration genarateBill;
	
	@Autowired
	NondeliveryDao non_del_dao;
	
	@Autowired
	BillingDao bill;
	
	
	@GetMapping("/AddSubscription")
	public String addSubscription(@RequestParam int customer_id , @RequestParam int jarCategory_id,   @RequestParam int supplier_id ,  @RequestParam String subscriptionStartDate, @RequestParam String subscriptionEndDate, @RequestParam String subscriptionStatus)
	{
		try {
			Customer newCustomer = cust_dao.getSingleCustomer(2);
			Supplier newSupplier =  sup_dao.getSingleSupplier(supplier_id);
			JarCategory category = cat_dao.getSingJarInfo(jarCategory_id);
			Date start_date =Date.valueOf(subscriptionStartDate);
			Date end_date = Date.valueOf(subscriptionEndDate);
			System.out.println(start_date);
			System.out.println(end_date);
			Subscription newSubscription = new Subscription(newCustomer , category , newSupplier , start_date , end_date , "Active" );
			subscription_dao.addSubscription(newSubscription);
			return "/SupplierViews/AfterSupplierLogin";
		}
		catch(Exception e)
		{
			return "/SupplierViews/AddSubscription";
		}
	
	}
	
	
	@GetMapping("/RedirectAddSubscription")
	public String addSubscription(Model model)
	{
		try {
			List<JarCategory>  list_category  = cat_dao.getAllProduct();
			List<Customer> list_customer  =  cust_dao.getAllCustomer();
		    List<Supplier> list_supplier = sup_dao.getAllSupplier();
		    for(Supplier sup : list_supplier)
		    {
		    	System.out.println(sup.getSupplierFname());
		    }
		    model.addAttribute("jar_category", list_category);
			model.addAttribute("customer", list_customer);
			model.addAttribute("supplier_list", list_supplier);
			return "/SupplierViews/AddSubscription";
		}
		catch(Exception e)
		{
			return "/SupplierViews/AfterSupplierLogin";
		}
		
	}
}
