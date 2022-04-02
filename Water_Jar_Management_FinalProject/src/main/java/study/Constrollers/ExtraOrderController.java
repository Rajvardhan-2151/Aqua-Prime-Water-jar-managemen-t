package study.Constrollers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.Dao.CaregoryDao;
import study.Dao.CustomerDao;
import study.Dao.ExtraOrderDao;
import study.Dao.SupplierDao;
import study.Repository.ExtraOrderRepository;
import study.entity.Customer;
import study.entity.ExtraOrder;
import study.entity.JarCategory;
import study.entity.Supplier;

@Controller
public class ExtraOrderController {

	
	@Autowired
	ExtraOrderDao extraOrder_dao;
	
	@Autowired
	CustomerDao cust_dao;
	
	@Autowired
	SupplierDao sub_dao;
	
	@Autowired
	CaregoryDao cat_dao;
	
	@Autowired
	ExtraOrderRepository extra_order_repo;
	
	
	@GetMapping("/getTotalCount") 
	public void getTotalCount()
	{
		extraOrder_dao.extraOrderCount();
	}
	
	
	
	@GetMapping("/nonSubscripted_ExtraOrder")
	public String extraNonSubscriptedOrder(@RequestParam int cust_id, @RequestParam int sup_id , @RequestParam int cat_id ,@RequestParam int jar_quantity, @RequestParam java.sql.Date delivery_date)
	{
		try {
			Customer newCustomer = cust_dao.getSingleCustomer(cust_id);
			Supplier newSupplier = sub_dao.getSingleSupplier(sup_id);
			JarCategory newJarCategoy = cat_dao.getSingJarInfo(cat_id);
			Date order_Date = new Date();
			Date delivery_Date = delivery_date;
			System.out.println(delivery_date);
			ExtraOrder order = new ExtraOrder(newCustomer, newJarCategoy,
					newSupplier, order_Date, jar_quantity, delivery_Date,
					"Not Resolve");
			extra_order_repo.save(order);
			return "/CustomerViews/AfterCustomerLogin";
		}
		catch(Exception e)
		{
			return "/CustomerViews/AfterCustomerLogin";
		}
	}
	
	
	@GetMapping("/redirectExtraOrderPage")
	public String getExtraOrderForCustomer(Model model ,  @RequestParam int cust_id)
	{
		model.addAttribute("customer_id", cust_id);
		return "/CustomerViews/ExtraOrder";
	}
	
	
	
}
