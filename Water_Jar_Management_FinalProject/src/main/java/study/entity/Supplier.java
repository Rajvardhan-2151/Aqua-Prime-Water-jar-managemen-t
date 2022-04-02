package study.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "supplier_info_table", catalog = "water_jar_management", uniqueConstraints = {
		@UniqueConstraint(columnNames = "supplier_password"), @UniqueConstraint(columnNames = "supplier_username") })
public class Supplier implements java.io.Serializable {

	private Integer supplierId;
	private String supplierFname;
	private String supplierLname;
	private String supplierAddress;
	private String supplierMobileNo;
	private String supplierEmail;
	private String supplierUsername;
	private String supplierPassword;
	private String supplierWorkingArea;
	private Integer supplerWorkingAreaPincode;
	private Set subscriptionTables = new HashSet(0);
	private Set extraOrderTables = new HashSet(0);

	public Supplier() {
	}

	public Supplier(String supplierUsername, String supplierPassword) {
		this.supplierUsername = supplierUsername;
		this.supplierPassword = supplierPassword;
	}

	public Supplier(String supplierFname, String supplierLname, String supplierAddress,
			String supplierMobileNo, String supplierEmail, String supplierUsername, String supplierPassword,
			String supplierWorkingArea, Integer supplerWorkingAreaPincode) {
		this.supplierFname = supplierFname;
		this.supplierLname = supplierLname;
		this.supplierAddress = supplierAddress;
		this.supplierMobileNo = supplierMobileNo;
		this.supplierEmail = supplierEmail;
		this.supplierUsername = supplierUsername;
		this.supplierPassword = supplierPassword;
		this.supplierWorkingArea = supplierWorkingArea;
		this.supplerWorkingAreaPincode = supplerWorkingAreaPincode;
		
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "supplier_id", unique = true, nullable = false)
	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@Column(name = "supplier_fname", length = 100)
	public String getSupplierFname() {
		return this.supplierFname;
	}

	public void setSupplierFname(String supplierFname) {
		this.supplierFname = supplierFname;
	}

	@Column(name = "supplier_lname", length = 100)
	public String getSupplierLname() {
		return this.supplierLname;
	}

	public void setSupplierLname(String supplierLname) {
		this.supplierLname = supplierLname;
	}

	@Column(name = "supplier_address", length = 100)
	public String getSupplierAddress() {
		return this.supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Column(name = "supplier_mobile_no", length = 100)
	public String getSupplierMobileNo() {
		return this.supplierMobileNo;
	}

	public void setSupplierMobileNo(String supplierMobileNo) {
		this.supplierMobileNo = supplierMobileNo;
	}

	@Column(name = "supplier_email", length = 100)
	public String getSupplierEmail() {
		return this.supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	@Column(name = "supplier_username", unique = true, nullable = false, length = 100)
	public String getSupplierUsername() {
		return this.supplierUsername;
	}

	public void setSupplierUsername(String supplierUsername) {
		this.supplierUsername = supplierUsername;
	}

	@Column(name = "supplier_password", unique = true, nullable = false, length = 100)
	public String getSupplierPassword() {
		return this.supplierPassword;
	}

	public void setSupplierPassword(String supplierPassword) {
		this.supplierPassword = supplierPassword;
	}

	@Column(name = "supplier_working_area", length = 100)
	public String getSupplierWorkingArea() {
		return this.supplierWorkingArea;
	}

	public void setSupplierWorkingArea(String supplierWorkingArea) {
		this.supplierWorkingArea = supplierWorkingArea;
	}

	@Column(name = "suppler_working_area_pincode")
	public Integer getSupplerWorkingAreaPincode() {
		return this.supplerWorkingAreaPincode;
	}

	public void setSupplerWorkingAreaPincode(Integer supplerWorkingAreaPincode) {
		this.supplerWorkingAreaPincode = supplerWorkingAreaPincode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierInfoTable")
	public Set<Subscription> getSubscriptionTables() {
		return this.subscriptionTables;
	}

	public void setSubscriptionTables(Set subscriptionTables) {
		this.subscriptionTables = subscriptionTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierInfoTable")
	public Set<ExtraOrder> getExtraOrderTables() {
		return this.extraOrderTables;
	}

	public void setExtraOrderTables(Set extraOrderTables) {
		this.extraOrderTables = extraOrderTables;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierFname=" + supplierFname + ", supplierLname="
				+ supplierLname + ", supplierAddress=" + supplierAddress + ", supplierMobileNo=" + supplierMobileNo
				+ ", supplierEmail=" + supplierEmail + ", supplierUsername=" + supplierUsername + ", supplierPassword="
				+ supplierPassword + ", supplierWorkingArea=" + supplierWorkingArea + ", supplerWorkingAreaPincode="
				+ supplerWorkingAreaPincode + ", subscriptionTables=" + subscriptionTables + ", extraOrderTables="
				+ extraOrderTables + "]";
	}
	
	
	

}
