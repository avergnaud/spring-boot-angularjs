package springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
Sera automatiquement mappée par Spring-Boot sur http://localhost:8090/api/personnes
*/
@Entity
public class Personne {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Integer id;
    private String prenom;

    private Personne() { }
    
	public Personne(String prenom) {
        this.prenom = prenom;
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
