package study.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.ExtraOrder;

@Repository
public interface OrderRepository extends JpaRepository<ExtraOrder, Integer>{
 
	@Query(value="select * from extra_order_table where customer_id=:cust_id" , nativeQuery = true)
	public List<ExtraOrder> getExtraOrders(@Param("cust_id") int id); 
	
	
	@Query(value="select subscription_id from subscription_table where customer_id=:cust_id" ,nativeQuery = true)
	public List<Integer> getSuscriptiondetails(@Param("cust_id") int cust_id);
	
	@Query(value="select count(*) from extra_order_table where order_delivery_date=curdate()" ,nativeQuery = true)
	public Integer getDailyOrderCount();
	
}
