import business.abstracts.CustomerService;

import java.rmi.RemoteException;

import business.abstracts.CampaignService;
import business.concretes.CustomerManager;
import business.concretes.CampaignManager;
import dataAccess.concretes.HibernateCustomerDao;
import dataAccess.concretes.HibernateCampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Games;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import javax.swing.JDialog;
		
public class Main {
	public static void main(String[] args) throws RemoteException{
		
		new JDialog();
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("111111111111"),//BURAYA TC NO GÝRÝNÝZ
				"METÝN REHA",//ÝSÝM
				"ERMETÝN",//SOYÝSÝM
				2000//BURAYA DOÐUM YILINI GÝRÝNÝZ
				);
		System.out.println("doðrulama : " + (result ? "baþarýlý" : "baþarýsýz"));
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao());
		CampaignService campaignService = new CampaignManager(new HibernateCampaignDao());
		
		Customer Reha = new Customer("31","METÝN REHA","ERMETÝN",2000);
		Customer Batu = new Customer("32","Batu","Çetiner",2009);
		Games Bioshock = new Games("1","Bioshock",100,666);
		Games WoW = new Games("2","WoW",200,5000);
		Games Deponia = new Games("3","Deponia",30.99,27);
		Campaign ÝlkbaharÝndirimleri = new Campaign(1,"Ýlkbahar Ýndirimleri",50.00);
		Campaign YazÝndirimleri = new Campaign(2,"Yaz Ýndirimleri",30.00);
		Campaign SonbaharÝndirimleri = new Campaign(3,"Sonbahar Ýndirimleri",20.00);
		Campaign YeniyilÝndirimleri = new Campaign(4,"Yeniyil Ýndirimleri",40.00);
		
		
		customerService.add(Reha);
		customerService.update(Reha);
		customerService.delete(Reha);
		customerService.sepet(Bioshock, Batu);
		customerService.sepet(WoW, Reha);
		campaignService.sepet(SonbaharÝndirimleri, Bioshock, Batu);

	}
}