package dev.kalbarczyk.AIRecruiter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("job_offers")
public class JobOffer {

  @Id private Long id;
  private String offerName;
  private String offerDescription;
}
