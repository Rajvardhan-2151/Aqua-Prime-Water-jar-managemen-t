package study.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import study.entity.ComplaintTable;


@Repository
public interface ComplaintRepository extends JpaRepository<ComplaintTable, Integer>{

	@Modifying
	@Transactional
	@Query(value="insert into complaint_table values(default , :customer_id , :info, curdate(), :status)" , nativeQuery = true) 
	public void AddComplaint(@Param("customer_id")int customer_id, @Param("info")String info, @Param("status")String status);

	@Query(value="select * from complaint_table where customer_id=:cust_id" , nativeQuery = true) 
	public List<ComplaintTable>  ViewComplaints(@Param("cust_id")int cust_id);
	
	
}
