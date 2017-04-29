package springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneRepository extends CrudRepository<Personne, Integer> {

}
