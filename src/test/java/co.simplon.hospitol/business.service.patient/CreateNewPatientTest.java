package co.simplon.hospitol.business.service.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import co.simplon.hospitol.persistance.entity.Patient;

@SpringBootTest
class CreateNewPatientTest {

    @Test
    void CreateNewPatientTest() {

        // Je créé un nouveau patient
        Patient patient = new Patient();

        patient.setNamePatient("Poteau");
        patient.setFirstnamePatient("Florian");
        patient.setDobPatient(new Date());
        patient.setSecuritySocialNumberPatient("1923929392");


        // Vérifie si l'objet patient n'est pas null
        assertNotNull(patient);

        // Vérifie si les valeurs définit dans l'objet patient correspond aux valeurs attendues
        assertEquals("Poteau", patient.getNamePatient());
        assertEquals("Florian", patient.getFirstnamePatient());
        assertNotNull(patient.getDobPatient());
        assertEquals("1923929392", patient.getSecuritySocialNumberPatient());

    }
}