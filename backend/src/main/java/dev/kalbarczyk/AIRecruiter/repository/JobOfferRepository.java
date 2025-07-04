package dev.kalbarczyk.AIRecruiter.repository;

import dev.kalbarczyk.AIRecruiter.model.JobOffer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends CrudRepository<JobOffer, Long> {
  List<JobOffer> findAll();
}
