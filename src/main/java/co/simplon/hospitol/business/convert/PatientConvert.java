package co.simplon.hospitol.business.convert;


import java.util.List;
import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.persistance.entity.Patient;

import java.util.ArrayList;


/**
 * Utility class for converting between Patient entity objects and PatientDTO data transfer objects.
 */
public class PatientConvert {

    private static PatientConvert instance;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private PatientConvert() {

    }

    /**
     * Retrieves the singleton instance of PatientConvert class.
     *
     * @return The singleton instance of PatientConvert class.
     */
    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }

    /**
     * Converts a Patient entity object to a PatientDTO object.
     *
     * @param entity The Patient entity object to be converted.
     * @return The corresponding PatientDTO object.
     */
    public PatientDTO convertEntityToDto(final Patient entity) {
        final PatientDTO dto = new PatientDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setFirstname(entity.getFirstname());
        dto.setDob(entity.getDob());
        dto.setSecuritySocialNumber(entity.getSecuritySocialNumber());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());
        dto.setServices(entity.getServices());
        dto.setBeds(entity.getBeds());

        return dto;
    }

    /**
     * Converts a PatientDTO object to a Patient entity object.
     *
     * @param dto The PatientDTO object to be converted.
     * @return The corresponding Patient entity object.
     */
    public Patient convertDtoToEntity(final PatientDTO dto) {
        final Patient entity = new Patient();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setFirstname(dto.getFirstname());
        entity.setDob(dto.getDob());
        entity.setSecuritySocialNumber(dto.getSecuritySocialNumber());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());
        entity.setServices(dto.getServices());
        entity.setBeds(dto.getBeds());

        return entity;
    }

    /**
     * Converts a list of Patient entity objects to a list of PatientDTO objects.
     *
     * @param listEntities The list of Patient entity objects to be converted.
     * @return The corresponding list of PatientDTO objects.
     */
    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> listeDto = new ArrayList<>();
        for(final Patient entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Converts a list of PatientDTO objects to a list of Patient entity objects.
     *
     * @param listDto The list of PatientDTO objects to be converted.
     * @return The corresponding list of Patient entity objects.
     */
    public List<Patient> convertListDtoToListEntity(final List<PatientDTO> listDto) {
        final List<Patient> listeEntities = new ArrayList<>();
        for(final PatientDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
