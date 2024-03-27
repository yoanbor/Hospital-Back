package co.simplon.hospitol.business.convert;



import co.simplon.hospitol.business.dto.ServiceDTO;
import co.simplon.hospitol.persistance.entity.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceConvert {

    private static ServiceConvert instance;

    private ServiceConvert() {

    }
    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }


    public ServiceDTO convertEntityToDto(final Service entity) {
        final ServiceDTO dto = new ServiceDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());

        return dto;
    }

    public Service convertDtoToEntity(final ServiceDTO dto) {
        final Service entity = new Service();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());

        return entity;
    }

    public List<ServiceDTO> convertListEntityToListDto(final List<Service> listEntities) {
        final List<ServiceDTO> listeDto = new ArrayList<>();
        for(final Service entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Service> convertListDtoToListEntity(final List<ServiceDTO> listDto) {
        final List<Service> listeEntities = new ArrayList<>();
        for(final ServiceDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
