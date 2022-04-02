package study.Constrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.Dao.OrdersDao;
import study.Dao.SubscriptionDao;
import study.Repository.ExtraOrderRepository;
import study.entity.ExtraOrder;
import study.entity.NonDelivery;
import study.entity.Subscription;

@Controller
public class OrdersController {

	@Autowired
	OrdersDao orderDao;
	
	@Autowired
	private SubscriptionDao sub_dao;
	
	@Autowired
	ExtraOrderRepository extr_repo;
	
	
	@GetMapping("/getOrders")
	public String getOrders(Model model ,   @RequestParam int cust_id)
	{
		try {
			List<Subscription> all_subscriptions = sub_dao.validSubscription(cust_id);
			List<ExtraOrder> subscripted_extraOrderList = new ArrayList<ExtraOrder>();
			List<ExtraOrder> extraOrder_nonSubscripted = null;
			List<NonDelivery> nonDelivery_order = null;
			
			if(all_subscriptions.isEmpty())
			{
				//Non Subscripted
				extraOrder_nonSubscripted	=  extr_repo.getNonSubscriptedExtraOrder(cust_id);
			}
			else
			{
				nonDelivery_order = orderDao.subscriptedOrderOfGivenCustomer(cust_id , all_subscriptions);
				
				for(Subscription sub_extraOrder : all_subscriptions)
				{
					List<ExtraOrder> extraSingleOrder= extr_repo.getExtraOrderForOrder(sub_extraOrder.getSubscriptionStartDate().toString(), sub_extraOrder.getSubscriptionEndDate().toString() , sub_extraOrder.getCustomerInfoTable().getCustomerId());
					for(ExtraOrder  extra_orders : extraSingleOrder)
					{
						subscripted_extraOrderList.add(extra_orders);
					}
					
				}
			}
		  	model.addAttribute("extraOrder_subscripted", subscripted_extraOrderList);
			model.addAttribute("extraOrder_nonSubscripted", extraOrder_nonSubscripted);
			model.addAttribute("nonDelivery_order", nonDelivery_order);
			
			return "/CustomerViews/ViewOrder";
		}
		catch(Exception e)
		{
			return "/CustomerViews/ViewOrder";
		}
		
	}
}
