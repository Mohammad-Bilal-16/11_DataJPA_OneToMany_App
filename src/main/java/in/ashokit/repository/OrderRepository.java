package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
