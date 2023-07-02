package tech.homie.spring.api.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tech.homie.spring.api.documents.Stock;


@RepositoryRestResource(collectionResourceRel = "stocks", path = "stocks")
public interface StockRepository extends MongoRepository<Stock, String> {
	
	Stock findByTickerSymbol(@Param("tickerSymbol") String tickerSymbol);

}
