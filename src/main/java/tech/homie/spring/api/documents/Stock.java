package tech.homie.spring.api.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import lombok.Data;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document
public class Stock {
	
	
    @Id 
    String id;
	
    String companyName;
    
    @Indexed(direction = IndexDirection.ASCENDING)
    String tickerSymbol;
    
    @DocumentReference
    List<OptionsContract> optionsContracts;

}
