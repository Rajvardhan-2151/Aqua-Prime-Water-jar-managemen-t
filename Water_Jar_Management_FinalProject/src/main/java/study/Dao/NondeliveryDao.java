package study.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.NonDeliveryRepository;
import study.entity.NonDelivery;


@Service
public class NondeliveryDao {

	@Autowired
	NonDeliveryRepository non_del_repo;
		
	
	public NonDelivery GetnonDeliveryOfSubscriptedCustomer(String start_date , String end_date , int sub_id)
	{
		return non_del_repo.getNonDeliveryObjectForOrdrs(start_date, end_date, sub_id);
	}
	
	
}
