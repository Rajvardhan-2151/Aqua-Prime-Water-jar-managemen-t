package study.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.CustomerBillRepository;
import study.Repository.ExtraOrderRepository;
import study.Repository.SubscriptionRepository;
import study.entity.ExtraOrder;
import study.entity.Subscription;

@Service
public class BillingDao {

	@Autowired
	ExtraOrderRepository extraOrder_repo;
	
	@Autowired
	SubscriptionRepository subscription_repo;
	
	@Autowired
	 CustomerBillRepository customer_bill_repo;
	
	
	
	public List<ExtraOrder> GenerateBillFromExtraOrder(String start_date , String end_Date , int id)
	{
		List<ExtraOrder> ex_ord_date =extraOrder_repo.getExtraOrderForBill(start_date, end_Date, id);
		for(ExtraOrder ord : ex_ord_date)
		{
			System.out.println(ord.getJarCategoryTable().getJarCapacity()+"  ");
		}
		return ex_ord_date;
	}
	
	public void getValidSubscription(int id) 
	{
		List<Subscription> subList =  subscription_repo.getValidSubscriptionForMonth(id);
		for(Subscription sub : subList)
		{
			System.out.println(sub.getSubscriptionId()+"  "+sub.getSubscriptionStartDate()+" "+sub.getSubscriptionEndDate());
		}
	}
	
	public void addCustomerBill(int cust_id, int totalnoOfDays , int totalQuantity , int price)
    {
		customer_bill_repo.AddCustomerBill(cust_id ,totalnoOfDays , totalQuantity ,price );
	}
}
