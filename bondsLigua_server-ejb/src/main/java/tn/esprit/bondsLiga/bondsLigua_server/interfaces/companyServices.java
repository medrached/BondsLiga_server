package tn.esprit.bondsLiga.bondsLigua_server.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.bondsLiga.bondsLigua_server.persistence.Company;

@Remote
public interface companyServices {
	void addCompany(Company c);
	Company searchById(int id);
	void delete(int id);
	void updateCompany(Company c);
	public List<Company> getAllCompany();
	//List<TradingExchange> findAll();

}
