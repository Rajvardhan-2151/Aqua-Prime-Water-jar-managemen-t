package study.Constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import study.Dao.ComplaintDao;
import study.Repository.ComplaintRepository;
import study.entity.ComplaintTable;

@Controller
public class ComaplaintController {

	@Autowired
	ComplaintDao complaint_dao;
	
	@Autowired
	private ComplaintRepository comapliant_repo;
	
	
	@PostMapping("/")
	public String addComaplaint(Model model , @RequestParam int customer_id ,@RequestParam String info)
	{
		try {
			List<ComplaintTable> complaints = null;
			boolean returnStatus = complaint_dao.addComplaint(customer_id, info, "UnResolved");
			if(returnStatus)
			{
				complaints =  complaint_dao.getCompalint(customer_id);
			}
			model.addAttribute("comp", complaints);
			
			return "/CustomerViews/AfterCustomerLogin";
		}
		catch(Exception e)
		{
			return "/CustomerViews/AfterCustomerLogin";
		}
		
	}
	
	
	
	@GetMapping("/redirectComapliant")
	public String redirectComaplintPage( Model model, @RequestParam int customer_id)
	{
		model.addAttribute("customer_id", customer_id);
		return "/CustomerViews/AddComplaint";
	}
}
