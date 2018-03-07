package tn.esprit.bondsLiga.bondsLigua_server.services;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.bondsLiga.bondsLigua_server.interfaces.companyServices;
import tn.esprit.bondsLiga.bondsLigua_server.persistence.Company;

@Stateless
public class companyServiceImpl implements companyServices{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addCompany(Company c) {
		entityManager.persist(c);
		
	}

	@Override
	public Company searchById(int id) {
		return entityManager.find(Company.class, id);
	}

	@Override
	public void delete(int id) {
		entityManager.remove(searchById(id));
		
	}

	@Override
	public void updateCompany(Company c) {
		entityManager.merge(c);
		
	}

	@Override
	public List<Company> getAllCompany() {
       TypedQuery<Company> query = entityManager.createQuery("Select c from Company c", Company.class);
		

		return query.getResultList();
	}

	
	


	

}
