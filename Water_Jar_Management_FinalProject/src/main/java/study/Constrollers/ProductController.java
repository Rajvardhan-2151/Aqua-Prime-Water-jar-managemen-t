package study.Constrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import study.Dao.CaregoryDao;
import study.entity.JarCategory;
import study.entity.JarCategory_Demo;

@Controller
@CrossOrigin
public class ProductController {

	@Autowired
	CaregoryDao jarCate_dao;
	
	
	
	@GetMapping("/AddProduct")
	public String addProduct(String jar_capacity , String water_type , int price)
	{
		jarCate_dao.addProduct(new JarCategory(jar_capacity , water_type, price));
	    return "/ProviderViews/AfterProviderLogin";
	} 
}
