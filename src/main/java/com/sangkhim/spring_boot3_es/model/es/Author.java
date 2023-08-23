package com.sangkhim.spring_boot3_es.model.es;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author implements Serializable {

  private static final long serialVersionUID = 7156526077883281623L;

  @Id private long id;

  @Field(name = "name", type = FieldType.Text)
  private String name;
}
