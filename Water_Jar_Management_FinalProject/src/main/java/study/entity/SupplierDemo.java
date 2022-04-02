package study.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SupplierDemo {

	
	private String supplierFname;
	private String supplierLname;
	private String supplierAddress;
	private String supplierMobileNo;
	private String supplierWorkingArea;


	public SupplierDemo() {
		
	}

	

	public SupplierDemo(String supplierFname, String supplierLname, String supplierAddress,
			String supplierMobileNo, String supplierWorkingArea) {
		this.supplierFname = supplierFname;
		this.supplierLname = supplierLname;
		this.supplierAddress = supplierAddress;
		this.supplierMobileNo = supplierMobileNo;
	    this.supplierWorkingArea = supplierWorkingArea;
	}

	
	

	public String getSupplierFname() {
		return this.supplierFname;
	}

	public void setSupplierFname(String supplierFname) {
		this.supplierFname = supplierFname;
	}

	public String getSupplierLname() {
		return this.supplierLname;
	}

	public void setSupplierLname(String supplierLname) {
		this.supplierLname = supplierLname;
	}

	public String getSupplierAddress() {
		return this.supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	public String getSupplierMobileNo() {
		return this.supplierMobileNo;
	}

	public void setSupplierMobileNo(String supplierMobileNo) {
		this.supplierMobileNo = supplierMobileNo;
	}

    
	public String getSupplierWorkingArea() {
		return this.supplierWorkingArea;
	}

	public void setSupplierWorkingArea(String supplierWorkingArea) {
		this.supplierWorkingArea = supplierWorkingArea;
	}

	


	

	
	
	
}
