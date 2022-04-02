package study.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import study.entity.Subscription;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer>{

	//public List<Subscription> findBysupplier_id(int id);
	@Query(value="select * from subscription_table where supplier_id=:sup_id" , nativeQuery = true)
	public List<Subscription> findBysupplier_id(@Param("sup_id") int sup_id);
	
	
	@Query(value="select * from subscription_table where (curdate() < subscription_end_date) and (subscription_id not in (select subscription_id from subscription_table natural join non_delivery_record))" , nativeQuery = true)
	public List<Subscription> GetSubscriptedOrders();
	
	
	@Query(value="select * from subscription_table where (customer_id=:cust_id) and (curdate() < subscription_end_date)",nativeQuery=true)
	public List<Subscription> getValidSubscriptionForMonth(@Param("cust_id") int id);

	

	@Query(value="select * from subscription_table where supplier_id=:sup_id and (curdate()<subscription_end_date)",nativeQuery=true)
	public List<Subscription> getSubscriptedOrderForSuplier(@Param("sup_id") int id);
	
	@Query(value="select * from subscription_table where curdate() < subscription_end_date",nativeQuery=true)
	public List<Subscription> getSubscriptionrecordForMeasurecount();
}
