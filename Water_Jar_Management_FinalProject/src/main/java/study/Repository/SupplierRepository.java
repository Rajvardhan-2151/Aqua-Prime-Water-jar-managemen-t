package study.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import study.entity.Customer;
import study.entity.ExtraOrder;
import study.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(
	 * value="insert into subscription_table values(default , :cust_id , :cate_id , :sup_id, :start_date, :end_date , :status"
	 * ) public void addSubscription(@Param("cust_id") int cust_id
	 * , @Param("cate_id") int cate_id , @Param("sup_id") int sup_id
	 * , @Param("start_date") String start_date , @Param("end_date") String
	 * end_date, @Param("status") String status);
	 */
	
	
	@Query(value="select * from supplier_info_table where supplier_username=:sup_name", nativeQuery = true)
	public Supplier getSupplierByUsername(@Param("sup_name") String sup_name);
	

	
}
