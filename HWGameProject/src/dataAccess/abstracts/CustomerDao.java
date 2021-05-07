package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public interface CustomerDao {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void compare(Customer customer);
	Customer get(int id);
	List<Customer> getAll();
	void sepet(Games games, Customer customer);
	void sepet(Campaign campaign, Games games, Customer customer);

}
