package study.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.SupplierRepository;
import study.entity.Supplier;

@Service
public class SupplierDao {
	
	@Autowired
	private SupplierRepository supplier_repository;

	
	
	public Supplier getSingleSupplier(int id)
	{
	    return supplier_repository.findById(id).get();
	}
	
	
	
	public void AddSuplier(Supplier supplier)
	{
		supplier_repository.save(supplier);
	}
	
	
	
	public void getAllOrders(int id)
	{
		
	}
	
	
	
	public List<Supplier> getAllSupplier()
	{
		List<Supplier> list = supplier_repository.findAll();
	    return list;
	}
	
	
	
}
