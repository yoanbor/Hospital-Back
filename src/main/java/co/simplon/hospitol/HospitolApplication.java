package co.simplon.hospitol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class responsible for running the Hospitol application.
 */
@SpringBootApplication
public class HospitolApplication {

    /**
     * Main method to start the Hospitol application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(HospitolApplication.class, args);
    }

}
