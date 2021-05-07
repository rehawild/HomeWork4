package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;

public class CampaignManager implements CampaignService{

	private CampaignDao campaigndao;
	
	public CampaignManager(CampaignDao campaigndao) {
		super();
		this.campaigndao = campaigndao;
	}

	@Override
	public void add(Campaign campaign) {
		this.campaigndao.add(campaign);
		return;
	}

	@Override
	public void update(Campaign campaign) {
		this.campaigndao.update(campaign);
		return;
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaigndao.delete(campaign);
		return;
	}


	@Override
	public void sepet(Campaign campaign, Games games, Customer customer) {
		double newprice  = games.getPrice() - (campaign.getPercent() * games.getPrice() / 100);
		System.out.println(games.getName() + " isimli oyun " + campaign.getName() + " kapsam�nda %" + campaign.getPercent() + " indirimle "
		+ newprice  + " indirimli fiyat�yla " + customer.getName()
		+ " isimli kullan�c�n�n sepetine aktar�lm��t�r");		
		this.campaigndao.sepet(campaign,games,customer);
	}

}
