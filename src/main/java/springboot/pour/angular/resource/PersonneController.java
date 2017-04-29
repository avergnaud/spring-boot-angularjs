package springboot.pour.angular.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.Personne;
import springboot.PersonneRepository;

/**
Tester l'API /personnes avec et sans cette classe...
 */
@RestController
@RequestMapping("/personnes")
public class PersonneController {
	
	  @Autowired
	  private PersonneRepository repo;
	  
	  @RequestMapping(method = RequestMethod.GET)
	  public List<Personne> findItems() {
	    return (List<Personne>)repo.findAll();
	  }
	  	  
	  @RequestMapping(method = RequestMethod.POST)
	  public Personne addItem(@RequestBody Personne personne) {
		personne.setId(null);
	    return repo.save(personne);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public Personne updatePersonne(@RequestBody Personne updatedPersonne, @PathVariable Integer id) {
		  updatedPersonne.setId(id);
	    return repo.save(updatedPersonne);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteItem(@PathVariable Integer id) {
	    repo.delete(id);
	  }
}
