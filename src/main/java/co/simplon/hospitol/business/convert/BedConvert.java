package co.simplon.hospitol.business.convert;

import co.simplon.hospitol.business.dto.BedDTO;
import co.simplon.hospitol.persistance.entity.Bed;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for converting between Bed entity objects and BedDTO data transfer objects.
 */
public class BedConvert {


    private static BedConvert instance;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private BedConvert() {

    }

    /**
     * Retrieves the singleton instance of BedConvert class.
     *
     * @return The singleton instance of BedConvert class.
     */
    public static BedConvert getInstance() {
        if (instance == null)
            instance = new BedConvert();
        return instance;
    }

    /**
     * Converts a Bed entity object to a BedDTO object.
     *
     * @param entity The Bed entity object to be converted.
     * @return The corresponding BedDTO object.
     */
    public BedDTO convertEntityToDto(final Bed entity) {
        final BedDTO dto = new BedDTO();
        dto.setId(entity.getId());
        dto.setNumbers(entity.getNumbers());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());
        dto.setBedrooms(entity.getBedrooms());

        return dto;
    }

    /**
     * Converts a BedDTO object to a Bed entity object.
     *
     * @param dto The BedDTO object to be converted.
     * @return The corresponding Bed entity object.
     */
    public Bed convertDtoToEntity(final BedDTO dto) {
        final Bed entity = new Bed();
        entity.setId(dto.getId());
        entity.setNumbers(dto.getNumbers());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());
        entity.setBedrooms(dto.getBedrooms());

        return entity;
    }

    /**
     * Converts a list of Bed entity objects to a list of BedDTO objects.
     *
     * @param listEntities The list of Bed entity objects to be converted.
     * @return The corresponding list of BedDTO objects.
     */
    public List<BedDTO> convertListEntityToListDto(final List<Bed> listEntities) {
        final List<BedDTO> listeDto = new ArrayList<>();
        for(final Bed entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Converts a list of BedDTO objects to a list of Bed entity objects.
     *
     * @param listDto The list of BedDTO objects to be converted.
     * @return The corresponding list of Bed entity objects.
     */
    public List<Bed> convertListDtoToListEntity(final List<BedDTO> listDto) {
        final List<Bed> listeEntities = new ArrayList<>();
        for(final BedDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
