package co.simplon.hospitol.business.convert;



import co.simplon.hospitol.business.dto.ServiceDTO;
import co.simplon.hospitol.persistance.entity.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for converting between Service entity objects and ServiceDTO data transfer objects.
 */
public class ServiceConvert {

    private static ServiceConvert instance;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private ServiceConvert() {

    }

    /**
     * Retrieves the singleton instance of ServiceConvert class.
     *
     * @return The singleton instance of ServiceConvert class.
     */
    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }


    /**
     * Converts a Service entity object to a ServiceDTO object.
     *
     * @param entity The Service entity object to be converted.
     * @return The corresponding ServiceDTO object.
     */
    public ServiceDTO convertEntityToDto(final Service entity) {
        final ServiceDTO dto = new ServiceDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());

        return dto;
    }

    /**
     * Converts a ServiceDTO object to a Service entity object.
     *
     * @param dto The ServiceDTO object to be converted.
     * @return The corresponding Service entity object.
     */
    public Service convertDtoToEntity(final ServiceDTO dto) {
        final Service entity = new Service();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());

        return entity;
    }

    /**
     * Converts a list of Service entity objects to a list of ServiceDTO objects.
     *
     * @param listEntities The list of Service entity objects to be converted.
     * @return The corresponding list of ServiceDTO objects.
     */
    public List<ServiceDTO> convertListEntityToListDto(final List<Service> listEntities) {
        final List<ServiceDTO> listeDto = new ArrayList<>();
        for(final Service entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Converts a list of ServiceDTO objects to a list of Service entity objects.
     *
     * @param listDto The list of ServiceDTO objects to be converted.
     * @return The corresponding list of Service entity objects.
     */
    public List<Service> convertListDtoToListEntity(final List<ServiceDTO> listDto) {
        final List<Service> listeEntities = new ArrayList<>();
        for(final ServiceDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
