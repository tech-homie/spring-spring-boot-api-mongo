package tech.homie.spring.api.repos;

import java.time.ZonedDateTime;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tech.homie.spring.api.documents.ExpirationDate;


@RepositoryRestResource(collectionResourceRel = "expirations", path = "expirations")
public interface ExpirationDateRepository extends MongoRepository<ExpirationDate, String> {
	
	
	ExpirationDate findByExpirationDate(@Param("expirationDate") ZonedDateTime expirationDate);


}
 