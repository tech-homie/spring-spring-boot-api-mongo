package tech.homie.spring.api.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tech.homie.spring.api.documents.OptionsContract;

@RepositoryRestResource(collectionResourceRel = "contracts", path = "contracts")
public interface OptionsContractRepository extends MongoRepository<OptionsContract, String> {

}
