package study.entity;
// Generated 26 Mar, 2022 8:59:56 AM by Hibernate Tools 5.2.10.Final

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
@Table(name = "customer_info_table", catalog = "water_jar_management", uniqueConstraints = {
		@UniqueConstraint(columnNames = "customer_password"), @UniqueConstraint(columnNames = "customer_username") })
public class Customer implements java.io.Serializable {

	private Integer customerId;
	private String customerFname;
	private String customerLname;
	private String customerAddress;
	private String customerMobileNo;
	private String customerEmail;
	private String customerUsername;
	private String customerPassword;
	private int customerPincode;
	private String customerDeliveryAddress;
	private Set customerBillTables = new HashSet(0);
	private Set extraOrderTables = new HashSet(0);
	private Set complaintTables = new HashSet(0);
	private Set subscriptionTables = new HashSet(0);

	public Customer() {
	}

	public Customer(String customerFname, String customerLname, String customerAddress,
			String customerUsername, String customerPassword, int customerPincode) {
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerAddress = customerAddress;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerPincode = customerPincode;
	}

	public Customer(String customerFname, String customerLname, String customerAddress,
			String customerMobileNo, String customerEmail, String customerUsername, String customerPassword,
			int customerPincode, String customerDeliveryAddress) {
		
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerPincode = customerPincode;
		this.customerDeliveryAddress = customerDeliveryAddress;
	
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "customer_id", unique = true, nullable = false)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "customer_fname", nullable = false, length = 100)
	public String getCustomerFname() {
		return this.customerFname;
	}

	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	@Column(name = "customer_lname", nullable = false, length = 100)
	public String getCustomerLname() {
		return this.customerLname;
	}

	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}

	@Column(name = "customer_address", nullable = false, length = 300)
	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Column(name = "customer_mobile_no", length = 100)
	public String getCustomerMobileNo() {
		return this.customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	@Column(name = "customer_email", length = 100)
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Column(name = "customer_username", unique = true, nullable = false, length = 100)
	public String getCustomerUsername() {
		return this.customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	@Column(name = "customer_password", unique = true, nullable = false, length = 100)
	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Column(name = "customer_pincode", nullable = false)
	public int getCustomerPincode() {
		return this.customerPincode;
	}

	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}

	@Column(name = "customer_delivery_address", length = 200)
	public String getCustomerDeliveryAddress() {
		return this.customerDeliveryAddress;
	}

	public void setCustomerDeliveryAddress(String customerDeliveryAddress) {
		this.customerDeliveryAddress = customerDeliveryAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public Set<CustomerBill> getCustomerBillTables() {
		return this.customerBillTables;
	}

	public void setCustomerBillTables(Set customerBillTables) {
		this.customerBillTables = customerBillTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public Set<ExtraOrder> getExtraOrderTables() {
		return this.extraOrderTables;
	}

	public void setExtraOrderTables(Set extraOrderTables) {
		this.extraOrderTables = extraOrderTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public Set<ComplaintTable> getComplaintTables() {
		return this.complaintTables;
	}

	public void setComplaintTables(Set complaintTables) {
		this.complaintTables = complaintTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public Set<Subscription> getSubscriptionTables() {
		return this.subscriptionTables;
	}

	public void setSubscriptionTables(Set subscriptionTables) {
		this.subscriptionTables = subscriptionTables;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFname=" + customerFname + ", customerLname="
				+ customerLname + ", customerAddress=" + customerAddress + ", customerMobileNo=" + customerMobileNo
				+ ", customerEmail=" + customerEmail + ", customerUsername=" + customerUsername + ", customerPassword="
				+ customerPassword + ", customerPincode=" + customerPincode + ", customerDeliveryAddress="
				+ customerDeliveryAddress + ", customerBillTables=" + customerBillTables + ", extraOrderTables="
				+ extraOrderTables + ", complaintTables=" + complaintTables + ", subscriptionTables="
				+ subscriptionTables + "]";
	}
	
	

}
