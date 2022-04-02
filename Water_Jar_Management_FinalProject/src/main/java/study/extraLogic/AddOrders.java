package study.extraLogic;

import java.util.List;

import org.springframework.stereotype.Component;
import study.entity.ExtraOrder;



@Component
public class AddOrders {

	public static void addOrders(List<ExtraOrder> list)
	{
		System.out.println("From Add Orders");
		for(ExtraOrder order : list)
		{
			System.out.println(order);
		}
	}
	
	
}
