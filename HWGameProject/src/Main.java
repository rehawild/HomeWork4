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
				Long.parseLong("111111111111"),//BURAYA TC NO G�R�N�Z
				"MET�N REHA",//�S�M
				"ERMET�N",//SOY�S�M
				2000//BURAYA DO�UM YILINI G�R�N�Z
				);
		System.out.println("do�rulama : " + (result ? "ba�ar�l�" : "ba�ar�s�z"));
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao());
		CampaignService campaignService = new CampaignManager(new HibernateCampaignDao());
		
		Customer Reha = new Customer("31","MET�N REHA","ERMET�N",2000);
		Customer Batu = new Customer("32","Batu","�etiner",2009);
		Games Bioshock = new Games("1","Bioshock",100,666);
		Games WoW = new Games("2","WoW",200,5000);
		Games Deponia = new Games("3","Deponia",30.99,27);
		Campaign �lkbahar�ndirimleri = new Campaign(1,"�lkbahar �ndirimleri",50.00);
		Campaign Yaz�ndirimleri = new Campaign(2,"Yaz �ndirimleri",30.00);
		Campaign Sonbahar�ndirimleri = new Campaign(3,"Sonbahar �ndirimleri",20.00);
		Campaign Yeniyil�ndirimleri = new Campaign(4,"Yeniyil �ndirimleri",40.00);
		
		
		customerService.add(Reha);
		customerService.update(Reha);
		customerService.delete(Reha);
		customerService.sepet(Bioshock, Batu);
		customerService.sepet(WoW, Reha);
		campaignService.sepet(Sonbahar�ndirimleri, Bioshock, Batu);

	}
}