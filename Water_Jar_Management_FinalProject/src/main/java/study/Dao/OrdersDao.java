package study.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.ExtraOrderRepository;
import study.entity.ExtraOrder;
import study.entity.NonDelivery;
import study.entity.Subscription;

@Service
public class OrdersDao {

	@Autowired
	private ExtraOrderRepository extra_order_repo;
	
	
	
	@Autowired
	NondeliveryDao non_del_dao;
	
	
	
	public String showExtraOrderList(int id)
	{
		String date = null;
	  List<ExtraOrder> list =  extra_order_repo.getCustomerOrders(id);
	  for(ExtraOrder ord : list)
	  {
		  System.out.println(ord.getOrderDate().toString());
		  date  =  ord.getOrderDate().toString();
	  }
	  return date;
	}
	
	//subscription ahet ka te check krne and non delivery object pathvane
	public List<NonDelivery> subscriptedOrderOfGivenCustomer(int cust_id, List<Subscription> all_subscriptions)
	{
		
		//here all subscription of the given user are come
		
		List<NonDelivery> non_deliver_list = new ArrayList<>();
		
		if(all_subscriptions.isEmpty())
		{
			return null;
		}
		else
		{
			//Given subscription non delivery findout individualy
			for(Subscription sub : all_subscriptions)
			{
				//we are sending the start date and end date of the subscription to Non deliver dao
				NonDelivery delivery = non_del_dao.GetnonDeliveryOfSubscriptedCustomer(sub.getSubscriptionStartDate().toString(), sub.getSubscriptionEndDate().toString(), sub.getSubscriptionId());
				non_deliver_list.add(delivery);
			}
		}
		
		return non_deliver_list;
		
	}
	
	
}
