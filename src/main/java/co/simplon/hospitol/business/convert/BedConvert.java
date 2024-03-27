package co.simplon.hospitol.business.convert;

import co.simplon.hospitol.business.dto.BedDTO;
import co.simplon.hospitol.persistance.entity.Bed;

import java.util.ArrayList;
import java.util.List;

public class BedConvert {


    private static BedConvert instance;

    private BedConvert() {

    }
    public static BedConvert getInstance() {
        if (instance == null)
            instance = new BedConvert();
        return instance;
    }


    public BedDTO convertEntityToDto(final Bed entity) {
        final BedDTO dto = new BedDTO();
        dto.setId_bed(entity.getId());
        dto.setNumbers(entity.getNumbers());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());
        dto.setBedrooms(entity.getBedrooms());

        return dto;
    }

    public Bed convertDtoToEntity(final BedDTO dto) {
        final Bed entity = new Bed();
        entity.setId(dto.getId_bed());
        entity.setNumbers(dto.getNumbers());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());
        entity.setBedrooms(dto.getBedrooms());

        return entity;
    }

    public List<BedDTO> convertListEntityToListDto(final List<Bed> listEntities) {
        final List<BedDTO> listeDto = new ArrayList<>();
        for(final Bed entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Bed> convertListDtoToListEntity(final List<BedDTO> listDto) {
        final List<Bed> listeEntities = new ArrayList<>();
        for(final BedDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
