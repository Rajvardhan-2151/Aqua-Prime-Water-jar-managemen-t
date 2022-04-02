package study.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import study.Repository.ExtraOrderRepository;
import study.Repository.NonDeliveryRepository;
import study.Repository.SubscriptionRepository;
import study.entity.ExtraOrder;
import study.entity.NonDelivery;
import study.entity.Subscription;

@Service
public class ExtraOrderDao {

	@Autowired
	private ExtraOrderRepository extraOrder_repo;
	
	@Autowired
	SubscriptionRepository subscription_repo;
	
	@Autowired
	NonDeliveryRepository non_del_repo;
	
	
	public void extraOrderCount()
	{
		Integer extraOrderCount =  extraOrder_repo.getOrderForProviderCount();
		
	}
	
	public void getSubscriptedOrderCount()
	{
		List<Subscription> getSubscriptions = subscription_repo.getSubscriptionrecordForMeasurecount();
	    //for(Subscription singleSubscription )
	}
	
	
	public List<Subscription> getSubscriptedNonDeliveryOrder(int sup_id)
	{
		List<Subscription> sub_Orders = subscription_repo.getSubscriptedOrderForSuplier(sup_id);
		List<Subscription> final_subscription_order = new ArrayList<>();
	    for(Subscription subscriptionOrder : sub_Orders)
	    {
	    	NonDelivery delivery =  non_del_repo.getNonDeliveryDateForSupplier(subscriptionOrder.getSubscriptionId());
	    	if(delivery == null)
	    	{
	    		final_subscription_order.add(subscriptionOrder);
	    	}
	    }
	    return final_subscription_order;
	}
	
	
	public List<ExtraOrder> getExtraForGivenSupplier(int supplier_id)
	{
	  List<ExtraOrder> order = extraOrder_repo.getExtraOrderSupplier(supplier_id);
	  for(ExtraOrder ord : order)
	  {
		  System.out.println(ord.getOrderDate()+"  "+ord.getCustomerInfoTable().getCustomerFname()+"  "+ord.getCustomerInfoTable().getCustomerLname()+"  "+ord.getCustomerInfoTable().getCustomerDeliveryAddress());
			
			 String d2 = ord.getCustomerInfoTable().getCustomerDeliveryAddress();
	  }
		return order;
	}
	
	
}
