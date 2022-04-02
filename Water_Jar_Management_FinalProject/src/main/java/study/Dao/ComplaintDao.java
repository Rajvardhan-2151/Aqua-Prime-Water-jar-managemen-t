package study.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.Repository.ComplaintRepository;
import study.entity.ComplaintTable;


@Service
public class ComplaintDao {

	@Autowired
	private ComplaintRepository comapliant_repo;
	
	
	public ComplaintTable getsingleComplaint(Integer comp_id)
	{
		return comapliant_repo.findById(comp_id).get();
	}
	
	
	
	public List<ComplaintTable> getCompalint(int id)
	{
		List<ComplaintTable> comp = comapliant_repo.ViewComplaints(id);
		return comp;
	}
	
	
	
	public boolean addComplaint( int customer_id , String info , String status)
	{
		System.out.println(customer_id+"  "+info+"  "+status);
		comapliant_repo.AddComplaint(customer_id, info, status);
		return true;
	}
	
	
	
	
}
