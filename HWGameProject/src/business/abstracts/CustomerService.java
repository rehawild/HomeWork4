package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void compare(Customer customer);
	public void sepet(Games games, Customer customer);
	public void sepet(Campaign campaign, Games games, Customer customer);
	List<Customer> getAll();
}
