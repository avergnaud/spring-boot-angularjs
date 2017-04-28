package springboot;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
Sera automatiquement mappée par Spring-Boot sur http://localhost:8090/api/personnes
*/
@Data
@Entity
public class Personne {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String prenom;
    private String nom;

    private Personne() {}

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
}
