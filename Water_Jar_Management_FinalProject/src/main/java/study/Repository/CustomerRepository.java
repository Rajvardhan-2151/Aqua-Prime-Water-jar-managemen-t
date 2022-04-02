package study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	//public Customer findBycustomer_username(String Customer_username );
	@Query(value="select * from customer_info_table where customer_username=:cust_username" , nativeQuery = true)
	public Customer getcustomerByUsername(@Param("cust_username") String cust_username);
}
