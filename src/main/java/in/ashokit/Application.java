package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Address;
import in.ashokit.entity.Customer;
import in.ashokit.entity.Employee;
import in.ashokit.entity.Orders;
import in.ashokit.repository.AddressRepository;
import in.ashokit.repository.CustomerRepository;
import in.ashokit.repository.EmpRepository;
import in.ashokit.repository.OrderRepository;

@SpringBootApplication
public class Application {

    private final CustomerRepository customerRepository;

    Application(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);
		AddressRepository addrReposiotry = context.getBean(AddressRepository.class);

		Employee e = new Employee();
		e.setEmpName("Raja");
		e.setEmpSalary(4000.00);

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setCountry("India");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setCity("GNT");
		a2.setState("AP");
		a2.setCountry("India");
		a2.setEmp(e);

		 //setting addresses to emp
		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAddr(addrList);

		// empRepository.save(e);

		// empRepository.findById(2);

		// empRepository.deleteById(1);

		// addrReposiotry.findById(3);
		
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		OrderRepository orderRepository = context.getBean(OrderRepository.class);
		
		Customer c = new Customer();
		c.setName("Alex");
		
		Orders o1 = new Orders();
		o1.setOrderItem("Biryani");
		
		Orders o2 = new Orders();
		o2.setOrderItem("Panner-tikka");
		
		List<Orders> list = Arrays.asList(o1, o2);
		
		c.setOrders(list);
		
		customerRepository.save(c);
		customerRepository.findById(1);
		
	}
}
