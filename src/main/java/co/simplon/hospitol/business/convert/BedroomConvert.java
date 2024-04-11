package co.simplon.hospitol.business.convert;

import co.simplon.hospitol.business.dto.BedroomDTO;
import co.simplon.hospitol.persistance.entity.Bedroom;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for converting between Bedroom entity objects and BedroomDTO data transfer objects.
 */
public class BedroomConvert {
    private static BedroomConvert instance;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private BedroomConvert() {

    }

    /**
     * Retrieves the singleton instance of BedroomConvert class.
     *
     * @return The singleton instance of BedroomConvert class.
     */
    public static BedroomConvert getInstance() {
        if (instance == null)
            instance = new BedroomConvert();
        return instance;
    }

    /**
     * Converts a Bedroom entity object to a BedroomDTO object.
     *
     * @param entity The Bedroom entity object to be converted.
     * @return The corresponding BedroomDTO object.
     */
    public BedroomDTO convertEntityToDto(final Bedroom entity) {
        final BedroomDTO dto = new BedroomDTO();
        dto.setIdBedroom(entity.getIdBedroom());
        dto.setNumbersBedroom(entity.getNumbersBedroom());

        return dto;
    }

    /**
     * Converts a BedroomDTO object to a Bedroom entity object.
     *
     * @param dto The BedroomDTO object to be converted.
     * @return The corresponding Bedroom entity object.
     */
    public Bedroom convertDtoToEntity(final BedroomDTO dto) {
        final Bedroom entity = new Bedroom();
        entity.setIdBedroom(dto.getIdBedroom());
        entity.setNumbersBedroom(dto.getNumbersBedroom());

        return entity;
    }

    /**
     * Converts a list of Bedroom entity objects to a list of BedroomDTO objects.
     *
     * @param listEntities The list of Bedroom entity objects to be converted.
     * @return The corresponding list of BedroomDTO objects.
     */
    public List<BedroomDTO> convertListEntityToListDto(final List<Bedroom> listEntities) {
        final List<BedroomDTO> listeDto = new ArrayList<>();
        for(final Bedroom entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Converts a list of BedroomDTO objects to a list of Bedroom entity objects.
     *
     * @param listDto The list of BedroomDTO objects to be converted.
     * @return The corresponding list of Bedroom entity objects.
     */
    public List<Bedroom> convertListDtoToListEntity(final List<BedroomDTO> listDto) {
        final List<Bedroom> listeEntities = new ArrayList<>();
        for(final BedroomDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
