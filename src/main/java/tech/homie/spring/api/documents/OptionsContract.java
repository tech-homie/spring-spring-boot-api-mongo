package tech.homie.spring.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document
public class OptionsContract {
	
	
    @Id 
    String id;
    
    Double bidPrice;
    
    Double askPrice;
    
    @Indexed(direction = IndexDirection.ASCENDING)
    Double strikePrice;
    
    @DocumentReference(lazy=true)
    private Stock stock;
    
    @DocumentReference(lazy=true)
    private ExpirationDate expirationDate;

}
