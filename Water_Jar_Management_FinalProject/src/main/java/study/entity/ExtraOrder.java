package study.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "extra_order_table", catalog = "water_jar_management")
public class ExtraOrder implements java.io.Serializable {

	private Integer orderId;
	private Customer customer;
	private JarCategory jarCategory;
	private Supplier supplier;
	private Date orderDate;
	private Integer jarQauntity;
	private Date orderDeliveryDate;
	private String orderStatus;

	public ExtraOrder() {
	}

	public ExtraOrder(Customer customer, JarCategory jarCategory,
			Supplier supplier) {
		this.customer = customer;
		this.jarCategory = jarCategory;
		this.supplier = supplier;
	}

	public ExtraOrder(Customer customer, JarCategory jarCategory,
			Supplier supplier, Date orderDate, Integer jarQauntity, Date orderDeliveryDate,
			String orderStatus) {
		this.customer = customer;
		this.jarCategory = jarCategory;
		this.supplier = supplier;
		this.orderDate = orderDate;
		this.jarQauntity = jarQauntity;
		this.orderDeliveryDate = orderDeliveryDate;
		this.orderStatus = orderStatus;
	}
	
	public ExtraOrder(Date delivery_date, int quantity , int supplier_id)
	{
		this.orderDeliveryDate = delivery_date;
		this.jarQauntity = quantity;
		/* this.supplier = supplier_id; */
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	public Customer getCustomerInfoTable() {
		return this.customer;
	}

	public void setCustomerInfoTable(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public JarCategory getJarCategoryTable() {
		return this.jarCategory;
	}

	public void setJarCategoryTable(JarCategory jarCategory) {
		this.jarCategory = jarCategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id", nullable = false)
	public Supplier getSupplierInfoTable() {
		return this.supplier;
	}

	public void setSupplierInfoTable(Supplier supplier) {
		this.supplier = supplier;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "jar_qauntity")
	public Integer getJarQauntity() {
		return this.jarQauntity;
	}

	public void setJarQauntity(Integer jarQauntity) {
		this.jarQauntity = jarQauntity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_delivery_date", length = 19)
	public Date getOrderDeliveryDate() {
		return this.orderDeliveryDate;
	}

	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}

	@Column(name = "order_status", length = 100)
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "ExtraOrder [orderId=" + orderId + ", customer=" + customer + ", jarCategory=" + jarCategory
				+ ", supplier=" + supplier + ", orderDate=" + orderDate + ", jarQauntity=" + jarQauntity
				+ ", orderDeliveryDate=" + orderDeliveryDate + ", orderStatus=" + orderStatus + "]";
	}
	
	

}
