package study.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.CustomerBill;

@Repository
public interface CustomerBillRepository extends JpaRepository<CustomerBill, Integer> {

	@Transactional
	@Modifying
	@Query(value="insert into customer_bill_table values(default , :cust_id, curdate(),month(curdate()), :totalNoOfDays , :totalQuantity, :totalPrice, 'Resolve')" , nativeQuery = true)
	public void AddCustomerBill(@Param("cust_id") int cust_id , @Param("totalNoOfDays") int totalNoOfDays, @Param("totalQuantity") int totalQuantity , @Param("totalPrice") int totalPrice);
	
	
}
