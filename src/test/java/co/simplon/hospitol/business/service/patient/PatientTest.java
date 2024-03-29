package co.simplon.hospitol.business.service.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import co.simplon.hospitol.persistance.entity.Patient;

@SpringBootTest
class PatientTest {

    // test unitaire
    @Test
    void testPatientCreation() {

        // Je créé un nouveau patient
        Patient patient = new Patient();

        patient.setName("Ali");
        patient.setFirstname("Saif");
        patient.setDob(new Date());
        patient.setSecuritySocialNumber("1923929392");


        // Vérifie si l'objet patient n'est pas null
        assertNotNull(patient);

        // Vérifie si les valeurs définit dans l'objet patient correspond aux valeur
        // attendue
        assertEquals("Poteau", patient.getName());
        assertEquals("Florian", patient.getFirstname());
        assertNotNull(patient.getDob());
        assertEquals("1923929392", patient.getSecuritySocialNumber());

    }
}