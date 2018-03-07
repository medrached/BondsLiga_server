package tn.esprit.bondsLiga.bondsLigua_server.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.bondsLiga.bondsLigua_server.interfaces.companyServices;
import tn.esprit.bondsLiga.bondsLigua_server.interfaces.shareServices;
import tn.esprit.bondsLiga.bondsLigua_server.persistence.Company;
import tn.esprit.bondsLiga.bondsLigua_server.persistence.Share;
@Stateless
public class shareServiceImpl implements shareServices {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addShare(Share S) {
		entityManager.persist(S);
		
	}

	@Override
	public Share searchById(int id) {
		return entityManager.find(Share.class, id);
	}

	@Override
	public void delete(int id) {
		entityManager.remove(searchById(id));
		
	}

	@Override
	public void updateShare(Share S) {
		entityManager.merge(S);
		
	}
	

}
