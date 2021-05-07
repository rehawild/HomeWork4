package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public interface CampaignService {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	public void sepet(Campaign campaign, Games games, Customer customer);		
}
