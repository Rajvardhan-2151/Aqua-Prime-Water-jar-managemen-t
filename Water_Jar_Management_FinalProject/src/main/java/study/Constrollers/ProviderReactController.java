package study.Constrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.Dao.CaregoryDao;
import study.Dao.ComplaintDao;
import study.Dao.ProviderDao;
import study.Dao.SupplierDao;
import study.Repository.ComplaintCommentRepository;
import study.Repository.ComplaintRepository;
import study.Repository.SupplierRepository;
import study.entity.ComplaintDemo;
import study.entity.ComplaintTable;
import study.entity.JarCategory;
import study.entity.JarCategory_Demo;
import study.entity.Supplier;
import study.entity.SupplierDemo;

@RestController
@CrossOrigin
public class ProviderReactController {

	@Autowired
	SupplierDao sup_dao;
	
	@Autowired
	SupplierRepository supplier_repo;
	
	@Autowired
	ComplaintRepository comp_repo;
	
	@Autowired
	ProviderDao provider_dao;
	
	@Autowired
	ComplaintDao complaint_dao;
	
	@Autowired
	ComplaintCommentRepository comp_comment_repo;
	
	@Autowired
	CaregoryDao jarCate_dao;
	
	
	@PostMapping("/viewProducts")
	public List<JarCategory_Demo> ViewProducts()
	{
		System.out.println("Inside View Product");
		List<JarCategory_Demo> cat_demo = null;
		try {
			List<JarCategory> category_list = jarCate_dao.getAllProduct();
			cat_demo = new ArrayList<>();
			
			for(JarCategory category : category_list)
			{
				cat_demo.add(new JarCategory_Demo(category.getJarCapacity() , 
						category.getWaterType() , category.getPrice()));
			}
			return cat_demo;
		}
		catch(Exception e)
		{
			return cat_demo;
		}
		
	}
	
	
	
	@PostMapping("/getAllSupplierList")
	public List<SupplierDemo> ViewSupplierList()
	{
		List<SupplierDemo> supplier_demo = null;
		try {
			List<Supplier> supplier_list =  sup_dao.getAllSupplier();
			supplier_demo = new ArrayList<>();
			
			for(Supplier single : supplier_list)
			{
				supplier_demo.add(new SupplierDemo(single.getSupplierFname() , single.getSupplierLname() , single.getSupplierAddress() , 
						single.getSupplierMobileNo() , single.getSupplierWorkingArea()));
			}
			return supplier_demo;
		}
		catch(Exception e)
		{
			return supplier_demo;
		}
	
	}
	
	
	
	@GetMapping("/deleteSingleSupplier")
	public boolean deletesupplier(@RequestParam int sup_id)
	{
		Supplier singleSupplier = supplier_repo.findById(sup_id).get();
		supplier_repo.delete(singleSupplier);
		return true;
	}
	
	
	
	@PostMapping("/ViewCount")
	public Integer ViewCount()
	{
	   Integer extra_order_count = provider_dao.getDailyOrderCount();
	   Integer subscrpted_count =provider_dao.getSubscriptedCount();
	   return extra_order_count + subscrpted_count;
	}
	
	
	
	@PostMapping("/getAllComplaint")
	public List<ComplaintDemo> viewComplaint()
	{
		try {
			List<ComplaintDemo> demo = new ArrayList<>();
			List<ComplaintTable> comp = comp_repo.findAll();
			for(ComplaintTable single : comp)
			{
				demo.add(new ComplaintDemo(single.getCustomerInfoTable().getCustomerFname(), single.getComplaintStatus() , single.getComplaintInfo() , single.getComplaintDate()));
			}
			return demo; 
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
}
