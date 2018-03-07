package tn.esprit.bondsLiga.bondsLigua_server.interfaces;

import javax.ejb.Remote;

import tn.esprit.bondsLiga.bondsLigua_server.persistence.Company;
import tn.esprit.bondsLiga.bondsLigua_server.persistence.Share;
@Remote

public interface shareServices {
	void addShare(Share S);
	Share searchById(int id);
	void delete(int id);
	void updateShare(Share c);
}
