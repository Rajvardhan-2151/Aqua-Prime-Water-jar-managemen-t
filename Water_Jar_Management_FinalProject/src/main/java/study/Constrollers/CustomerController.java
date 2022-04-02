package study.Constrollers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.Dao.CustomerDao;
import study.entity.Customer;
import study.entity.CustomerBill;
import study.extraLogic.Validation;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao customer_dao;
	
	@Autowired
	Validation val_obj;
	
	
	@PostMapping("/checkLogin")
	public String checkCustomer(HttpSession session  , Model model , @RequestParam String username , @RequestParam String password)
	{
		try {
			 Customer customer = val_obj.validateCustomer(username, password);
			   
			    if(customer!=null)
			    {
			      // model.addAttribute("customer", customer);
			    	session.setAttribute("customer", customer);
			    	System.out.println(session.getId());
			       return "/CustomerViews/AfterCustomerLogin";
				}
			    else	
				return "/CustomerViews/CustomerLogin";
		}
		catch(Exception e)
		{
			return "/CustomerViews/CustomerLogin";
		}
	   
	}
	
	
	@GetMapping("/getCustomerData")
	public void getdata(@RequestParam int id)
	{
		customer_dao.getCustomerData(id);
	}
	
	
	@GetMapping("/addCustomer")
	public String addCustomer(@RequestParam String Fname, @RequestParam String Lname, @RequestParam String Address,@RequestParam String MobileNo, @RequestParam String Email, @RequestParam String Username, @RequestParam String Password,@RequestParam int Pincode, @RequestParam String DeliveryAddress)
	{
		try {
			Customer cust = new Customer(Fname , Lname ,Address, MobileNo, Email, Username, Password, Pincode, DeliveryAddress);
			customer_dao.addCustomer(cust);
			return "/CustomerViews/CustomerLogin";
		}
		catch(Exception e)
		{
			return "/CustomerViews/CustomerLogin";
		}
		
	}
	
	@PostMapping("/addCustomerThroughSupplier")
	public String addCustomerThroughSupplier(@RequestParam String Fname, @RequestParam String Lname, @RequestParam String Address,@RequestParam String MobileNo, @RequestParam String Email, @RequestParam String Username, @RequestParam String Password,@RequestParam int Pincode, @RequestParam String DeliveryAddress)
	{
		try
		{
			Customer cust = new Customer(Fname , Lname ,Address, MobileNo, Email, Username, Password, Pincode, DeliveryAddress);
			customer_dao.addCustomer(cust);
		}
		catch(Exception e)
		{
			return "/SupplierViews/AddCustomer";
		}
		
		return "/SupplierViews/SupplierLogin";
	}
	
	
	@GetMapping("/RedirectToCustomer")
	public String RedirectToAddCustomer()
	{
		System.out.println("Inside it");
		return "/SupplierViews/AddCustomer";
	}
	
	
	
	@GetMapping("/ViewBill")
	public String ViewBill(Model model, @RequestParam int customer_id)
	{
		try {
			CustomerBill bill = customer_dao.viewBill(customer_id);
			model.addAttribute("billOfCustomer", bill);
			return "/CustomerViews/ViewCustomerBill";
		}
		catch(Exception e)
		{
			return "/CustomerViews/ViewCustomerBill";
		}
		
		
	}
	
	
	@GetMapping("/logout")
	public String Logout(HttpSession session)
	{
		
		session.invalidate();
		System.out.println("Session is Invalid");
		return "/CustomerViews/CustomerLogin";
	}
	
	
	
	
}
