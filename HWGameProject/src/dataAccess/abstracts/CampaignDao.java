package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public interface CampaignDao {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	Campaign get(int id);
	List<Campaign> getAll();
	public void sepet(Campaign campaign, Games games, Customer customer);		
}
