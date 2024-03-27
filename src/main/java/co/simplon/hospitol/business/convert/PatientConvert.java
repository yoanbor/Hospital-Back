package co.simplon.hospitol.business.convert;


import java.util.List;
import co.simplon.hospitol.business.dto.PatientDTO;
import co.simplon.hospitol.persistance.entity.Patient;

import java.util.ArrayList;


public class PatientConvert {

    private static PatientConvert instance;

    private PatientConvert() {

    }
    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }


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

    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> listeDto = new ArrayList<>();
        for(final Patient entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Patient> convertListDtoToListEntity(final List<PatientDTO> listDto) {
        final List<Patient> listeEntities = new ArrayList<>();
        for(final PatientDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
