package in.ashokit.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	private String orderItem;
	
	@CreationTimestamp
	private LocalDateTime orderTime;
	
	@ManyToOne
	@JoinColumn(name = "cus_id")
	private Customer customer;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderItem=" + orderItem + ", orderTime=" + orderTime + ", customer="
				+ customer + "]";
	}

//	public Order(int orderId, String orderItem, LocalDateTime orderTime, Customer customer) {
//		super();
//		this.orderId = orderId;
//		this.orderItem = orderItem;
//		this.orderTime = orderTime;
//		this.customer = customer;
//	}
//	

}
