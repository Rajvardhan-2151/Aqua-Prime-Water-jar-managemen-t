package study.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import study.entity.NonDelivery;


@Repository
public interface NonDeliveryRepository extends JpaRepository<NonDelivery, Integer>{

	
	@Query(value="select * from non_delivery_record where non_delivery_date=curdate()" ,nativeQuery = true) 
	public List<NonDelivery> getNonDeliveryDate();
	 
	
	@Query(value="select count(*) from non_delivery_record where (non_delivery_date between :start_date and :end_date) and subscription_id=:sub_id" , nativeQuery = true)
	public Integer getNonDeliveryCount(@Param("start_date") String start_date , @Param("end_date") String end_date , @Param("sub_id") int sub_id);
	
	@Query(value="select * from non_delivery_record where (non_delivery_date between :start_date and :end_date) and subscription_id=:sub_id" , nativeQuery = true)
	public NonDelivery getNonDeliveryObjectForOrdrs(@Param("start_date") String start_date , @Param("end_date") String end_date , @Param("sub_id") int sub_id);
	
	@Query(value="select * from non_delivery_record where subscription_id=:sup_id and non_delivery_date=curdate();" , nativeQuery = true)
	public NonDelivery getNonDeliveryDateForSupplier(@Param("sup_id") int sup_id);
	
}
