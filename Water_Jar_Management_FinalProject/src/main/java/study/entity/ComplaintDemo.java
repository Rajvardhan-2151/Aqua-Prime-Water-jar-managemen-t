package study.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComplaintDemo {

    private String customer_name;
	private String complaintInfo;
	private Date complaintDate;
	private String status;
	
	public ComplaintDemo()
	{
		
	}
	
	
	public ComplaintDemo( String customer_name , String status, String complaintInfo, Date complaintDate) {
		this.customer_name = customer_name;
		this.status = status;
		this.complaintInfo = complaintInfo;
		this.complaintDate = complaintDate;
	}
	
	
	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getComplaintInfo() {
		return complaintInfo;
	}
	public void setComplaintInfo(String complaintInfo) {
		this.complaintInfo = complaintInfo;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	
	
	
}
