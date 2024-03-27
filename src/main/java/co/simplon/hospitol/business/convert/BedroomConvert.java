package co.simplon.hospitol.business.convert;

import co.simplon.hospitol.business.dto.BedroomDTO;
import co.simplon.hospitol.persistance.entity.Bedroom;

import java.util.ArrayList;
import java.util.List;

public class BedroomConvert {
    private static BedroomConvert instance;

    private BedroomConvert() {

    }
    public static BedroomConvert getInstance() {
        if (instance == null)
            instance = new BedroomConvert();
        return instance;
    }


    public BedroomDTO convertEntityToDto(final Bedroom entity) {
        final BedroomDTO dto = new BedroomDTO();
        dto.setId_bedroom(entity.getId());
        dto.setNumbers(entity.getNumbers());
        dto.setCreationDT(entity.getCreationDT());
        dto.setModificationDT(entity.getModificationDT());

        return dto;
    }

    public Bedroom convertDtoToEntity(final BedroomDTO dto) {
        final Bedroom entity = new Bedroom();
        entity.setId(dto.getId_bedroom());
        entity.setNumbers(dto.getNumbers());
        entity.setCreationDT(dto.getCreationDT());
        entity.setModificationDT(dto.getModificationDT());

        return entity;
    }

    public List<BedroomDTO> convertListEntityToListDto(final List<Bedroom> listEntities) {
        final List<BedroomDTO> listeDto = new ArrayList<>();
        for(final Bedroom entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Bedroom> convertListDtoToListEntity(final List<BedroomDTO> listDto) {
        final List<Bedroom> listeEntities = new ArrayList<>();
        for(final BedroomDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }
}
