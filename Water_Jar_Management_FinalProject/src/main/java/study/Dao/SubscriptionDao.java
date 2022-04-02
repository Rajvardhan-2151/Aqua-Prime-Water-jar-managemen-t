package study.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.SubscriptionRepository;
import study.entity.Subscription;

@Service
public class SubscriptionDao {

	@Autowired
	SubscriptionRepository subscription_repo;
	
	
	
	public void addSubscription(Subscription newSubscription)
	{
		subscription_repo.save(newSubscription);
	}
	
	
	//valid customer subscription list is here
	public List<Subscription> subscriptedOrder()
	{
		return subscription_repo.GetSubscriptedOrders();
	}
	
	
	//Kiti Subscription ahet te disnar
	public List<Subscription> validSubscription(int id)
	{
		return subscription_repo.getValidSubscriptionForMonth(id);
	}
	
	
	
}
