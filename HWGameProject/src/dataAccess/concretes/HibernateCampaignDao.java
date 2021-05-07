package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;


public class HibernateCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý sistemden silindi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý güncellendi");
		
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void sepet(Campaign campaign, Games games, Customer customer) {
	}


}
