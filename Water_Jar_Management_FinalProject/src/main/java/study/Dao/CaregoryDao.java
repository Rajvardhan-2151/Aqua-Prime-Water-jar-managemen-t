package study.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.Repository.JarCategiryRepository;
import study.entity.JarCategory;


@Service
public class CaregoryDao {

	@Autowired
	 JarCategiryRepository jarCategory_repo;
	
	
	
	
	public JarCategory getSingJarInfo(int id)
	{
		return jarCategory_repo.findById(id).get();	
	}

	
	
   
    public List<JarCategory> getAllProduct()
    {
    	List<JarCategory> list = jarCategory_repo.findAll();
    	
    	return list;
    }
    
    
    
    public void addProduct(JarCategory product)
    {
    	jarCategory_repo.save(product);
    }
    
    
}