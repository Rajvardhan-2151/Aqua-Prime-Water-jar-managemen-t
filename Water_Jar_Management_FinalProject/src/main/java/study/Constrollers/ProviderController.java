package study.Constrollers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import study.Dao.CaregoryDao;
import study.Dao.ComplaintDao;
import study.Dao.ExtraOrderDao;
import study.Dao.ProviderDao;
import study.Dao.SupplierDao;
import study.Repository.ComplaintCommentRepository;
import study.Repository.ComplaintRepository;
import study.Repository.SupplierRepository;
import study.entity.ComplaintComment;
import study.entity.ComplaintDemo;
import study.entity.ComplaintTable;
import study.entity.JarCategory;
import study.entity.Supplier;
import study.entity.SupplierDemo;

@Controller
@CrossOrigin
public class ProviderController {
	
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
	
	
	
	@PostMapping("/providerLogin")
	public String LoginProvider(@RequestParam String username , @RequestParam String password)
	{
		System.out.println(username+"  "+password);
		
		if(username.equalsIgnoreCase("admin") && (password.equalsIgnoreCase("1234")))
		{
			return "/ProviderViews/AfterProviderLogin";
	    }
		else 
		{
			return "/ProviderViews/LoginProvider";
		}
	}
	
	
	
	@GetMapping("/AddSupplier")
	public String addSupplier(String firstName , String lname , String address , String mobile_no , String email , String username , String password , String working_area , int pincode)
	{
		try {
			Supplier sup_obj = new Supplier(firstName , lname , address , mobile_no, email, username, password, working_area, pincode);
			sup_dao.AddSuplier(sup_obj);
			return "/ProviderViews/AfterProviderLogin";
		}
		catch(Exception e)
		{
			return "/ProviderViews/AddSupplier";
		}
	}
	
	
	
	/*@GetMapping("/getAllSupplierList")
	public ModelAndView ViewSupplierList()
	{
		ModelAndView mv = new ModelAndView();
		List<Supplier> suppliers_list= supplier_repo.findAll();
		mv.addObject("SupplierList", suppliers_list);
		mv.setViewName("DeleteSupplier.jsp");
		return mv;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	

    
}


