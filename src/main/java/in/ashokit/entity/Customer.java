package in.ashokit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	private String name;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Orders> orders;

	public int getId() {
		return cusId;
	}

	public void setId(int id) {
		this.cusId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + cusId + ", name=" + name + ", orders=" + orders + "]";
	}

//	public Customer(int id, String name, List<Order> orders) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.orders = orders;
//	}
	
	                                                    
                                                                      
}
