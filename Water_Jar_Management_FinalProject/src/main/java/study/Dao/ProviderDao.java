package study.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.NonDeliveryRepository;
import study.Repository.OrderRepository;
import study.Repository.SubscriptionRepository;
import study.entity.NonDelivery;
import study.entity.Subscription;

@Service
public class ProviderDao {

	@Autowired
	OrderRepository order_repo;
	
	@Autowired
	SubscriptionRepository sub_repo;
	
	@Autowired
	NonDeliveryRepository non_del_repo;
	
	public Integer getDailyOrderCount()
	{
		Integer extraOrderCount =  order_repo.getDailyOrderCount();
		return extraOrderCount;
	}
	
	
	public Integer getSubscriptedCount()
	{
	    List<Subscription> subscriptedOrderCount = sub_repo.getSubscriptionrecordForMeasurecount();
	    Integer subscripted_count = 0;
	    
	    for(Subscription sub_count : subscriptedOrderCount)
	    {
	    	NonDelivery non_delivery =  non_del_repo.getNonDeliveryDateForSupplier(sub_count.getSubscriptionId());
	        if(non_delivery == null)
	        {
	        	subscripted_count++;
	        }
	    }
	    return subscripted_count;
	}
	
	
}
