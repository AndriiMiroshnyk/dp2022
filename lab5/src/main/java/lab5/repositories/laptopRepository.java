package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.entity.Laptop;

//@RepositoryRestResource(collectionResourceRel = "laptop", path = "laptop")

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface laptopRepository extends JpaRepository<Laptop, Long> {
	
	//List<Laptops> findByTitle(@Param("title") String title);
	
}
