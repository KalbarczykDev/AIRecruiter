package dev.kalbarczyk.AIRecruiter;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiRecruiterApplication {

  public static void main(String[] args) {

    try {
      Dotenv dotenv = Dotenv.load();
      dotenv
          .entries()
          .forEach(
              entry -> {
                System.setProperty(entry.getKey(), entry.getValue());
                System.out.println(
                    "DEBUG: Loaded env var: " + entry.getKey() + "=" + entry.getValue());
              });
    } catch (Exception e) {
      e.printStackTrace();
    }
    SpringApplication.run(AiRecruiterApplication.class, args);
  }
}
