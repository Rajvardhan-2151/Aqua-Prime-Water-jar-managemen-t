package study.extraLogic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Dao.BillingDao;
import study.Dao.NondeliveryDao;
import study.Repository.NonDeliveryRepository;
import study.Repository.SubscriptionRepository;
import study.entity.Subscription;

@Service
public class BillGeneration {

	@Autowired
	private NonDeliveryRepository nonDelivery_repo;
	
	
	public int findBill(Subscription sub)
	{   //subscription id , sub_start_date , sub_end_date
		Integer nonDeliverycount =  nonDelivery_repo.getNonDeliveryCount(sub.getSubscriptionStartDate().toString(), sub.getSubscriptionEndDate().toString(), sub.getSubscriptionId());
		return (30-nonDeliverycount);
	}
	
}
