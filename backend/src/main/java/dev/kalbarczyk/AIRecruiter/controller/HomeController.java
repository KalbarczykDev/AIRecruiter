package dev.kalbarczyk.AIRecruiter.controller;

import dev.kalbarczyk.AIRecruiter.model.JobOffer;
import dev.kalbarczyk.AIRecruiter.repository.JobOfferRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {

  private final JobOfferRepository jobOfferRepository;

  @Autowired
  public HomeController(JobOfferRepository jobOfferRepository) {
    this.jobOfferRepository = jobOfferRepository;
  }

  @GetMapping("/")
  public Map<String, String> index() {

    Map<String, String> response = new HashMap<>();
    response.put("message", "Home Controller works!");
    return response;
  }

  @GetMapping("/api/job-offers")
  public List<JobOffer> getJobOffers() {
    System.out.println("Fetching job offers from the repository...");

    List<JobOffer> jobOffers = jobOfferRepository.findAll();
    System.out.println("Job offers fetched: " + jobOffers.size());
    for (JobOffer jobOffer : jobOffers) {
      System.out.println(
          "Job Offer ID: " + jobOffer.getId() + ", Name: " + jobOffer.getOfferName());
    }
    return jobOffers;
  }
}
