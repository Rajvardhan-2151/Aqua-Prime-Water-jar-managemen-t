package study.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.ExtraOrder;

@Repository
public interface ExtraOrderRepository extends JpaRepository<ExtraOrder, Integer>{

	@Query(value="select * from extra_order_table where supplier_id=:supplier_id and order_delivery_date=curdate()" , nativeQuery = true)
	public List<ExtraOrder> getExtraOrderSupplier(@Param("supplier_id") int supplier_id);
	

	@Query(value="select * from extra_order_table where (order_date between :start_date and :end_id) and customer_id=:cust_id", nativeQuery = true) 
	public List<ExtraOrder> getExtraOrderForOrder( @Param("start_date") String start_date, @Param("end_id") String end_date, @Param("cust_id") int id);
	 
	
	@Query(value="select * from extra_order_table where (order_date between :start_date and :end_id) and customer_id=:cust_id", nativeQuery = true) 
	public List<ExtraOrder> getExtraOrderForBill( @Param("start_date") String start_date, @Param("end_id") String end_date, @Param("cust_id") int id);
	
	
	@Query(value="select count(*) from extra_order_table where order_delivery_date=curdate()" , nativeQuery = true)
	public Integer getOrderForProviderCount();
	
	@Query(value="select * from extra_order_table where customer_id=:cust_id" , nativeQuery = true)
	public List<ExtraOrder> getCustomerOrders(@Param("cust_id") int cust_id);

    
	@Query(value="select * from extra_order_table where (order_date between '2022-03-01' and '2022-04-01') and customer_id=:cust_id" , nativeQuery = true)
	public List<ExtraOrder> getNonSubscriptedExtraOrder(@Param("cust_id") int cust_id);


}
