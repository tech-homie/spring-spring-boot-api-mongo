package tech.homie.spring.api.documents;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

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
public class ExpirationDate {
	
	
	@Id 
    String id;
	
    @Indexed(direction = IndexDirection.ASCENDING)
	ZonedDateTime expirationDate;
	
    @DocumentReference
    List<OptionsContract> optionContracts;

}
