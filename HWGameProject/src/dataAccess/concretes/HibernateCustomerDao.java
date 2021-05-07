package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		
	}

	@Override
	public void update(Customer customer) {
		
	}

	@Override
	public void delete(Customer customer) {
		
	}

	@Override
	public void compare(Customer customer) {
		
	}

	@Override
	public Customer get(int id) {
		return null;
	}

	@Override
	public List<Customer> getAll() {
		return null;
	}

	@Override
	public void sepet(Games games, Customer customer) {
	}

	@Override
	public void sepet(Campaign campaign, Games games, Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
