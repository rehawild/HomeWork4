package business.concretes;

import java.util.List;

import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	public void add(Customer customer) {
		this.customerDao.add(customer);
		System.out.println("Kullanýcý sisteme eklendi: " + customer.getName());
		return;
	}

	@Override
	public List<Customer> getAll() {
		return null;
	}

	@Override
	public void update(Customer customer) {
		this.customerDao.update(customer);
		System.out.println("Kullanýcý güncellendi: " + customer.getName());

	}

	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
		System.out.println("Kullanýcý silindi: " + customer.getName());

	}

	@Override
	public void compare(Customer customer) {
		
	}

	@Override
	public void sepet(Games games, Customer customer) {
		System.out.println(games.getName() + " oyunu " + games.getPrice()
				+ " tl fiyatýyla " + customer.getName() + " isimli kullanýcýnýn sepetine aktarýlmýþtýr");
		this.customerDao.sepet(games, customer);

	}

	@Override
	public void sepet(Campaign campaign, Games games, Customer customer) {
		this.customerDao.sepet(campaign, games, customer);

	}

}
